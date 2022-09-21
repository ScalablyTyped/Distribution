package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse extends StObject {
  
  var expiresIn: js.UndefOr[String | Null] = js.undefined
  
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  var isNewUser: js.UndefOr[Boolean | Null] = js.undefined
  
  var localId: js.UndefOr[String | Null] = js.undefined
  
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  var refreshToken: js.UndefOr[String | Null] = js.undefined
  
  var temporaryProof: js.UndefOr[String | Null] = js.undefined
  
  var temporaryProofExpiresIn: js.UndefOr[String | Null] = js.undefined
  
  var verificationProof: js.UndefOr[String | Null] = js.undefined
  
  var verificationProofExpiresIn: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse](x: Self) {
    
    inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInNull: Self = StObject.set(x, "expiresIn", null)
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    inline def setIsNewUserNull: Self = StObject.set(x, "isNewUser", null)
    
    inline def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdNull: Self = StObject.set(x, "localId", null)
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenNull: Self = StObject.set(x, "refreshToken", null)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setTemporaryProof(value: String): Self = StObject.set(x, "temporaryProof", value.asInstanceOf[js.Any])
    
    inline def setTemporaryProofExpiresIn(value: String): Self = StObject.set(x, "temporaryProofExpiresIn", value.asInstanceOf[js.Any])
    
    inline def setTemporaryProofExpiresInNull: Self = StObject.set(x, "temporaryProofExpiresIn", null)
    
    inline def setTemporaryProofExpiresInUndefined: Self = StObject.set(x, "temporaryProofExpiresIn", js.undefined)
    
    inline def setTemporaryProofNull: Self = StObject.set(x, "temporaryProof", null)
    
    inline def setTemporaryProofUndefined: Self = StObject.set(x, "temporaryProof", js.undefined)
    
    inline def setVerificationProof(value: String): Self = StObject.set(x, "verificationProof", value.asInstanceOf[js.Any])
    
    inline def setVerificationProofExpiresIn(value: String): Self = StObject.set(x, "verificationProofExpiresIn", value.asInstanceOf[js.Any])
    
    inline def setVerificationProofExpiresInNull: Self = StObject.set(x, "verificationProofExpiresIn", null)
    
    inline def setVerificationProofExpiresInUndefined: Self = StObject.set(x, "verificationProofExpiresIn", js.undefined)
    
    inline def setVerificationProofNull: Self = StObject.set(x, "verificationProof", null)
    
    inline def setVerificationProofUndefined: Self = StObject.set(x, "verificationProof", js.undefined)
  }
}
