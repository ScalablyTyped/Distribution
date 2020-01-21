package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSettings extends js.Object {
  var access: js.UndefOr[js.Array[AccessSetting]] = js.undefined
  var mode: AuthMode
  var strategies: js.Array[String]
}

object AuthSettings {
  @scala.inline
  def apply(mode: AuthMode, strategies: js.Array[String], access: js.Array[AccessSetting] = null): AuthSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], strategies = strategies.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSettings]
  }
}

