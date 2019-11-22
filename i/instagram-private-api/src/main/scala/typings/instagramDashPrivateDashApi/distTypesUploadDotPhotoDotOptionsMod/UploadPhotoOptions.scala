package typings.instagramDashPrivateDashApi.distTypesUploadDotPhotoDotOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadPhotoOptions extends js.Object {
  var file: Buffer
  var isSidecar: js.UndefOr[Boolean] = js.undefined
  var uploadId: js.UndefOr[String] = js.undefined
}

object UploadPhotoOptions {
  @scala.inline
  def apply(file: Buffer, isSidecar: js.UndefOr[Boolean] = js.undefined, uploadId: String = null): UploadPhotoOptions = {
    val __obj = js.Dynamic.literal(file = file)
    if (!js.isUndefined(isSidecar)) __obj.updateDynamic("isSidecar")(isSidecar)
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId)
    __obj.asInstanceOf[UploadPhotoOptions]
  }
}

