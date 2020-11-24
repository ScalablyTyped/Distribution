package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for Identitytoolkit-VerifyPhoneNumber
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse extends js.Object {
  
  var expiresIn: js.UndefOr[String] = js.native
  
  var idToken: js.UndefOr[String] = js.native
  
  var isNewUser: js.UndefOr[Boolean] = js.native
  
  var localId: js.UndefOr[String] = js.native
  
  var phoneNumber: js.UndefOr[String] = js.native
  
  var refreshToken: js.UndefOr[String] = js.native
  
  var temporaryProof: js.UndefOr[String] = js.native
  
  var temporaryProofExpiresIn: js.UndefOr[String] = js.native
  
  var verificationProof: js.UndefOr[String] = js.native
  
  var verificationProofExpiresIn: js.UndefOr[String] = js.native
}
object SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponseOps[Self <: SchemaIdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] (val x: Self) extends AnyVal {
    
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
    def setExpiresIn(value: String): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    
    @scala.inline
    def setIsNewUser(value: Boolean): Self = this.set("isNewUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNewUser: Self = this.set("isNewUser", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalId: Self = this.set("localId", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    
    @scala.inline
    def setTemporaryProof(value: String): Self = this.set("temporaryProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporaryProof: Self = this.set("temporaryProof", js.undefined)
    
    @scala.inline
    def setTemporaryProofExpiresIn(value: String): Self = this.set("temporaryProofExpiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporaryProofExpiresIn: Self = this.set("temporaryProofExpiresIn", js.undefined)
    
    @scala.inline
    def setVerificationProof(value: String): Self = this.set("verificationProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationProof: Self = this.set("verificationProof", js.undefined)
    
    @scala.inline
    def setVerificationProofExpiresIn(value: String): Self = this.set("verificationProofExpiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationProofExpiresIn: Self = this.set("verificationProofExpiresIn", js.undefined)
  }
}
