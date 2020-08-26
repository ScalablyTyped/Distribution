package typings.hlsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audio extends js.Object {
  var audio: js.UndefOr[Double] = js.native
  var closedCaptions: js.UndefOr[Double] = js.native
  var subtitles: js.UndefOr[Double] = js.native
  var video: js.UndefOr[Double] = js.native
}

object Audio {
  @scala.inline
  def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  @scala.inline
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
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
    def setAudio(value: Double): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    @scala.inline
    def setClosedCaptions(value: Double): Self = this.set("closedCaptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosedCaptions: Self = this.set("closedCaptions", js.undefined)
    @scala.inline
    def setSubtitles(value: Double): Self = this.set("subtitles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitles: Self = this.set("subtitles", js.undefined)
    @scala.inline
    def setVideo(value: Double): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
  
}

