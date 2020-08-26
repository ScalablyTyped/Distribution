package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to verify the password.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest extends js.Object {
  /**
    * The captcha challenge.
    */
  var captchaChallenge: js.UndefOr[String] = js.native
  /**
    * Response to the captcha.
    */
  var captchaResponse: js.UndefOr[String] = js.native
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The password inputed by the user.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The GITKit token for the non-trusted IDP, which is to be confirmed by the
    * user.
    */
  var pendingIdToken: js.UndefOr[String] = js.native
  /**
    * Whether return sts id token and refresh token instead of gitkit token.
    */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  /**
    * For multi-tenant use cases, in order to construct sign-in URL with the
    * correct IDP parameters, Firebear needs to know which Tenant to retrieve
    * IDP configs from.
    */
  var tenantId: js.UndefOr[String] = js.native
  /**
    * Tenant project number to be used for idp discovery.
    */
  var tenantProjectNumber: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequestOps[Self <: SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest] (val x: Self) extends AnyVal {
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
    def setDelegatedProjectNumber(value: String): Self = this.set("delegatedProjectNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegatedProjectNumber: Self = this.set("delegatedProjectNumber", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPendingIdToken(value: String): Self = this.set("pendingIdToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingIdToken: Self = this.set("pendingIdToken", js.undefined)
    @scala.inline
    def setReturnSecureToken(value: Boolean): Self = this.set("returnSecureToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnSecureToken: Self = this.set("returnSecureToken", js.undefined)
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    @scala.inline
    def setTenantProjectNumber(value: String): Self = this.set("tenantProjectNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTenantProjectNumber: Self = this.set("tenantProjectNumber", js.undefined)
  }
  
}

