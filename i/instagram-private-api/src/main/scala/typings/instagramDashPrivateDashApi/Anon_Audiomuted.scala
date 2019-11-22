package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audiomuted extends js.Object {
  var audio_muted: js.UndefOr[Boolean] = js.undefined
  var clips: js.UndefOr[js.Array[Anon_Length]] = js.undefined
  var length: Double
  var poster_frame_index: js.UndefOr[Double] = js.undefined
}

object Anon_Audiomuted {
  @scala.inline
  def apply(
    length: Double,
    audio_muted: js.UndefOr[Boolean] = js.undefined,
    clips: js.Array[Anon_Length] = null,
    poster_frame_index: Int | Double = null
  ): Anon_Audiomuted = {
    val __obj = js.Dynamic.literal(length = length)
    if (!js.isUndefined(audio_muted)) __obj.updateDynamic("audio_muted")(audio_muted)
    if (clips != null) __obj.updateDynamic("clips")(clips)
    if (poster_frame_index != null) __obj.updateDynamic("poster_frame_index")(poster_frame_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Audiomuted]
  }
}

