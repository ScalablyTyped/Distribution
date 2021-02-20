package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to set the account information.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySetAccountInfoRequest extends StObject {
  
  /**
    * The captcha challenge.
    */
  var captchaChallenge: js.UndefOr[String] = js.native
  
  /**
    * Response to the captcha.
    */
  var captchaResponse: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the account is created.
    */
  var createdAt: js.UndefOr[String] = js.native
  
  /**
    * The custom attributes to be set in the user&#39;s id token.
    */
  var customAttributes: js.UndefOr[String] = js.native
  
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  
  /**
    * The attributes users request to delete.
    */
  var deleteAttribute: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The IDPs the user request to delete.
    */
  var deleteProvider: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether to disable the user.
    */
  var disableUser: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Mark the email as verified or not.
    */
  var emailVerified: js.UndefOr[Boolean] = js.native
  
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * Last login timestamp.
    */
  var lastLoginAt: js.UndefOr[String] = js.native
  
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
  
  /**
    * The out-of-band code of the change email request.
    */
  var oobCode: js.UndefOr[String] = js.native
  
  /**
    * The new password of the user.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Privileged caller can update user with specified phone number.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * The photo url of the user.
    */
  var photoUrl: js.UndefOr[String] = js.native
  
  /**
    * The associated IDPs of the user.
    */
  var provider: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether return sts id token and refresh token instead of gitkit token.
    */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  
  /**
    * Mark the user to upgrade to federated login.
    */
  var upgradeToFederatedLogin: js.UndefOr[Boolean] = js.native
  
  /**
    * Timestamp in seconds for valid login token.
    */
  var validSince: js.UndefOr[String] = js.native
}
object SchemaIdentitytoolkitRelyingpartySetAccountInfoRequest {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySetAccountInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySetAccountInfoRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySetAccountInfoRequestMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartySetAccountInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptchaChallenge(value: String): Self = StObject.set(x, "captchaChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptchaChallengeUndefined: Self = StObject.set(x, "captchaChallenge", js.undefined)
    
    @scala.inline
    def setCaptchaResponse(value: String): Self = StObject.set(x, "captchaResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptchaResponseUndefined: Self = StObject.set(x, "captchaResponse", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setCustomAttributes(value: String): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setDeleteAttribute(value: js.Array[String]): Self = StObject.set(x, "deleteAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAttributeUndefined: Self = StObject.set(x, "deleteAttribute", js.undefined)
    
    @scala.inline
    def setDeleteAttributeVarargs(value: String*): Self = StObject.set(x, "deleteAttribute", js.Array(value :_*))
    
    @scala.inline
    def setDeleteProvider(value: js.Array[String]): Self = StObject.set(x, "deleteProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteProviderUndefined: Self = StObject.set(x, "deleteProvider", js.undefined)
    
    @scala.inline
    def setDeleteProviderVarargs(value: String*): Self = StObject.set(x, "deleteProvider", js.Array(value :_*))
    
    @scala.inline
    def setDisableUser(value: Boolean): Self = StObject.set(x, "disableUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableUserUndefined: Self = StObject.set(x, "disableUser", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setLastLoginAt(value: String): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastLoginAtUndefined: Self = StObject.set(x, "lastLoginAt", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    @scala.inline
    def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setProvider(value: js.Array[String]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    @scala.inline
    def setProviderVarargs(value: String*): Self = StObject.set(x, "provider", js.Array(value :_*))
    
    @scala.inline
    def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnSecureTokenUndefined: Self = StObject.set(x, "returnSecureToken", js.undefined)
    
    @scala.inline
    def setUpgradeToFederatedLogin(value: Boolean): Self = StObject.set(x, "upgradeToFederatedLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeToFederatedLoginUndefined: Self = StObject.set(x, "upgradeToFederatedLogin", js.undefined)
    
    @scala.inline
    def setValidSince(value: String): Self = StObject.set(x, "validSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidSinceUndefined: Self = StObject.set(x, "validSince", js.undefined)
  }
}
