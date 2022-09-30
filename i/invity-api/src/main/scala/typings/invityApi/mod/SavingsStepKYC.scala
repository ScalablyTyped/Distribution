package typings.invityApi.mod

import typings.invityApi.invityApiStrings.ClientApp
import typings.invityApi.invityApiStrings.External
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsStepKYC
  extends StObject
     with SavingsStepEnabled {
  
  /**
    * Determines way KYC document upload.
    * - ClientApp - we are handover the KYC documents to partner right from the user
    * - External - upload is managed fully by our partner
    */
  var documentUploadType: ClientApp | External
  
  var isWaitingForKYCResult: Boolean
}
object SavingsStepKYC {
  
  inline def apply(documentUploadType: ClientApp | External, isEnabled: Boolean, isWaitingForKYCResult: Boolean): SavingsStepKYC = {
    val __obj = js.Dynamic.literal(documentUploadType = documentUploadType.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isWaitingForKYCResult = isWaitingForKYCResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsStepKYC]
  }
  
  extension [Self <: SavingsStepKYC](x: Self) {
    
    inline def setDocumentUploadType(value: ClientApp | External): Self = StObject.set(x, "documentUploadType", value.asInstanceOf[js.Any])
    
    inline def setIsWaitingForKYCResult(value: Boolean): Self = StObject.set(x, "isWaitingForKYCResult", value.asInstanceOf[js.Any])
  }
}
