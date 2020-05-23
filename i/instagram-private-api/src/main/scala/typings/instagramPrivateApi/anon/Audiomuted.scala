package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audiomuted extends js.Object {
  var audio_muted: js.UndefOr[Boolean] = js.undefined
  var clips: js.UndefOr[js.Array[Length]] = js.undefined
  var length: Double
  var poster_frame_index: js.UndefOr[Double] = js.undefined
}

object Audiomuted {
  @scala.inline
  def apply(
    length: Double,
    audio_muted: js.UndefOr[Boolean] = js.undefined,
    clips: js.Array[Length] = null,
    poster_frame_index: js.UndefOr[Double] = js.undefined
  ): Audiomuted = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (!js.isUndefined(audio_muted)) __obj.updateDynamic("audio_muted")(audio_muted.get.asInstanceOf[js.Any])
    if (clips != null) __obj.updateDynamic("clips")(clips.asInstanceOf[js.Any])
    if (!js.isUndefined(poster_frame_index)) __obj.updateDynamic("poster_frame_index")(poster_frame_index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audiomuted]
  }
}

