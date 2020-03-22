package typings.matrixJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginPayload extends js.Object {
  var access_token: String
  var device_id: String
  var home_server: String
  var user_id: String
}

object LoginPayload {
  @scala.inline
  def apply(access_token: String, device_id: String, home_server: String, user_id: String): LoginPayload = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], device_id = device_id.asInstanceOf[js.Any], home_server = home_server.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginPayload]
  }
}

