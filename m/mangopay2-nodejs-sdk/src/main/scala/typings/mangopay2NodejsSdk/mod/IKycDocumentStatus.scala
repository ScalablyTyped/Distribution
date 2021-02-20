package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKycDocumentStatus extends StObject {
  
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
  implicit class IKycDocumentStatusMutableBuilder[Self <: IKycDocumentStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: CREATED): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefused(value: REFUSED): Self = StObject.set(x, "Refused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidated(value: VALIDATED): Self = StObject.set(x, "Validated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationAsked(value: VALIDATION_ASKED): Self = StObject.set(x, "ValidationAsked", value.asInstanceOf[js.Any])
  }
}
