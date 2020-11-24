package typings.jsonFormData.mod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Formatting options for modifying the final generated FormData object.
  *
  * ## Defaults
  *
  *     const defaultOpts = {
  *       initialFormData: new FormData(),
  *       showLeafArrayIndexes: true,
  *       includeNullValues: false,
  *       mapping: value => {
  *         if (typeof value === 'boolean') {
  *           return +value ? '1' : '0';
  *         }
  *
  *         return value;
  *       }
  *     }
  */
@js.native
trait FormatOptions extends js.Object {
  
  /**
    * Include null values in output (default: `false`).
    *
    * ## Examples
    *
    *     const json = { foo: 1, bar: null };
    *     const withoutNullValues = asFormData(json, { includeNullValues: false });
    *     // => FormData {
    *     //   foo: '1'
    *     // }
    *     const withNullValues = asFormData(json, { includeNullValues: true });
    *     // => FormData {
    *     //   foo: '1'
    *     //   bar: 'null'
    *     // }
    *
    */
  var includeNullValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Existing form data which values will be appended to  (default: `new FormData()`).
    * This can be used to support environments that do not have a global FormData object.
    */
  var initialFormData: js.UndefOr[InitialFormData] = js.native
  
  /**
    * Modify outmost leaf values before calling formData.append. Default behaviour
    * is to output boolean values as '1'/'0' (true/false) and all other values
    * without modification.
    *
    * ## Examples
    *
    *     const json = { foo: true, bar: false };
    *     const data = asFormData(json);
    *     // => FormData {
    *     //   foo: '1',
    *     //   bar: '0',
    *     // }
    *     const mapping = value => `foo_${value}`;
    *     const custom = asFormData(json, { mapping });
    *     // => FormData {
    *     //   foo: 'foo_true',
    *     //   bar: 'foo_false'
    *     // }
    *
    */
  var mapping: js.UndefOr[js.Function1[/* value */ ValidJSONValue, String | Blob]] = js.native
  
  /**
    * Include index values in arrays (default: `true`).
    *
    * ## Examples
    *
    *     const json = { ids: [1, 2, 3] };
    *     const withArrayIndices = asFormData(json, { showLeafArrayIndex: true });
    *     // => FormData {
    *     //   ids[0]: '1',
    *     //   ids[1]: '2',
    *     //   ids[2]: '3',
    *     // }
    *     const withoutArrayIndices = asFormData(json, { showLeafArrayIndex: false });
    *     // => FormData {
    *     //   ids[]: '1',
    *     //   ids[]: '2',
    *     //   ids[]: '3',
    *     // }
    *
    */
  var showLeafArrayIndexes: js.UndefOr[Boolean] = js.native
}
object FormatOptions {
  
  @scala.inline
  def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIncludeNullValues(value: Boolean): Self = this.set("includeNullValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNullValues: Self = this.set("includeNullValues", js.undefined)
    
    @scala.inline
    def setInitialFormData(value: InitialFormData): Self = this.set("initialFormData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFormData: Self = this.set("initialFormData", js.undefined)
    
    @scala.inline
    def setMapping(value: /* value */ ValidJSONValue => String | Blob): Self = this.set("mapping", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
    
    @scala.inline
    def setShowLeafArrayIndexes(value: Boolean): Self = this.set("showLeafArrayIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLeafArrayIndexes: Self = this.set("showLeafArrayIndexes", js.undefined)
  }
}
