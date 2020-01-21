package typings.instagramPrivateApi.postingIgtvOptionsMod

import typings.instagramPrivateApi.AnonBottom
import typings.instagramPrivateApi.PartialMediaConfigureToIgtvOptions
import typings.instagramPrivateApi.PartialUploadVideoOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostingIgtvOptions extends js.Object {
  var audioMuted: js.UndefOr[Boolean] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var configureOptions: js.UndefOr[PartialMediaConfigureToIgtvOptions] = js.undefined
  var coverFrame: Buffer
  var feedPreviewCrop: js.UndefOr[AnonBottom] = js.undefined
  var maxTranscodeTries: js.UndefOr[Double] = js.undefined
  var shareToFeed: js.UndefOr[Boolean] = js.undefined
  var title: String
  var transcodeDelay: js.UndefOr[Double] = js.undefined
  var uploadOptions: js.UndefOr[PartialUploadVideoOptions] = js.undefined
  var video: Buffer
}

object PostingIgtvOptions {
  @scala.inline
  def apply(
    coverFrame: Buffer,
    title: String,
    video: Buffer,
    audioMuted: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    configureOptions: PartialMediaConfigureToIgtvOptions = null,
    feedPreviewCrop: AnonBottom = null,
    maxTranscodeTries: Int | Double = null,
    shareToFeed: js.UndefOr[Boolean] = js.undefined,
    transcodeDelay: Int | Double = null,
    uploadOptions: PartialUploadVideoOptions = null
  ): PostingIgtvOptions = {
    val __obj = js.Dynamic.literal(coverFrame = coverFrame.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    if (!js.isUndefined(audioMuted)) __obj.updateDynamic("audioMuted")(audioMuted.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (configureOptions != null) __obj.updateDynamic("configureOptions")(configureOptions.asInstanceOf[js.Any])
    if (feedPreviewCrop != null) __obj.updateDynamic("feedPreviewCrop")(feedPreviewCrop.asInstanceOf[js.Any])
    if (maxTranscodeTries != null) __obj.updateDynamic("maxTranscodeTries")(maxTranscodeTries.asInstanceOf[js.Any])
    if (!js.isUndefined(shareToFeed)) __obj.updateDynamic("shareToFeed")(shareToFeed.asInstanceOf[js.Any])
    if (transcodeDelay != null) __obj.updateDynamic("transcodeDelay")(transcodeDelay.asInstanceOf[js.Any])
    if (uploadOptions != null) __obj.updateDynamic("uploadOptions")(uploadOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingIgtvOptions]
  }
}

