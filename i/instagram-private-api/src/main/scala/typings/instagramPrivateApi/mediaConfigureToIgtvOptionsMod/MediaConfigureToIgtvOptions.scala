package typings.instagramPrivateApi.mediaConfigureToIgtvOptionsMod

import typings.instagramPrivateApi.anon.Androidversion
import typings.instagramPrivateApi.anon.Cropbottom
import typings.instagramPrivateApi.anon.LengthSourcetype
import typings.instagramPrivateApi.anon.Numreupload
import typings.instagramPrivateApi.anon.Sourceheight
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigureToIgtvOptions extends js.Object {
  var audio_muted: js.UndefOr[Boolean] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var clips: js.UndefOr[js.Array[LengthSourcetype]] = js.undefined
  var date_time_original: js.UndefOr[String] = js.undefined
  var device: js.UndefOr[Androidversion] = js.undefined
  var extra: Sourceheight
  var feed_preview_crop: js.UndefOr[Cropbottom | String] = js.undefined
  var filter_type: js.UndefOr[String] = js.undefined
  var igtv_share_preview_to_feed: js.UndefOr[`1` | `0`] = js.undefined
  var length: Double
  var media_folder: js.UndefOr[String] = js.undefined
  var poster_frame_index: js.UndefOr[Double] = js.undefined
  var retryContext: js.UndefOr[Numreupload] = js.undefined
  var source_type: js.UndefOr[`3` | `4`] = js.undefined
  var timezone_offset: js.UndefOr[String] = js.undefined
  var title: String
  var upload_id: String
}

object MediaConfigureToIgtvOptions {
  @scala.inline
  def apply(
    extra: Sourceheight,
    length: Double,
    title: String,
    upload_id: String,
    audio_muted: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    clips: js.Array[LengthSourcetype] = null,
    date_time_original: String = null,
    device: Androidversion = null,
    feed_preview_crop: Cropbottom | String = null,
    filter_type: String = null,
    igtv_share_preview_to_feed: `1` | `0` = null,
    media_folder: String = null,
    poster_frame_index: js.UndefOr[Double] = js.undefined,
    retryContext: Numreupload = null,
    source_type: `3` | `4` = null,
    timezone_offset: String = null
  ): MediaConfigureToIgtvOptions = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    if (!js.isUndefined(audio_muted)) __obj.updateDynamic("audio_muted")(audio_muted.get.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clips != null) __obj.updateDynamic("clips")(clips.asInstanceOf[js.Any])
    if (date_time_original != null) __obj.updateDynamic("date_time_original")(date_time_original.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (feed_preview_crop != null) __obj.updateDynamic("feed_preview_crop")(feed_preview_crop.asInstanceOf[js.Any])
    if (filter_type != null) __obj.updateDynamic("filter_type")(filter_type.asInstanceOf[js.Any])
    if (igtv_share_preview_to_feed != null) __obj.updateDynamic("igtv_share_preview_to_feed")(igtv_share_preview_to_feed.asInstanceOf[js.Any])
    if (media_folder != null) __obj.updateDynamic("media_folder")(media_folder.asInstanceOf[js.Any])
    if (!js.isUndefined(poster_frame_index)) __obj.updateDynamic("poster_frame_index")(poster_frame_index.get.asInstanceOf[js.Any])
    if (retryContext != null) __obj.updateDynamic("retryContext")(retryContext.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (timezone_offset != null) __obj.updateDynamic("timezone_offset")(timezone_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureToIgtvOptions]
  }
}

