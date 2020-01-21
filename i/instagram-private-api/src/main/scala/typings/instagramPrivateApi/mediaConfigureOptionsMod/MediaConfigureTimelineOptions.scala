package typings.instagramPrivateApi.mediaConfigureOptionsMod

import typings.instagramPrivateApi.AnonCropcenterCroporiginalsize
import typings.instagramPrivateApi.AnonSourceheight
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigureTimelineOptions extends MediaConfigureOptions {
  var camera_make: js.UndefOr[String] = js.undefined
  var camera_model: js.UndefOr[String] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var creation_logger_session_id: js.UndefOr[String] = js.undefined
  var date_time_digitalized: js.UndefOr[String] = js.undefined
  var date_time_original: js.UndefOr[String] = js.undefined
  var device_id: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[MediaLocation | String] = js.undefined
  var timezone_offset: js.UndefOr[String] = js.undefined
  var usertags: js.UndefOr[PostingUsertags | String] = js.undefined
}

object MediaConfigureTimelineOptions {
  @scala.inline
  def apply(
    upload_id: String,
    camera_make: String = null,
    camera_model: String = null,
    caption: String = null,
    creation_logger_session_id: String = null,
    date_time_digitalized: String = null,
    date_time_original: String = null,
    device_id: String = null,
    disable_comments: js.UndefOr[Boolean] = js.undefined,
    edits: AnonCropcenterCroporiginalsize = null,
    extra: AnonSourceheight = null,
    geotag_enabled: `1` | `0` = null,
    height: Int | Double = null,
    location: MediaLocation | String = null,
    media_folder: String = null,
    media_latitude: String = null,
    media_longitude: String = null,
    posting_latitude: String = null,
    posting_longitude: String = null,
    scene_capture_type: String = null,
    software: String = null,
    source_type: String = null,
    timezone_offset: String = null,
    usertags: PostingUsertags | String = null,
    width: Int | Double = null
  ): MediaConfigureTimelineOptions = {
    val __obj = js.Dynamic.literal(upload_id = upload_id.asInstanceOf[js.Any])
    if (camera_make != null) __obj.updateDynamic("camera_make")(camera_make.asInstanceOf[js.Any])
    if (camera_model != null) __obj.updateDynamic("camera_model")(camera_model.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (creation_logger_session_id != null) __obj.updateDynamic("creation_logger_session_id")(creation_logger_session_id.asInstanceOf[js.Any])
    if (date_time_digitalized != null) __obj.updateDynamic("date_time_digitalized")(date_time_digitalized.asInstanceOf[js.Any])
    if (date_time_original != null) __obj.updateDynamic("date_time_original")(date_time_original.asInstanceOf[js.Any])
    if (device_id != null) __obj.updateDynamic("device_id")(device_id.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_comments)) __obj.updateDynamic("disable_comments")(disable_comments.asInstanceOf[js.Any])
    if (edits != null) __obj.updateDynamic("edits")(edits.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (geotag_enabled != null) __obj.updateDynamic("geotag_enabled")(geotag_enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (media_folder != null) __obj.updateDynamic("media_folder")(media_folder.asInstanceOf[js.Any])
    if (media_latitude != null) __obj.updateDynamic("media_latitude")(media_latitude.asInstanceOf[js.Any])
    if (media_longitude != null) __obj.updateDynamic("media_longitude")(media_longitude.asInstanceOf[js.Any])
    if (posting_latitude != null) __obj.updateDynamic("posting_latitude")(posting_latitude.asInstanceOf[js.Any])
    if (posting_longitude != null) __obj.updateDynamic("posting_longitude")(posting_longitude.asInstanceOf[js.Any])
    if (scene_capture_type != null) __obj.updateDynamic("scene_capture_type")(scene_capture_type.asInstanceOf[js.Any])
    if (software != null) __obj.updateDynamic("software")(software.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (timezone_offset != null) __obj.updateDynamic("timezone_offset")(timezone_offset.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureTimelineOptions]
  }
}

