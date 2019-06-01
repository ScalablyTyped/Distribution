package typings
package atHapiHapiLib.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSettings extends js.Object {
  var access: js.UndefOr[js.Array[AccessSetting]] = js.undefined
  var mode: AuthMode
  var strategies: js.Array[java.lang.String]
}

object AuthSettings {
  @scala.inline
  def apply(mode: AuthMode, strategies: js.Array[java.lang.String], access: js.Array[AccessSetting] = null): AuthSettings = {
    val __obj = js.Dynamic.literal(mode = mode, strategies = strategies)
    if (access != null) __obj.updateDynamic("access")(access)
    __obj.asInstanceOf[AuthSettings]
  }
}

