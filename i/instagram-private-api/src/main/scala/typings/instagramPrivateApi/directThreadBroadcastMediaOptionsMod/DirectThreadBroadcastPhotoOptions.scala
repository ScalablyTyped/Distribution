package typings.instagramPrivateApi.directThreadBroadcastMediaOptionsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadBroadcastPhotoOptions extends js.Object {
  var allowFullAspectRatio: js.UndefOr[Boolean] = js.undefined
  var file: Buffer
  var uploadId: js.UndefOr[String] = js.undefined
}

object DirectThreadBroadcastPhotoOptions {
  @scala.inline
  def apply(file: Buffer, allowFullAspectRatio: js.UndefOr[Boolean] = js.undefined, uploadId: String = null): DirectThreadBroadcastPhotoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullAspectRatio)) __obj.updateDynamic("allowFullAspectRatio")(allowFullAspectRatio.get.asInstanceOf[js.Any])
    if (uploadId != null) __obj.updateDynamic("uploadId")(uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadBroadcastPhotoOptions]
  }
}

