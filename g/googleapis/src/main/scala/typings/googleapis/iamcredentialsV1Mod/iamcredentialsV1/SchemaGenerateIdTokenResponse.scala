package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGenerateIdTokenResponse extends js.Object {
  /**
    * The OpenId Connect ID token.
    */
  var token: js.UndefOr[String] = js.native
}

object SchemaGenerateIdTokenResponse {
  @scala.inline
  def apply(token: String = null): SchemaGenerateIdTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGenerateIdTokenResponse]
  }
}

