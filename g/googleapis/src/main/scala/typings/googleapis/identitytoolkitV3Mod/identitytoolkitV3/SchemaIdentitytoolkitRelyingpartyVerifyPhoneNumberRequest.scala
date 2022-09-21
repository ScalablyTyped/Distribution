package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberRequest extends StObject {
  
  var code: js.UndefOr[String | Null] = js.undefined
  
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  var operation: js.UndefOr[String | Null] = js.undefined
  
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The session info previously returned by IdentityToolkit-SendVerificationCode.
    */
  var sessionInfo: js.UndefOr[String | Null] = js.undefined
  
  var temporaryProof: js.UndefOr[String | Null] = js.undefined
  
  var verificationProof: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberRequest {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberRequest]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberRequest](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationNull: Self = StObject.set(x, "operation", null)
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoNull: Self = StObject.set(x, "sessionInfo", null)
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
    
    inline def setTemporaryProof(value: String): Self = StObject.set(x, "temporaryProof", value.asInstanceOf[js.Any])
    
    inline def setTemporaryProofNull: Self = StObject.set(x, "temporaryProof", null)
    
    inline def setTemporaryProofUndefined: Self = StObject.set(x, "temporaryProof", js.undefined)
    
    inline def setVerificationProof(value: String): Self = StObject.set(x, "verificationProof", value.asInstanceOf[js.Any])
    
    inline def setVerificationProofNull: Self = StObject.set(x, "verificationProof", null)
    
    inline def setVerificationProofUndefined: Self = StObject.set(x, "verificationProof", js.undefined)
  }
}
