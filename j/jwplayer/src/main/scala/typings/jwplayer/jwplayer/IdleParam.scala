package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.buffering
import typings.jwplayer.jwplayerStrings.paused
import typings.jwplayer.jwplayerStrings.playing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdleParam extends js.Object {
  var oldstate: buffering | playing | paused = js.native
}

object IdleParam {
  @scala.inline
  def apply(oldstate: buffering | playing | paused): IdleParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleParam]
  }
  @scala.inline
  implicit class IdleParamOps[Self <: IdleParam] (val x: Self) extends AnyVal {
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
    def setOldstate(value: buffering | playing | paused): Self = this.set("oldstate", value.asInstanceOf[js.Any])
  }
  
}

