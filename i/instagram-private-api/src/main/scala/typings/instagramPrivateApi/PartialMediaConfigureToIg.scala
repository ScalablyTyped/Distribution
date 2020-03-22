package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<instagram-private-api.instagram-private-api/dist/types/media.configure-to-igtv.options.MediaConfigureToIgtvOptions> */
trait PartialMediaConfigureToIg extends js.Object {
  var audio_muted: js.UndefOr[Boolean] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var clips: js.UndefOr[js.Array[AnonLengthSourcetype]] = js.undefined
  var date_time_original: js.UndefOr[String] = js.undefined
  var device: js.UndefOr[AnonAndroidversion] = js.undefined
  var extra: js.UndefOr[AnonSourceheight] = js.undefined
  var feed_preview_crop: js.UndefOr[AnonCropbottom | String] = js.undefined
  var filter_type: js.UndefOr[String] = js.undefined
  var igtv_share_preview_to_feed: js.UndefOr[`1` | `0`] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var media_folder: js.UndefOr[String] = js.undefined
  var poster_frame_index: js.UndefOr[Double] = js.undefined
  var retryContext: js.UndefOr[AnonNumreupload] = js.undefined
  var source_type: js.UndefOr[`3` | `4`] = js.undefined
  var timezone_offset: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var upload_id: js.UndefOr[String] = js.undefined
}

object PartialMediaConfigureToIg {
  @scala.inline
  def apply(
    audio_muted: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    clips: js.Array[AnonLengthSourcetype] = null,
    date_time_original: String = null,
    device: AnonAndroidversion = null,
    extra: AnonSourceheight = null,
    feed_preview_crop: AnonCropbottom | String = null,
    filter_type: String = null,
    igtv_share_preview_to_feed: `1` | `0` = null,
    length: Int | Double = null,
    media_folder: String = null,
    poster_frame_index: Int | Double = null,
    retryContext: AnonNumreupload = null,
    source_type: `3` | `4` = null,
    timezone_offset: String = null,
    title: String = null,
    upload_id: String = null
  ): PartialMediaConfigureToIg = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio_muted)) __obj.updateDynamic("audio_muted")(audio_muted.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (clips != null) __obj.updateDynamic("clips")(clips.asInstanceOf[js.Any])
    if (date_time_original != null) __obj.updateDynamic("date_time_original")(date_time_original.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (feed_preview_crop != null) __obj.updateDynamic("feed_preview_crop")(feed_preview_crop.asInstanceOf[js.Any])
    if (filter_type != null) __obj.updateDynamic("filter_type")(filter_type.asInstanceOf[js.Any])
    if (igtv_share_preview_to_feed != null) __obj.updateDynamic("igtv_share_preview_to_feed")(igtv_share_preview_to_feed.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (media_folder != null) __obj.updateDynamic("media_folder")(media_folder.asInstanceOf[js.Any])
    if (poster_frame_index != null) __obj.updateDynamic("poster_frame_index")(poster_frame_index.asInstanceOf[js.Any])
    if (retryContext != null) __obj.updateDynamic("retryContext")(retryContext.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (timezone_offset != null) __obj.updateDynamic("timezone_offset")(timezone_offset.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (upload_id != null) __obj.updateDynamic("upload_id")(upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMediaConfigureToIg]
  }
}

