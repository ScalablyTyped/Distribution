package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGenerateIdentityBindingAccessTokenResponse extends js.Object {
  /**
    * The OAuth 2.0 access token.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * Token expiration time. The expiration time is always set.
    */
  var expireTime: js.UndefOr[String] = js.native
}

object SchemaGenerateIdentityBindingAccessTokenResponse {
  @scala.inline
  def apply(accessToken: String = null, expireTime: String = null): SchemaGenerateIdentityBindingAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGenerateIdentityBindingAccessTokenResponse]
  }
}

