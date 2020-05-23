package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<instagram-private-api.instagram-private-api/dist/types/upload.video.options.UploadVideoOptions> */
trait PartialUploadVideoOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
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
  var video: js.UndefOr[typings.node.Buffer] = js.undefined
  var waterfallId: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialUploadVideoOptions {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    forAlbum: js.UndefOr[Boolean] = js.undefined,
    forDirectStory: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    isDirect: js.UndefOr[Boolean] = js.undefined,
    isDirectVoice: js.UndefOr[Boolean] = js.undefined,
    isIgtvVideo: js.UndefOr[Boolean] = js.undefined,
    isSidecar: js.UndefOr[Boolean] = js.undefined,
    mediaType: String = null,
    offset: js.UndefOr[Double] = js.undefined,
    uploadId: String = null,
    uploadName: String = null,
    video: typings.node.Buffer = null,
    waterfallId: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): PartialUploadVideoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forAlbum)) __obj.updateDynamic("forAlbum")(forAlbum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forDirectStory)) __obj.updateDynamic("forDirectStory")(forDirectStory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDirect)) __obj.updateDynamic("isDirect")(isDirect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDirectVoice)) __obj.updateDynamic("isDirectVoice")(isDirectVoice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isIgtvVideo)) __obj.updateDynamic("isIgtvVideo")(isIgtvVideo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSidecar)) __obj.updateDynamic("isSidecar")(isSidecar.get.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (uploadName != null) __obj.updateDynamic("uploadName")(uploadName.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (waterfallId != null) __obj.updateDynamic("waterfallId")(waterfallId.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUploadVideoOptions]
  }
}

