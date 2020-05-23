package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadAbortedEventUIParam extends js.Object {
  /**
    * Gets the unique identifier of the file.
    */
  var fileId: js.UndefOr[Double] = js.undefined
  /**
    * Gets the name of the uploaded file.
    */
  var filePath: js.UndefOr[String] = js.undefined
  /**
    * Gets the current file status.
    */
  var fileStatus: js.UndefOr[Double] = js.undefined
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the file size of the uploaded file.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
  /**
    * Gets the uploaded bytes.
    */
  var uploadedBytes: js.UndefOr[Double] = js.undefined
}

object FileUploadAbortedEventUIParam {
  @scala.inline
  def apply(
    fileId: js.UndefOr[Double] = js.undefined,
    filePath: String = null,
    fileStatus: js.UndefOr[Double] = js.undefined,
    owner: js.Any = null,
    totalSize: js.UndefOr[Double] = js.undefined,
    uploadedBytes: js.UndefOr[Double] = js.undefined
  ): FileUploadAbortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileId)) __obj.updateDynamic("fileId")(fileId.get.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (!js.isUndefined(fileStatus)) __obj.updateDynamic("fileStatus")(fileStatus.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadedBytes)) __obj.updateDynamic("uploadedBytes")(uploadedBytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadAbortedEventUIParam]
  }
}

