package typings.jsforce.oauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenResponse extends js.Object {
  var access_token: String
  var refresh_token: String
}

object TokenResponse {
  @scala.inline
  def apply(access_token: String, refresh_token: String): TokenResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResponse]
  }
}

