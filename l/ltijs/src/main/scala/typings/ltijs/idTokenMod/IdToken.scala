package typings.ltijs.idTokenMod

import typings.ltijs.anon.LineItem
import typings.ltijs.platformMod.PlatformInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdToken extends js.Object {
  var endpoint: LineItem
  var iss: String
  var issuerCode: String
  var platformInfo: PlatformInfo
  var roles: js.Array[String]
  var user: String
  var userInfo: UserInfo
}

object IdToken {
  @scala.inline
  def apply(
    endpoint: LineItem,
    iss: String,
    issuerCode: String,
    platformInfo: PlatformInfo,
    roles: js.Array[String],
    user: String,
    userInfo: UserInfo
  ): IdToken = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], issuerCode = issuerCode.asInstanceOf[js.Any], platformInfo = platformInfo.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdToken]
  }
}

