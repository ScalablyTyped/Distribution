package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.error
import typings.htmlValidator.htmlValidatorStrings.fatal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationMessageBasicErrorObject extends js.Object {
  
  var subType: js.UndefOr[fatal] = js.native
  
  var `type`: error = js.native
}
object ValidationMessageBasicErrorObject {
  
  @scala.inline
  def apply(`type`: error): ValidationMessageBasicErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicErrorObject]
  }
  
  @scala.inline
  implicit class ValidationMessageBasicErrorObjectOps[Self <: ValidationMessageBasicErrorObject] (val x: Self) extends AnyVal {
    
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
    def setType(value: error): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubType(value: fatal): Self = this.set("subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubType: Self = this.set("subType", js.undefined)
  }
}
