package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudiomuted extends js.Object {
  var audio_muted: js.UndefOr[Boolean] = js.undefined
  var clips: js.UndefOr[js.Array[AnonLength]] = js.undefined
  var length: Double
  var poster_frame_index: js.UndefOr[Double] = js.undefined
}

object AnonAudiomuted {
  @scala.inline
  def apply(
    length: Double,
    audio_muted: js.UndefOr[Boolean] = js.undefined,
    clips: js.Array[AnonLength] = null,
    poster_frame_index: Int | Double = null
  ): AnonAudiomuted = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (!js.isUndefined(audio_muted)) __obj.updateDynamic("audio_muted")(audio_muted.asInstanceOf[js.Any])
    if (clips != null) __obj.updateDynamic("clips")(clips.asInstanceOf[js.Any])
    if (poster_frame_index != null) __obj.updateDynamic("poster_frame_index")(poster_frame_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudiomuted]
  }
}

