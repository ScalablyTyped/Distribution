package typings.instagramPrivateApi.mediaConfigureVideoOptionsMod

import typings.instagramPrivateApi.AnonLength
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`4`
import typings.instagramPrivateApi.mediaConfigureOptionsMod.MediaLocation
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigureTimelineVideoOptions extends MediaConfigureVideoOptions {
  var caption: js.UndefOr[String] = js.undefined
  var date_time_original: js.UndefOr[String] = js.undefined
  var device_id: js.UndefOr[String] = js.undefined
  var filter_type: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[MediaLocation | String] = js.undefined
  var source_type: js.UndefOr[`4`] = js.undefined
  var timezone_offset: js.UndefOr[String] = js.undefined
  var usertags: js.UndefOr[PostingUsertags | String] = js.undefined
}

object MediaConfigureTimelineVideoOptions {
  @scala.inline
  def apply(
    height: Double,
    length: Double,
    upload_id: String,
    width: Double,
    audio_muted: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    clips: js.Array[AnonLength] = null,
    date_time_original: String = null,
    device_id: String = null,
    filter_type: String = null,
    geotag_enabled: `1` | `0` = null,
    location: MediaLocation | String = null,
    media_latitude: String = null,
    media_longitude: String = null,
    poster_frame_index: Int | Double = null,
    posting_latitude: String = null,
    posting_longitude: String = null,
    source_type: `4` = null,
    timezone_offset: String = null,
    usertags: PostingUsertags | String = null
  ): MediaConfigureTimelineVideoOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(audio_muted)) __obj.updateDynamic("audio_muted")(audio_muted.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clips != null) __obj.updateDynamic("clips")(clips.asInstanceOf[js.Any])
    if (date_time_original != null) __obj.updateDynamic("date_time_original")(date_time_original.asInstanceOf[js.Any])
    if (device_id != null) __obj.updateDynamic("device_id")(device_id.asInstanceOf[js.Any])
    if (filter_type != null) __obj.updateDynamic("filter_type")(filter_type.asInstanceOf[js.Any])
    if (geotag_enabled != null) __obj.updateDynamic("geotag_enabled")(geotag_enabled.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (media_latitude != null) __obj.updateDynamic("media_latitude")(media_latitude.asInstanceOf[js.Any])
    if (media_longitude != null) __obj.updateDynamic("media_longitude")(media_longitude.asInstanceOf[js.Any])
    if (poster_frame_index != null) __obj.updateDynamic("poster_frame_index")(poster_frame_index.asInstanceOf[js.Any])
    if (posting_latitude != null) __obj.updateDynamic("posting_latitude")(posting_latitude.asInstanceOf[js.Any])
    if (posting_longitude != null) __obj.updateDynamic("posting_longitude")(posting_longitude.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (timezone_offset != null) __obj.updateDynamic("timezone_offset")(timezone_offset.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureTimelineVideoOptions]
  }
}

