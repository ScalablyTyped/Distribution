package typings.hapiHapi

import typings.hapiHapi.mod.ServerAuthConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault extends js.Object {
  var default: ServerAuthConfig
}

object AnonDefault {
  @scala.inline
  def apply(default: ServerAuthConfig): AnonDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault]
  }
}

