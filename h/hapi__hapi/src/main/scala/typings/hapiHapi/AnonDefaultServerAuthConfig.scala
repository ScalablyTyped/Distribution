package typings.hapiHapi

import typings.hapiHapi.mod.ServerAuthConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultServerAuthConfig extends js.Object {
  var default: ServerAuthConfig
}

object AnonDefaultServerAuthConfig {
  @scala.inline
  def apply(default: ServerAuthConfig): AnonDefaultServerAuthConfig = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultServerAuthConfig]
  }
}

