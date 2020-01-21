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
    fileId: Int | Double = null,
    filePath: String = null,
    fileStatus: Int | Double = null,
    owner: js.Any = null,
    totalSize: Int | Double = null,
    uploadedBytes: Int | Double = null
  ): FileUploadAbortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (fileStatus != null) __obj.updateDynamic("fileStatus")(fileStatus.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    if (uploadedBytes != null) __obj.updateDynamic("uploadedBytes")(uploadedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadAbortedEventUIParam]
  }
}

