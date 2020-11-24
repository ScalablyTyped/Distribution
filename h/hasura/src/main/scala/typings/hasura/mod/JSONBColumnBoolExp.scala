package typings.hasura.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONBColumnBoolExp extends ColumnBoolExp[String] {
  
  var _contained_in: js.UndefOr[String] = js.native
  
  var _contains: js.UndefOr[String] = js.native
  
  var _has_key: js.UndefOr[String] = js.native
  
  var _has_keys_all: js.UndefOr[String] = js.native
  
  var _has_keys_any: js.UndefOr[String] = js.native
}
object JSONBColumnBoolExp {
  
  @scala.inline
  def apply(): JSONBColumnBoolExp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONBColumnBoolExp]
  }
  
  @scala.inline
  implicit class JSONBColumnBoolExpOps[Self <: JSONBColumnBoolExp] (val x: Self) extends AnyVal {
    
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
    def set_contained_in(value: String): Self = this.set("_contained_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_contained_in: Self = this.set("_contained_in", js.undefined)
    
    @scala.inline
    def set_contains(value: String): Self = this.set("_contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_contains: Self = this.set("_contains", js.undefined)
    
    @scala.inline
    def set_has_key(value: String): Self = this.set("_has_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_has_key: Self = this.set("_has_key", js.undefined)
    
    @scala.inline
    def set_has_keys_all(value: String): Self = this.set("_has_keys_all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_has_keys_all: Self = this.set("_has_keys_all", js.undefined)
    
    @scala.inline
    def set_has_keys_any(value: String): Self = this.set("_has_keys_any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_has_keys_any: Self = this.set("_has_keys_any", js.undefined)
  }
}
