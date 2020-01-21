package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request of verifying the password.
  */
@js.native
trait SchemaVerifyPasswordResponse extends js.Object {
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email returned by the IdP. NOTE: The federated login user may not own
    * the email.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * If idToken is STS id token, then this field will be expiration time of
    * STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String] = js.native
  /**
    * The GITKit token for authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The fixed string &quot;identitytoolkit#VerifyPasswordResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The RP local ID if it&#39;s already been mapped to the IdP account
    * identified by the federated ID.
    */
  var localId: js.UndefOr[String] = js.native
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
    * The URI of the user&#39;s photo at IdP
    */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * If idToken is STS id token, then this field will be refresh token.
    */
  var refreshToken: js.UndefOr[String] = js.native
  /**
    * Whether the email is registered.
    */
  var registered: js.UndefOr[Boolean] = js.native
}

object SchemaVerifyPasswordResponse {
  @scala.inline
  def apply(
    displayName: String = null,
    email: String = null,
    expiresIn: String = null,
    idToken: String = null,
    kind: String = null,
    localId: String = null,
    oauthAccessToken: String = null,
    oauthAuthorizationCode: String = null,
    oauthExpireIn: Int | Double = null,
    photoUrl: String = null,
    refreshToken: String = null,
    registered: js.UndefOr[Boolean] = js.undefined
  ): SchemaVerifyPasswordResponse = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    if (oauthAccessToken != null) __obj.updateDynamic("oauthAccessToken")(oauthAccessToken.asInstanceOf[js.Any])
    if (oauthAuthorizationCode != null) __obj.updateDynamic("oauthAuthorizationCode")(oauthAuthorizationCode.asInstanceOf[js.Any])
    if (oauthExpireIn != null) __obj.updateDynamic("oauthExpireIn")(oauthExpireIn.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (!js.isUndefined(registered)) __obj.updateDynamic("registered")(registered.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVerifyPasswordResponse]
  }
}

