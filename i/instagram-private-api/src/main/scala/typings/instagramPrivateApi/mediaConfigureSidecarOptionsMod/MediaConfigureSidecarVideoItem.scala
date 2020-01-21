package typings.instagramPrivateApi.mediaConfigureSidecarOptionsMod

import typings.instagramPrivateApi.AnonAndroidreleaseAndroidversion
import typings.instagramPrivateApi.AnonCropcenter
import typings.instagramPrivateApi.AnonLength
import typings.instagramPrivateApi.AnonSourceheight
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigureSidecarVideoItem extends MediaConfigureSidecarItem {
  var audio_muted: js.UndefOr[String] = js.undefined
  var clips: js.UndefOr[js.Array[AnonLength] | String] = js.undefined
  var date_time_original: js.UndefOr[String] = js.undefined
  var filter_type: js.UndefOr[String] = js.undefined
  var length: String
  var poster_frame_index: js.UndefOr[String] = js.undefined
  var video_result: js.UndefOr[String] = js.undefined
}

object MediaConfigureSidecarVideoItem {
  @scala.inline
  def apply(
    height: Double,
    length: String,
    upload_id: String,
    width: Double,
    audio_muted: String = null,
    caption: js.UndefOr[scala.Nothing] = js.undefined,
    clips: js.Array[AnonLength] | String = null,
    date_time_original: String = null,
    device: AnonAndroidreleaseAndroidversion | String = null,
    edits: AnonCropcenter | String = null,
    extra: AnonSourceheight | String = null,
    filter_type: String = null,
    poster_frame_index: String = null,
    source_type: String = null,
    timezone_offset: String = null,
    usertags: PostingUsertags | String = null,
    video_result: String = null
  ): MediaConfigureSidecarVideoItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (audio_muted != null) __obj.updateDynamic("audio_muted")(audio_muted.asInstanceOf[js.Any])
    if (!js.isUndefined(caption)) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clips != null) __obj.updateDynamic("clips")(clips.asInstanceOf[js.Any])
    if (date_time_original != null) __obj.updateDynamic("date_time_original")(date_time_original.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (edits != null) __obj.updateDynamic("edits")(edits.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (filter_type != null) __obj.updateDynamic("filter_type")(filter_type.asInstanceOf[js.Any])
    if (poster_frame_index != null) __obj.updateDynamic("poster_frame_index")(poster_frame_index.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (timezone_offset != null) __obj.updateDynamic("timezone_offset")(timezone_offset.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (video_result != null) __obj.updateDynamic("video_result")(video_result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureSidecarVideoItem]
  }
}

