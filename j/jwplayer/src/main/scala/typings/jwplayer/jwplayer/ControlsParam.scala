package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlsParam extends js.Object {
  var controls: Boolean = js.native
}

object ControlsParam {
  @scala.inline
  def apply(controls: Boolean): ControlsParam = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlsParam]
  }
  @scala.inline
  implicit class ControlsParamOps[Self <: ControlsParam] (val x: Self) extends AnyVal {
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
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
  }
  
}

