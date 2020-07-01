package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of email signIn.
  */
@js.native
trait SchemaEmailLinkSigninResponse extends js.Object {
  /**
    * The user&#39;s email.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Expiration time of STS id token in seconds.
    */
  var expiresIn: js.UndefOr[String] = js.native
  /**
    * The STS id token to login the newly signed in user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * Whether the user is new.
    */
  var isNewUser: js.UndefOr[Boolean] = js.native
  /**
    * The fixed string &quot;identitytoolkit#EmailLinkSigninResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The RP local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
  /**
    * The refresh token for the signed in user.
    */
  var refreshToken: js.UndefOr[String] = js.native
}

object SchemaEmailLinkSigninResponse {
  @scala.inline
  def apply(
    email: String = null,
    expiresIn: String = null,
    idToken: String = null,
    isNewUser: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    localId: String = null,
    refreshToken: String = null
  ): SchemaEmailLinkSigninResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewUser)) __obj.updateDynamic("isNewUser")(isNewUser.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEmailLinkSigninResponse]
  }
}

