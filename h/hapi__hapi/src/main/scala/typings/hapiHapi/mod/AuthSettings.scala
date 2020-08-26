package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthSettings extends js.Object {
  var access: js.UndefOr[js.Array[AccessSetting]] = js.native
  var mode: AuthMode = js.native
  var strategies: js.Array[String] = js.native
}

object AuthSettings {
  @scala.inline
  def apply(mode: AuthMode, strategies: js.Array[String]): AuthSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], strategies = strategies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSettings]
  }
  @scala.inline
  implicit class AuthSettingsOps[Self <: AuthSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMode(value: AuthMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrategiesVarargs(value: String*): Self = this.set("strategies", js.Array(value :_*))
    @scala.inline
    def setStrategies(value: js.Array[String]): Self = this.set("strategies", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessVarargs(value: AccessSetting*): Self = this.set("access", js.Array(value :_*))
    @scala.inline
    def setAccess(value: js.Array[AccessSetting]): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
  }
  
}

