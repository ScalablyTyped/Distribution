package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of verifying the IDP assertion.
  */
trait SchemaVerifyAssertionResponse extends StObject {
  
  /**
    * The action code.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * URL for OTA app installation.
    */
  var appInstallationUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The custom scheme used by mobile app.
    */
  var appScheme: js.UndefOr[String] = js.undefined
  
  /**
    * The opaque value used by the client to maintain context info between the
    * authentication request and the IDP callback.
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * The birth date of the IdP account.
    */
  var dateOfBirth: js.UndefOr[String] = js.undefined
  
  /**
    * The display name of the user.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The email returned by the IdP. NOTE: The federated login user may not own
    * the email.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * It&#39;s true if the email is recycled.
    */
  var emailRecycled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value is true if the IDP is also the email provider. It means the
    * user owns the email.
    */
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Client error code.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * If idToken is STS id token, then this field will be expiration time of
    * STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID identifies the IdP account.
    */
  var federatedId: js.UndefOr[String] = js.undefined
  
  /**
    * The first name of the user.
    */
  var firstName: js.UndefOr[String] = js.undefined
  
  /**
    * The full name of the user.
    */
  var fullName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID token.
    */
  var idToken: js.UndefOr[String] = js.undefined
  
  /**
    * It&#39;s the identifier param in the createAuthUri request if the
    * identifier is an email. It can be used to check whether the user input
    * email is different from the asserted email.
    */
  var inputEmail: js.UndefOr[String] = js.undefined
  
  /**
    * True if it&#39;s a new user sign-in, false if it&#39;s a returning user.
    */
  var isNewUser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The fixed string &quot;identitytoolkit#VerifyAssertionResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The language preference of the user.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The last name of the user.
    */
  var lastName: js.UndefOr[String] = js.undefined
  
  /**
    * The RP local ID if it&#39;s already been mapped to the IdP account
    * identified by the federated ID.
    */
  var localId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the assertion is from a non-trusted IDP and need account linking
    * confirmation.
    */
  var needConfirmation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether need client to supply email to complete the federated login flow.
    */
  var needEmail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The nick name of the user.
    */
  var nickName: js.UndefOr[String] = js.undefined
  
  /**
    * The OAuth2 access token.
    */
  var oauthAccessToken: js.UndefOr[String] = js.undefined
  
  /**
    * The OAuth2 authorization code.
    */
  var oauthAuthorizationCode: js.UndefOr[String] = js.undefined
  
  /**
    * The lifetime in seconds of the OAuth2 access token.
    */
  var oauthExpireIn: js.UndefOr[Double] = js.undefined
  
  /**
    * The OIDC id token.
    */
  var oauthIdToken: js.UndefOr[String] = js.undefined
  
  /**
    * The user approved request token for the OpenID OAuth extension.
    */
  var oauthRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The scope for the OpenID OAuth extension.
    */
  var oauthScope: js.UndefOr[String] = js.undefined
  
  /**
    * The OAuth1 access token secret.
    */
  var oauthTokenSecret: js.UndefOr[String] = js.undefined
  
  /**
    * The original email stored in the mapping storage. It&#39;s returned when
    * the federated ID is associated to a different email.
    */
  var originalEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The URI of the public accessible profiel picture.
    */
  var photoUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The IdP ID. For white listed IdPs it&#39;s a short domain name e.g.
    * google.com, aol.com, live.net and yahoo.com. If the
    * &quot;providerId&quot; param is set to OpenID OP identifer other than the
    * whilte listed IdPs the OP identifier is returned. If the
    * &quot;identifier&quot; param is federated ID in the createAuthUri
    * request. The domain part of the federated ID is returned.
    */
  var providerId: js.UndefOr[String] = js.undefined
  
  /**
    * Raw IDP-returned user info.
    */
  var rawUserInfo: js.UndefOr[String] = js.undefined
  
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String] = js.undefined
  
  /**
    * The screen_name of a Twitter user or the login name at Github.
    */
  var screenName: js.UndefOr[String] = js.undefined
  
  /**
    * The timezone of the user.
    */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /**
    * When action is &#39;map&#39;, contains the idps which can be used for
    * confirmation.
    */
  var verifiedProvider: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaVerifyAssertionResponse {
  
  @scala.inline
  def apply(): SchemaVerifyAssertionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyAssertionResponse]
  }
  
  @scala.inline
  implicit class SchemaVerifyAssertionResponseMutableBuilder[Self <: SchemaVerifyAssertionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAppInstallationUrl(value: String): Self = StObject.set(x, "appInstallationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstallationUrlUndefined: Self = StObject.set(x, "appInstallationUrl", js.undefined)
    
    @scala.inline
    def setAppScheme(value: String): Self = StObject.set(x, "appScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppSchemeUndefined: Self = StObject.set(x, "appScheme", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDateOfBirth(value: String): Self = StObject.set(x, "dateOfBirth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateOfBirthUndefined: Self = StObject.set(x, "dateOfBirth", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailRecycled(value: Boolean): Self = StObject.set(x, "emailRecycled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailRecycledUndefined: Self = StObject.set(x, "emailRecycled", js.undefined)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    @scala.inline
    def setFederatedId(value: String): Self = StObject.set(x, "federatedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFederatedIdUndefined: Self = StObject.set(x, "federatedId", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setInputEmail(value: String): Self = StObject.set(x, "inputEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputEmailUndefined: Self = StObject.set(x, "inputEmail", js.undefined)
    
    @scala.inline
    def setIsNewUser(value: Boolean): Self = StObject.set(x, "isNewUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNewUserUndefined: Self = StObject.set(x, "isNewUser", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    @scala.inline
    def setNeedConfirmation(value: Boolean): Self = StObject.set(x, "needConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedConfirmationUndefined: Self = StObject.set(x, "needConfirmation", js.undefined)
    
    @scala.inline
    def setNeedEmail(value: Boolean): Self = StObject.set(x, "needEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedEmailUndefined: Self = StObject.set(x, "needEmail", js.undefined)
    
    @scala.inline
    def setNickName(value: String): Self = StObject.set(x, "nickName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickNameUndefined: Self = StObject.set(x, "nickName", js.undefined)
    
    @scala.inline
    def setOauthAccessToken(value: String): Self = StObject.set(x, "oauthAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthAccessTokenUndefined: Self = StObject.set(x, "oauthAccessToken", js.undefined)
    
    @scala.inline
    def setOauthAuthorizationCode(value: String): Self = StObject.set(x, "oauthAuthorizationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthAuthorizationCodeUndefined: Self = StObject.set(x, "oauthAuthorizationCode", js.undefined)
    
    @scala.inline
    def setOauthExpireIn(value: Double): Self = StObject.set(x, "oauthExpireIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthExpireInUndefined: Self = StObject.set(x, "oauthExpireIn", js.undefined)
    
    @scala.inline
    def setOauthIdToken(value: String): Self = StObject.set(x, "oauthIdToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthIdTokenUndefined: Self = StObject.set(x, "oauthIdToken", js.undefined)
    
    @scala.inline
    def setOauthRequestToken(value: String): Self = StObject.set(x, "oauthRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthRequestTokenUndefined: Self = StObject.set(x, "oauthRequestToken", js.undefined)
    
    @scala.inline
    def setOauthScope(value: String): Self = StObject.set(x, "oauthScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthScopeUndefined: Self = StObject.set(x, "oauthScope", js.undefined)
    
    @scala.inline
    def setOauthTokenSecret(value: String): Self = StObject.set(x, "oauthTokenSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthTokenSecretUndefined: Self = StObject.set(x, "oauthTokenSecret", js.undefined)
    
    @scala.inline
    def setOriginalEmail(value: String): Self = StObject.set(x, "originalEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEmailUndefined: Self = StObject.set(x, "originalEmail", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    
    @scala.inline
    def setRawUserInfo(value: String): Self = StObject.set(x, "rawUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUserInfoUndefined: Self = StObject.set(x, "rawUserInfo", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    @scala.inline
    def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setVerifiedProvider(value: js.Array[String]): Self = StObject.set(x, "verifiedProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedProviderUndefined: Self = StObject.set(x, "verifiedProvider", js.undefined)
    
    @scala.inline
    def setVerifiedProviderVarargs(value: String*): Self = StObject.set(x, "verifiedProvider", js.Array(value :_*))
  }
}
