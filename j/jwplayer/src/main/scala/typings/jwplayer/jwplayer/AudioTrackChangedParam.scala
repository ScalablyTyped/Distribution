package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioTrackChangedParam extends js.Object {
  var currentTrack: Double = js.native
}

object AudioTrackChangedParam {
  @scala.inline
  def apply(currentTrack: Double): AudioTrackChangedParam = {
    val __obj = js.Dynamic.literal(currentTrack = currentTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrackChangedParam]
  }
  @scala.inline
  implicit class AudioTrackChangedParamOps[Self <: AudioTrackChangedParam] (val x: Self) extends AnyVal {
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
    def setCurrentTrack(value: Double): Self = this.set("currentTrack", value.asInstanceOf[js.Any])
  }
  
}

