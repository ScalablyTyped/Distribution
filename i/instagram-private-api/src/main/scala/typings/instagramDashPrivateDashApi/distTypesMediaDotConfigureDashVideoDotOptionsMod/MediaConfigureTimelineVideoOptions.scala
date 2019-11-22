package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashVideoDotOptionsMod

import typings.instagramDashPrivateDashApi.Anon_Length
import typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDotOptionsMod.MediaLocation
import typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod.PostingUsertags
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`0`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`1`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`4`
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
    clips: js.Array[Anon_Length] = null,
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
    val __obj = js.Dynamic.literal(height = height, length = length, upload_id = upload_id, width = width)
    if (!js.isUndefined(audio_muted)) __obj.updateDynamic("audio_muted")(audio_muted)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (clips != null) __obj.updateDynamic("clips")(clips)
    if (date_time_original != null) __obj.updateDynamic("date_time_original")(date_time_original)
    if (device_id != null) __obj.updateDynamic("device_id")(device_id)
    if (filter_type != null) __obj.updateDynamic("filter_type")(filter_type)
    if (geotag_enabled != null) __obj.updateDynamic("geotag_enabled")(geotag_enabled.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (media_latitude != null) __obj.updateDynamic("media_latitude")(media_latitude)
    if (media_longitude != null) __obj.updateDynamic("media_longitude")(media_longitude)
    if (poster_frame_index != null) __obj.updateDynamic("poster_frame_index")(poster_frame_index.asInstanceOf[js.Any])
    if (posting_latitude != null) __obj.updateDynamic("posting_latitude")(posting_latitude)
    if (posting_longitude != null) __obj.updateDynamic("posting_longitude")(posting_longitude)
    if (source_type != null) __obj.updateDynamic("source_type")(source_type)
    if (timezone_offset != null) __obj.updateDynamic("timezone_offset")(timezone_offset)
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureTimelineVideoOptions]
  }
}

