package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKycDocumentStatus extends js.Object {
  
  var Created: CREATED = js.native
  
  var Refused: REFUSED = js.native
  
  var Validated: VALIDATED = js.native
  
  var ValidationAsked: VALIDATION_ASKED = js.native
}
object IKycDocumentStatus {
  
  @scala.inline
  def apply(Created: CREATED, Refused: REFUSED, Validated: VALIDATED, ValidationAsked: VALIDATION_ASKED): IKycDocumentStatus = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], Refused = Refused.asInstanceOf[js.Any], Validated = Validated.asInstanceOf[js.Any], ValidationAsked = ValidationAsked.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKycDocumentStatus]
  }
  
  @scala.inline
  implicit class IKycDocumentStatusOps[Self <: IKycDocumentStatus] (val x: Self) extends AnyVal {
    
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
    def setCreated(value: CREATED): Self = this.set("Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefused(value: REFUSED): Self = this.set("Refused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidated(value: VALIDATED): Self = this.set("Validated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationAsked(value: VALIDATION_ASKED): Self = this.set("ValidationAsked", value.asInstanceOf[js.Any])
  }
}
