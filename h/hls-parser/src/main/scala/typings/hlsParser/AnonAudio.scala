package typings.hlsParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudio extends js.Object {
  var audio: js.UndefOr[Double] = js.undefined
  var closedCaptions: js.UndefOr[Double] = js.undefined
  var subtitles: js.UndefOr[Double] = js.undefined
  var video: js.UndefOr[Double] = js.undefined
}

object AnonAudio {
  @scala.inline
  def apply(
    audio: Int | Double = null,
    closedCaptions: Int | Double = null,
    subtitles: Int | Double = null,
    video: Int | Double = null
  ): AnonAudio = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (closedCaptions != null) __obj.updateDynamic("closedCaptions")(closedCaptions.asInstanceOf[js.Any])
    if (subtitles != null) __obj.updateDynamic("subtitles")(subtitles.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudio]
  }
}

