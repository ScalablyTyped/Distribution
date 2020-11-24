package typings.jju.mod

import typings.jju.jjuStrings.`throw`
import typings.jju.jjuStrings.cjson
import typings.jju.jjuStrings.ignore
import typings.jju.jjuStrings.json
import typings.jju.jjuStrings.json5
import typings.jju.jjuStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends js.Object {
  
  /**
    * Operation mode (default 'json5'). Set to 'json' if you want to throw on non-strict json files.
    */
  var mode: js.UndefOr[json5 | json | cjson] = js.native
  
  /**
    * Create object as `Object.create(null)` instead of `{}`.
    * - If reserved_keys != 'replace', default is false.
    * - If reserved_keys == 'replace', default is true.
    *
    * It is usually unsafe and not recommended to change this option to false in the last case.
    */
  var null_prototype: js.UndefOr[Boolean] = js.native
  
  /**
    * What to do with reserved keys (default 'ignore').
    * - "ignore" - ignore reserved keys
    * - "throw" - throw SyntaxError in case of reserved keys
    * - "replace" - replace reserved keys, this is the default JSON.parse behaviour, unsafe
    */
  var reserved_keys: js.UndefOr[ignore | `throw` | replace] = js.native
  
  /**
    * Reviver function (follows the JSON spec). This function is called for each member of the object.
    * If a member contains nested objects, the nested objects are transformed before the parent object is.
    */
  var reviver: js.UndefOr[js.Function2[/* key */ js.Any, /* value */ js.Any, _]] = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def setMode(value: json5 | json | cjson): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNull_prototype(value: Boolean): Self = this.set("null_prototype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNull_prototype: Self = this.set("null_prototype", js.undefined)
    
    @scala.inline
    def setReserved_keys(value: ignore | `throw` | replace): Self = this.set("reserved_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserved_keys: Self = this.set("reserved_keys", js.undefined)
    
    @scala.inline
    def setReviver(value: (/* key */ js.Any, /* value */ js.Any) => _): Self = this.set("reviver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReviver: Self = this.set("reviver", js.undefined)
  }
}
