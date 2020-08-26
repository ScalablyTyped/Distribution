package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
import typings.jwplayer.jwplayerNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadyParam extends js.Object {
  var setupTime: Double = js.native
  var viewable: `0` | `1` = js.native
}

object ReadyParam {
  @scala.inline
  def apply(setupTime: Double, viewable: `0` | `1`): ReadyParam = {
    val __obj = js.Dynamic.literal(setupTime = setupTime.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadyParam]
  }
  @scala.inline
  implicit class ReadyParamOps[Self <: ReadyParam] (val x: Self) extends AnyVal {
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
    def setSetupTime(value: Double): Self = this.set("setupTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewable(value: `0` | `1`): Self = this.set("viewable", value.asInstanceOf[js.Any])
  }
  
}

