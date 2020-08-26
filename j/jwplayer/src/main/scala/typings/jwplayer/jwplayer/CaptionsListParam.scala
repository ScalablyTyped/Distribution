package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionsListParam extends js.Object {
  var tracks: js.Array[_] = js.native
}

object CaptionsListParam {
  @scala.inline
  def apply(tracks: js.Array[_]): CaptionsListParam = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionsListParam]
  }
  @scala.inline
  implicit class CaptionsListParamOps[Self <: CaptionsListParam] (val x: Self) extends AnyVal {
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
    def setTracksVarargs(value: js.Any*): Self = this.set("tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: js.Array[_]): Self = this.set("tracks", value.asInstanceOf[js.Any])
  }
  
}

