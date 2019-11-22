package typings.instagramDashPrivateDashApi.distTypesUploadDotVideoDotOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadVideoOptions extends js.Object {
  var duration: Double
  var forAlbum: js.UndefOr[Boolean] = js.undefined
  var forDirectStory: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var isDirect: js.UndefOr[Boolean] = js.undefined
  var isSidecar: js.UndefOr[Boolean] = js.undefined
  var mediaType: js.UndefOr[String] = js.undefined
  var uploadId: js.UndefOr[String] = js.undefined
  var video: Buffer
  var width: Double
}

object UploadVideoOptions {
  @scala.inline
  def apply(
    duration: Double,
    height: Double,
    video: Buffer,
    width: Double,
    forAlbum: js.UndefOr[Boolean] = js.undefined,
    forDirectStory: js.UndefOr[Boolean] = js.undefined,
    isDirect: js.UndefOr[Boolean] = js.undefined,
    isSidecar: js.UndefOr[Boolean] = js.undefined,
    mediaType: String = null,
    uploadId: String = null
  ): UploadVideoOptions = {
    val __obj = js.Dynamic.literal(duration = duration, height = height, video = video, width = width)
    if (!js.isUndefined(forAlbum)) __obj.updateDynamic("forAlbum")(forAlbum)
    if (!js.isUndefined(forDirectStory)) __obj.updateDynamic("forDirectStory")(forDirectStory)
    if (!js.isUndefined(isDirect)) __obj.updateDynamic("isDirect")(isDirect)
    if (!js.isUndefined(isSidecar)) __obj.updateDynamic("isSidecar")(isSidecar)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId)
    __obj.asInstanceOf[UploadVideoOptions]
  }
}

