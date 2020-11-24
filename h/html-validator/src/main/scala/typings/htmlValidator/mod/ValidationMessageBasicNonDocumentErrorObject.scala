package typings.htmlValidator.mod

import typings.htmlValidator.htmlValidatorStrings.`non-document-error`
import typings.htmlValidator.htmlValidatorStrings.internal
import typings.htmlValidator.htmlValidatorStrings.io
import typings.htmlValidator.htmlValidatorStrings.schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationMessageBasicNonDocumentErrorObject extends js.Object {
  
  var subType: js.UndefOr[internal | io | schema] = js.native
  
  var `type`: `non-document-error` = js.native
}
object ValidationMessageBasicNonDocumentErrorObject {
  
  @scala.inline
  def apply(`type`: `non-document-error`): ValidationMessageBasicNonDocumentErrorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationMessageBasicNonDocumentErrorObject]
  }
  
  @scala.inline
  implicit class ValidationMessageBasicNonDocumentErrorObjectOps[Self <: ValidationMessageBasicNonDocumentErrorObject] (val x: Self) extends AnyVal {
    
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
    def setType(value: `non-document-error`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubType(value: internal | io | schema): Self = this.set("subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubType: Self = this.set("subType", js.undefined)
  }
}
