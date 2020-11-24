package typings.jsYaml.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DumpOptions extends js.Object {
  
  /**
    * if true flow sequences will be condensed, omitting the space between `key: value` or `a, b`. Eg. `'[a,b]'` or `{a:{b:c}}`.
    * Can be useful when using yaml for pretty URL query params as spaces are %-encoded. (default: false).
    */
  var condenseFlow: js.UndefOr[Boolean] = js.native
  
  /** specifies level of nesting, when to switch from block to flow style for collections. -1 means block style everwhere */
  var flowLevel: js.UndefOr[Double] = js.native
  
  /** indentation width to use (in spaces). */
  var indent: js.UndefOr[Double] = js.native
  
  /** set max line width. (default: 80) */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /** when true, will not add an indentation level to array elements */
  var noArrayIndent: js.UndefOr[Boolean] = js.native
  
  /** if true don't try to be compatible with older yaml versions. Currently: don't quote "yes", "no" and so on, as required for YAML 1.1 (default: false) */
  var noCompatMode: js.UndefOr[Boolean] = js.native
  
  /** if true, don't convert duplicate objects into references (default: false) */
  var noRefs: js.UndefOr[Boolean] = js.native
  
  /** specifies a schema to use. */
  var schema: js.UndefOr[SchemaDefinition] = js.native
  
  /** do not throw on invalid types (like function in the safe schema) and skip pairs and single values with such types. */
  var skipInvalid: js.UndefOr[Boolean] = js.native
  
  /** if true, sort keys when dumping YAML. If a function, use the function to sort the keys. (default: false) */
  var sortKeys: js.UndefOr[Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.native
  
  /** Each tag may have own set of styles.    - "tag" => "style" map. */
  var styles: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object DumpOptions {
  
  @scala.inline
  def apply(): DumpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DumpOptions]
  }
  
  @scala.inline
  implicit class DumpOptionsOps[Self <: DumpOptions] (val x: Self) extends AnyVal {
    
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
    def setCondenseFlow(value: Boolean): Self = this.set("condenseFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondenseFlow: Self = this.set("condenseFlow", js.undefined)
    
    @scala.inline
    def setFlowLevel(value: Double): Self = this.set("flowLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowLevel: Self = this.set("flowLevel", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setNoArrayIndent(value: Boolean): Self = this.set("noArrayIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoArrayIndent: Self = this.set("noArrayIndent", js.undefined)
    
    @scala.inline
    def setNoCompatMode(value: Boolean): Self = this.set("noCompatMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCompatMode: Self = this.set("noCompatMode", js.undefined)
    
    @scala.inline
    def setNoRefs(value: Boolean): Self = this.set("noRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRefs: Self = this.set("noRefs", js.undefined)
    
    @scala.inline
    def setSchema(value: SchemaDefinition): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSkipInvalid(value: Boolean): Self = this.set("skipInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipInvalid: Self = this.set("skipInvalid", js.undefined)
    
    @scala.inline
    def setSortKeysFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("sortKeys", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortKeys(value: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = this.set("sortKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortKeys: Self = this.set("sortKeys", js.undefined)
    
    @scala.inline
    def setStyles(value: StringDictionary[js.Any]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
