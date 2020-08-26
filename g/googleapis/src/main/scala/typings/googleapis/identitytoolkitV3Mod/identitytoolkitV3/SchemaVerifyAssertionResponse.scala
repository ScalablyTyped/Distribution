package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of verifying the IDP assertion.
  */
@js.native
trait SchemaVerifyAssertionResponse extends js.Object {
  /**
    * The action code.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * URL for OTA app installation.
    */
  var appInstallationUrl: js.UndefOr[String] = js.native
  /**
    * The custom scheme used by mobile app.
    */
  var appScheme: js.UndefOr[String] = js.native
  /**
    * The opaque value used by the client to maintain context info between the
    * authentication request and the IDP callback.
    */
  var context: js.UndefOr[String] = js.native
  /**
    * The birth date of the IdP account.
    */
  var dateOfBirth: js.UndefOr[String] = js.native
  /**
    * The display name of the user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email returned by the IdP. NOTE: The federated login user may not own
    * the email.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * It&#39;s true if the email is recycled.
    */
  var emailRecycled: js.UndefOr[Boolean] = js.native
  /**
    * The value is true if the IDP is also the email provider. It means the
    * user owns the email.
    */
  var emailVerified: js.UndefOr[Boolean] = js.native
  /**
    * Client error code.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * If idToken is STS id token, then this field will be expiration time of
    * STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String] = js.native
  /**
    * The unique ID identifies the IdP account.
    */
  var federatedId: js.UndefOr[String] = js.native
  /**
    * The first name of the user.
    */
  var firstName: js.UndefOr[String] = js.native
  /**
    * The full name of the user.
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * The ID token.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * It&#39;s the identifier param in the createAuthUri request if the
    * identifier is an email. It can be used to check whether the user input
    * email is different from the asserted email.
    */
  var inputEmail: js.UndefOr[String] = js.native
  /**
    * True if it&#39;s a new user sign-in, false if it&#39;s a returning user.
    */
  var isNewUser: js.UndefOr[Boolean] = js.native
  /**
    * The fixed string &quot;identitytoolkit#VerifyAssertionResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The language preference of the user.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The last name of the user.
    */
  var lastName: js.UndefOr[String] = js.native
  /**
    * The RP local ID if it&#39;s already been mapped to the IdP account
    * identified by the federated ID.
    */
  var localId: js.UndefOr[String] = js.native
  /**
    * Whether the assertion is from a non-trusted IDP and need account linking
    * confirmation.
    */
  var needConfirmation: js.UndefOr[Boolean] = js.native
  /**
    * Whether need client to supply email to complete the federated login flow.
    */
  var needEmail: js.UndefOr[Boolean] = js.native
  /**
    * The nick name of the user.
    */
  var nickName: js.UndefOr[String] = js.native
  /**
    * The OAuth2 access token.
    */
  var oauthAccessToken: js.UndefOr[String] = js.native
  /**
    * The OAuth2 authorization code.
    */
  var oauthAuthorizationCode: js.UndefOr[String] = js.native
  /**
    * The lifetime in seconds of the OAuth2 access token.
    */
  var oauthExpireIn: js.UndefOr[Double] = js.native
  /**
    * The OIDC id token.
    */
  var oauthIdToken: js.UndefOr[String] = js.native
  /**
    * The user approved request token for the OpenID OAuth extension.
    */
  var oauthRequestToken: js.UndefOr[String] = js.native
  /**
    * The scope for the OpenID OAuth extension.
    */
  var oauthScope: js.UndefOr[String] = js.native
  /**
    * The OAuth1 access token secret.
    */
  var oauthTokenSecret: js.UndefOr[String] = js.native
  /**
    * The original email stored in the mapping storage. It&#39;s returned when
    * the federated ID is associated to a different email.
    */
  var originalEmail: js.UndefOr[String] = js.native
  /**
    * The URI of the public accessible profiel picture.
    */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * The IdP ID. For white listed IdPs it&#39;s a short domain name e.g.
    * google.com, aol.com, live.net and yahoo.com. If the
    * &quot;providerId&quot; param is set to OpenID OP identifer other than the
    * whilte listed IdPs the OP identifier is returned. If the
    * &quot;identifier&quot; param is federated ID in the createAuthUri
    * request. The domain part of the federated ID is returned.
    */
  var providerId: js.UndefOr[String] = js.native
  /**
    * Raw IDP-returned user info.
    */
  var rawUserInfo: js.UndefOr[String] = js.native
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String] = js.native
  /**
    * The screen_name of a Twitter user or the login name at Github.
    */
  var screenName: js.UndefOr[String] = js.native
  /**
    * The timezone of the user.
    */
  var timeZone: js.UndefOr[String] = js.native
  /**
    * When action is &#39;map&#39;, contains the idps which can be used for
    * confirmation.
    */
  var verifiedProvider: js.UndefOr[js.Array[String]] = js.native
}

object SchemaVerifyAssertionResponse {
  @scala.inline
  def apply(): SchemaVerifyAssertionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyAssertionResponse]
  }
  @scala.inline
  implicit class SchemaVerifyAssertionResponseOps[Self <: SchemaVerifyAssertionResponse] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAppInstallationUrl(value: String): Self = this.set("appInstallationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppInstallationUrl: Self = this.set("appInstallationUrl", js.undefined)
    @scala.inline
    def setAppScheme(value: String): Self = this.set("appScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppScheme: Self = this.set("appScheme", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDateOfBirth(value: String): Self = this.set("dateOfBirth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateOfBirth: Self = this.set("dateOfBirth", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmailRecycled(value: Boolean): Self = this.set("emailRecycled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailRecycled: Self = this.set("emailRecycled", js.undefined)
    @scala.inline
    def setEmailVerified(value: Boolean): Self = this.set("emailVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailVerified: Self = this.set("emailVerified", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setExpiresIn(value: String): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    @scala.inline
    def setFederatedId(value: String): Self = this.set("federatedId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFederatedId: Self = this.set("federatedId", js.undefined)
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    @scala.inline
    def setInputEmail(value: String): Self = this.set("inputEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputEmail: Self = this.set("inputEmail", js.undefined)
    @scala.inline
    def setIsNewUser(value: Boolean): Self = this.set("isNewUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNewUser: Self = this.set("isNewUser", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    @scala.inline
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalId: Self = this.set("localId", js.undefined)
    @scala.inline
    def setNeedConfirmation(value: Boolean): Self = this.set("needConfirmation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedConfirmation: Self = this.set("needConfirmation", js.undefined)
    @scala.inline
    def setNeedEmail(value: Boolean): Self = this.set("needEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedEmail: Self = this.set("needEmail", js.undefined)
    @scala.inline
    def setNickName(value: String): Self = this.set("nickName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickName: Self = this.set("nickName", js.undefined)
    @scala.inline
    def setOauthAccessToken(value: String): Self = this.set("oauthAccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauthAccessToken: Self = this.set("oauthAccessToken", js.undefined)
    @scala.inline
    def setOauthAuthorizationCode(value: String): Self = this.set("oauthAuthorizationCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauthAuthorizationCode: Self = this.set("oauthAuthorizationCode", js.undefined)
    @scala.inline
    def setOauthExpireIn(value: Double): Self = this.set("oauthExpireIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauthExpireIn: Self = this.set("oauthExpireIn", js.undefined)
    @scala.inline
    def setOauthIdToken(value: String): Self = this.set("oauthIdToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauthIdToken: Self = this.set("oauthIdToken", js.undefined)
    @scala.inline
    def setOauthRequestToken(value: String): Self = this.set("oauthRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauthRequestToken: Self = this.set("oauthRequestToken", js.undefined)
    @scala.inline
    def setOauthScope(value: String): Self = this.set("oauthScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauthScope: Self = this.set("oauthScope", js.undefined)
    @scala.inline
    def setOauthTokenSecret(value: String): Self = this.set("oauthTokenSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauthTokenSecret: Self = this.set("oauthTokenSecret", js.undefined)
    @scala.inline
    def setOriginalEmail(value: String): Self = this.set("originalEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEmail: Self = this.set("originalEmail", js.undefined)
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviderId: Self = this.set("providerId", js.undefined)
    @scala.inline
    def setRawUserInfo(value: String): Self = this.set("rawUserInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawUserInfo: Self = this.set("rawUserInfo", js.undefined)
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    @scala.inline
    def setScreenName(value: String): Self = this.set("screenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenName: Self = this.set("screenName", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    @scala.inline
    def setVerifiedProviderVarargs(value: String*): Self = this.set("verifiedProvider", js.Array(value :_*))
    @scala.inline
    def setVerifiedProvider(value: js.Array[String]): Self = this.set("verifiedProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifiedProvider: Self = this.set("verifiedProvider", js.undefined)
  }
  
}

