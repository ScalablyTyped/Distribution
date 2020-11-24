package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONEditorConstructorParams extends js.Object {
  
  var field: js.UndefOr[String] = js.native
  
  var fieldEditable: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object JSONEditorConstructorParams {
  
  @scala.inline
  def apply(): JSONEditorConstructorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorConstructorParams]
  }
  
  @scala.inline
  implicit class JSONEditorConstructorParamsOps[Self <: JSONEditorConstructorParams] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFieldEditable(value: Boolean): Self = this.set("fieldEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldEditable: Self = this.set("fieldEditable", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
