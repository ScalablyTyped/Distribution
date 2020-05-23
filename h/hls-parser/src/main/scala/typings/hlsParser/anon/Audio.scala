package typings.hlsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends js.Object {
  var audio: js.UndefOr[Double] = js.undefined
  var closedCaptions: js.UndefOr[Double] = js.undefined
  var subtitles: js.UndefOr[Double] = js.undefined
  var video: js.UndefOr[Double] = js.undefined
}

object Audio {
  @scala.inline
  def apply(
    audio: js.UndefOr[Double] = js.undefined,
    closedCaptions: js.UndefOr[Double] = js.undefined,
    subtitles: js.UndefOr[Double] = js.undefined,
    video: js.UndefOr[Double] = js.undefined
  ): Audio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closedCaptions)) __obj.updateDynamic("closedCaptions")(closedCaptions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitles)) __obj.updateDynamic("subtitles")(subtitles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

