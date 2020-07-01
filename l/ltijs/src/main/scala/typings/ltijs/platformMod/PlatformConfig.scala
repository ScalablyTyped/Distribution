package typings.ltijs.platformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformConfig extends js.Object {
  var accesstokenEndpoint: String
  var authConfig: PlatformAuthConfig
  var authenticationEndpoint: String
  var clientId: String
  var name: String
  var url: String
}

object PlatformConfig {
  @scala.inline
  def apply(
    accesstokenEndpoint: String,
    authConfig: PlatformAuthConfig,
    authenticationEndpoint: String,
    clientId: String,
    name: String,
    url: String
  ): PlatformConfig = {
    val __obj = js.Dynamic.literal(accesstokenEndpoint = accesstokenEndpoint.asInstanceOf[js.Any], authConfig = authConfig.asInstanceOf[js.Any], authenticationEndpoint = authenticationEndpoint.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformConfig]
  }
}

