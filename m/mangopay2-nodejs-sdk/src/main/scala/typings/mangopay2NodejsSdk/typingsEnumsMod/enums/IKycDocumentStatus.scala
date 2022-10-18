package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKycDocumentStatus extends StObject {
  
  var Created: CREATED
  
  var Refused: REFUSED
  
  var Validated: VALIDATED
  
  var ValidationAsked: VALIDATION_ASKED
}
object IKycDocumentStatus {
  
  inline def apply(): IKycDocumentStatus = {
    val __obj = js.Dynamic.literal(Created = "CREATED", Refused = "REFUSED", Validated = "VALIDATED", ValidationAsked = "VALIDATION_ASKED")
    __obj.asInstanceOf[IKycDocumentStatus]
  }
  
  extension [Self <: IKycDocumentStatus](x: Self) {
    
    inline def setCreated(value: CREATED): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setRefused(value: REFUSED): Self = StObject.set(x, "Refused", value.asInstanceOf[js.Any])
    
    inline def setValidated(value: VALIDATED): Self = StObject.set(x, "Validated", value.asInstanceOf[js.Any])
    
    inline def setValidationAsked(value: VALIDATION_ASKED): Self = StObject.set(x, "ValidationAsked", value.asInstanceOf[js.Any])
  }
}
