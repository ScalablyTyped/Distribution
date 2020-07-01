package typings.ltijs.platformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformAuthConfig extends js.Object {
  var key: String
  var method: String
}

object PlatformAuthConfig {
  @scala.inline
  def apply(key: String, method: String): PlatformAuthConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformAuthConfig]
  }
}

