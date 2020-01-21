package typings.instagramPrivateApi.mediaConfigureVideoOptionsMod

import typings.instagramPrivateApi.AnonLength
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigureVideoOptions extends js.Object {
  var audio_muted: js.UndefOr[Boolean] = js.undefined
  var clips: js.UndefOr[js.Array[AnonLength]] = js.undefined
  var geotag_enabled: js.UndefOr[`1` | `0`] = js.undefined
  var height: Double
  var length: Double
  var media_latitude: js.UndefOr[String] = js.undefined
  var media_longitude: js.UndefOr[String] = js.undefined
  var poster_frame_index: js.UndefOr[Double] = js.undefined
  var posting_latitude: js.UndefOr[String] = js.undefined
  var posting_longitude: js.UndefOr[String] = js.undefined
  var upload_id: String
  var width: Double
}

object MediaConfigureVideoOptions {
  @scala.inline
  def apply(
    height: Double,
    length: Double,
    upload_id: String,
    width: Double,
    audio_muted: js.UndefOr[Boolean] = js.undefined,
    clips: js.Array[AnonLength] = null,
    geotag_enabled: `1` | `0` = null,
    media_latitude: String = null,
    media_longitude: String = null,
    poster_frame_index: Int | Double = null,
    posting_latitude: String = null,
    posting_longitude: String = null
  ): MediaConfigureVideoOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(audio_muted)) __obj.updateDynamic("audio_muted")(audio_muted.asInstanceOf[js.Any])
    if (clips != null) __obj.updateDynamic("clips")(clips.asInstanceOf[js.Any])
    if (geotag_enabled != null) __obj.updateDynamic("geotag_enabled")(geotag_enabled.asInstanceOf[js.Any])
    if (media_latitude != null) __obj.updateDynamic("media_latitude")(media_latitude.asInstanceOf[js.Any])
    if (media_longitude != null) __obj.updateDynamic("media_longitude")(media_longitude.asInstanceOf[js.Any])
    if (poster_frame_index != null) __obj.updateDynamic("poster_frame_index")(poster_frame_index.asInstanceOf[js.Any])
    if (posting_latitude != null) __obj.updateDynamic("posting_latitude")(posting_latitude.asInstanceOf[js.Any])
    if (posting_longitude != null) __obj.updateDynamic("posting_longitude")(posting_longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureVideoOptions]
  }
}

