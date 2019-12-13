package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashToDashIgtvDotOptionsMod

import typings.instagramDashPrivateDashApi.Anon_3
import typings.instagramDashPrivateDashApi.Anon_AndroidreleaseAndroidversion
import typings.instagramDashPrivateDashApi.Anon_Cropbottom
import typings.instagramDashPrivateDashApi.Anon_Numreupload
import typings.instagramDashPrivateDashApi.Anon_Sourceheight
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`0`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`1`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`3`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigureToIgtvOptions extends js.Object {
  var audio_muted: js.UndefOr[Boolean] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var clips: js.UndefOr[js.Array[Anon_3]] = js.undefined
  var date_time_original: js.UndefOr[String] = js.undefined
  var device: js.UndefOr[Anon_AndroidreleaseAndroidversion] = js.undefined
  var extra: Anon_Sourceheight
  var feed_preview_crop: js.UndefOr[Anon_Cropbottom | String] = js.undefined
  var filter_type: js.UndefOr[String] = js.undefined
  var igtv_share_preview_to_feed: js.UndefOr[`1` | `0`] = js.undefined
  var length: Double
  var media_folder: js.UndefOr[String] = js.undefined
  var poster_frame_index: js.UndefOr[Double] = js.undefined
  var retryContext: js.UndefOr[Anon_Numreupload] = js.undefined
  var source_type: js.UndefOr[`3` | `4`] = js.undefined
  var timezone_offset: js.UndefOr[String] = js.undefined
  var title: String
  var upload_id: String
}

object MediaConfigureToIgtvOptions {
  @scala.inline
  def apply(
    extra: Anon_Sourceheight,
    length: Double,
    title: String,
    upload_id: String,
    audio_muted: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    clips: js.Array[Anon_3] = null,
    date_time_original: String = null,
    device: Anon_AndroidreleaseAndroidversion = null,
    feed_preview_crop: Anon_Cropbottom | String = null,
    filter_type: String = null,
    igtv_share_preview_to_feed: `1` | `0` = null,
    media_folder: String = null,
    poster_frame_index: Int | Double = null,
    retryContext: Anon_Numreupload = null,
    source_type: `3` | `4` = null,
    timezone_offset: String = null
  ): MediaConfigureToIgtvOptions = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    if (!js.isUndefined(audio_muted)) __obj.updateDynamic("audio_muted")(audio_muted.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clips != null) __obj.updateDynamic("clips")(clips.asInstanceOf[js.Any])
    if (date_time_original != null) __obj.updateDynamic("date_time_original")(date_time_original.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (feed_preview_crop != null) __obj.updateDynamic("feed_preview_crop")(feed_preview_crop.asInstanceOf[js.Any])
    if (filter_type != null) __obj.updateDynamic("filter_type")(filter_type.asInstanceOf[js.Any])
    if (igtv_share_preview_to_feed != null) __obj.updateDynamic("igtv_share_preview_to_feed")(igtv_share_preview_to_feed.asInstanceOf[js.Any])
    if (media_folder != null) __obj.updateDynamic("media_folder")(media_folder.asInstanceOf[js.Any])
    if (poster_frame_index != null) __obj.updateDynamic("poster_frame_index")(poster_frame_index.asInstanceOf[js.Any])
    if (retryContext != null) __obj.updateDynamic("retryContext")(retryContext.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (timezone_offset != null) __obj.updateDynamic("timezone_offset")(timezone_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureToIgtvOptions]
  }
}

