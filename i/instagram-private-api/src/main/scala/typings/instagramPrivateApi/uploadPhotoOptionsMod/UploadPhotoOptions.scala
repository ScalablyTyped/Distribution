package typings.instagramPrivateApi.uploadPhotoOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadPhotoOptions extends js.Object {
  var file: Buffer
  var isSidecar: js.UndefOr[Boolean] = js.undefined
  var uploadId: js.UndefOr[String] = js.undefined
  var waterfallId: js.UndefOr[String] = js.undefined
}

object UploadPhotoOptions {
  @scala.inline
  def apply(
    file: Buffer,
    isSidecar: js.UndefOr[Boolean] = js.undefined,
    uploadId: String = null,
    waterfallId: String = null
  ): UploadPhotoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (!js.isUndefined(isSidecar)) __obj.updateDynamic("isSidecar")(isSidecar.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    if (waterfallId != null) __obj.updateDynamic("waterfallId")(waterfallId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPhotoOptions]
  }
}

