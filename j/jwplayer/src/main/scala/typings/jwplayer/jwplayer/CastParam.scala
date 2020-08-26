package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.cast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CastParam extends js.Object {
  var active: Boolean = js.native
  var available: Boolean = js.native
  var deviceName: String = js.native
  var `type`: cast = js.native
}

object CastParam {
  @scala.inline
  def apply(active: Boolean, available: Boolean, deviceName: String, `type`: cast): CastParam = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], available = available.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastParam]
  }
  @scala.inline
  implicit class CastParamOps[Self <: CastParam] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: cast): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

