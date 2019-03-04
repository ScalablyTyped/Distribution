package typings
package jsforceLib.oauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenResponse extends js.Object {
  var access_token: java.lang.String
  var refresh_token: java.lang.String
}

object TokenResponse {
  @scala.inline
  def apply(access_token: java.lang.String, refresh_token: java.lang.String): TokenResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token, refresh_token = refresh_token)
  
    __obj.asInstanceOf[TokenResponse]
  }
}

