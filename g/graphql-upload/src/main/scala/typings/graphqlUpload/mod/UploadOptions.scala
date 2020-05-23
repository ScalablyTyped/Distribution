package typings.graphqlUpload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends js.Object {
  var maxFieldSize: js.UndefOr[Double] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var maxFiles: js.UndefOr[Double] = js.undefined
}

object UploadOptions {
  @scala.inline
  def apply(
    maxFieldSize: js.UndefOr[Double] = js.undefined,
    maxFileSize: js.UndefOr[Double] = js.undefined,
    maxFiles: js.UndefOr[Double] = js.undefined
  ): UploadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxFieldSize)) __obj.updateDynamic("maxFieldSize")(maxFieldSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFiles)) __obj.updateDynamic("maxFiles")(maxFiles.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
}

