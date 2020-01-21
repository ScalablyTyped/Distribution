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
  def apply(maxFieldSize: Int | Double = null, maxFileSize: Int | Double = null, maxFiles: Int | Double = null): UploadOptions = {
    val __obj = js.Dynamic.literal()
    if (maxFieldSize != null) __obj.updateDynamic("maxFieldSize")(maxFieldSize.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
}

