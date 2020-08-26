package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
import typings.jwplayer.jwplayerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeParam extends js.Object {
  var duration: Double = js.native
  var position: Double = js.native
  var viewable: `0` | `1` = js.native
}

object TimeParam {
  @scala.inline
  def apply(duration: Double, position: Double, viewable: `0` | `1`): TimeParam = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeParam]
  }
  @scala.inline
  implicit class TimeParamOps[Self <: TimeParam] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewable(value: `0` | `1`): Self = this.set("viewable", value.asInstanceOf[js.Any])
  }
  
}

