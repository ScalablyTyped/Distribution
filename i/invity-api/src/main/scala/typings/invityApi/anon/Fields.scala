package typings.invityApi.anon

import typings.invityApi.invityApiStrings.GET
import typings.invityApi.invityApiStrings.IFRAME
import typings.invityApi.invityApiStrings.POST
import typings.invityApi.mod.StringMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends js.Object {
  
  var fields: StringMap = js.native
  
  var formAction: String = js.native
  
  var formMethod: GET | POST | IFRAME = js.native
}
object Fields {
  
  @scala.inline
  def apply(fields: StringMap, formAction: String, formMethod: GET | POST | IFRAME): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], formAction = formAction.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit class FieldsOps[Self <: Fields] (val x: Self) extends AnyVal {
    
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
    def setFields(value: StringMap): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormAction(value: String): Self = this.set("formAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormMethod(value: GET | POST | IFRAME): Self = this.set("formMethod", value.asInstanceOf[js.Any])
  }
}
