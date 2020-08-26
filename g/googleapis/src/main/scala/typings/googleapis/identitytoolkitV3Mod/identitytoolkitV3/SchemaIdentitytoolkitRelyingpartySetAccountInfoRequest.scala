package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to set the account information.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySetAccountInfoRequest extends js.Object {
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
  implicit class SchemaIdentitytoolkitRelyingpartySetAccountInfoRequestOps[Self <: SchemaIdentitytoolkitRelyingpartySetAccountInfoRequest] (val x: Self) extends AnyVal {
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
    def setCaptchaChallenge(value: String): Self = this.set("captchaChallenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptchaChallenge: Self = this.set("captchaChallenge", js.undefined)
    @scala.inline
    def setCaptchaResponse(value: String): Self = this.set("captchaResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptchaResponse: Self = this.set("captchaResponse", js.undefined)
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setCustomAttributes(value: String): Self = this.set("customAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAttributes: Self = this.set("customAttributes", js.undefined)
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = this.set("delegatedProjectNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegatedProjectNumber: Self = this.set("delegatedProjectNumber", js.undefined)
    @scala.inline
    def setDeleteAttributeVarargs(value: String*): Self = this.set("deleteAttribute", js.Array(value :_*))
    @scala.inline
    def setDeleteAttribute(value: js.Array[String]): Self = this.set("deleteAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteAttribute: Self = this.set("deleteAttribute", js.undefined)
    @scala.inline
    def setDeleteProviderVarargs(value: String*): Self = this.set("deleteProvider", js.Array(value :_*))
    @scala.inline
    def setDeleteProvider(value: js.Array[String]): Self = this.set("deleteProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteProvider: Self = this.set("deleteProvider", js.undefined)
    @scala.inline
    def setDisableUser(value: Boolean): Self = this.set("disableUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableUser: Self = this.set("disableUser", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmailVerified(value: Boolean): Self = this.set("emailVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailVerified: Self = this.set("emailVerified", js.undefined)
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setLastLoginAt(value: String): Self = this.set("lastLoginAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastLoginAt: Self = this.set("lastLoginAt", js.undefined)
    @scala.inline
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalId: Self = this.set("localId", js.undefined)
    @scala.inline
    def setOobCode(value: String): Self = this.set("oobCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOobCode: Self = this.set("oobCode", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    @scala.inline
    def setProviderVarargs(value: String*): Self = this.set("provider", js.Array(value :_*))
    @scala.inline
    def setProvider(value: js.Array[String]): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setReturnSecureToken(value: Boolean): Self = this.set("returnSecureToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnSecureToken: Self = this.set("returnSecureToken", js.undefined)
    @scala.inline
    def setUpgradeToFederatedLogin(value: Boolean): Self = this.set("upgradeToFederatedLogin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgradeToFederatedLogin: Self = this.set("upgradeToFederatedLogin", js.undefined)
    @scala.inline
    def setValidSince(value: String): Self = this.set("validSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidSince: Self = this.set("validSince", js.undefined)
  }
  
}

