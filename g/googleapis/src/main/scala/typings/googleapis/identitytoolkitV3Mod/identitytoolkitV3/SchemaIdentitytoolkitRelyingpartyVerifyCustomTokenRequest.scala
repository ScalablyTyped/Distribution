package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to verify a custom token
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest extends js.Object {
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * Whether return sts id token and refresh token instead of gitkit token.
    */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  /**
    * The custom token to verify
    */
  var token: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest {
  @scala.inline
  def apply(
    delegatedProjectNumber: String = null,
    instanceId: String = null,
    returnSecureToken: js.UndefOr[Boolean] = js.undefined,
    token: String = null
  ): SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest = {
    val __obj = js.Dynamic.literal()
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSecureToken)) __obj.updateDynamic("returnSecureToken")(returnSecureToken.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyCustomTokenRequest]
  }
}

