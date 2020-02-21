package typings.instagramPrivateApi.uploadVideoOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadVideoOptions extends js.Object {
  var duration: Double
  var forAlbum: js.UndefOr[Boolean] = js.undefined
  var forDirectStory: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var isDirect: js.UndefOr[Boolean] = js.undefined
  var isDirectVoice: js.UndefOr[Boolean] = js.undefined
  var isIgtvVideo: js.UndefOr[Boolean] = js.undefined
  var isSidecar: js.UndefOr[Boolean] = js.undefined
  var mediaType: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var uploadId: js.UndefOr[String] = js.undefined
  var uploadName: js.UndefOr[String] = js.undefined
  var video: Buffer
  var waterfallId: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object UploadVideoOptions {
  @scala.inline
  def apply(
    duration: Double,
    video: Buffer,
    forAlbum: js.UndefOr[Boolean] = js.undefined,
    forDirectStory: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    isDirect: js.UndefOr[Boolean] = js.undefined,
    isDirectVoice: js.UndefOr[Boolean] = js.undefined,
    isIgtvVideo: js.UndefOr[Boolean] = js.undefined,
    isSidecar: js.UndefOr[Boolean] = js.undefined,
    mediaType: String = null,
    offset: Int | Double = null,
    uploadId: String = null,
    uploadName: String = null,
    waterfallId: String = null,
    width: Int | Double = null
  ): UploadVideoOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    if (!js.isUndefined(forAlbum)) __obj.updateDynamic("forAlbum")(forAlbum.asInstanceOf[js.Any])
    if (!js.isUndefined(forDirectStory)) __obj.updateDynamic("forDirectStory")(forDirectStory.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isDirect)) __obj.updateDynamic("isDirect")(isDirect.asInstanceOf[js.Any])
    if (!js.isUndefined(isDirectVoice)) __obj.updateDynamic("isDirectVoice")(isDirectVoice.asInstanceOf[js.Any])
    if (!js.isUndefined(isIgtvVideo)) __obj.updateDynamic("isIgtvVideo")(isIgtvVideo.asInstanceOf[js.Any])
    if (!js.isUndefined(isSidecar)) __obj.updateDynamic("isSidecar")(isSidecar.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (uploadName != null) __obj.updateDynamic("uploadName")(uploadName.asInstanceOf[js.Any])
    if (waterfallId != null) __obj.updateDynamic("waterfallId")(waterfallId.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadVideoOptions]
  }
}

