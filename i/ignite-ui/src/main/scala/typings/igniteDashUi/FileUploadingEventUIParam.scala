package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadingEventUIParam extends js.Object {
  /**
  	 * Gets the unique identifier of the file.
  	 */
  var fileId: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets reference to the fileInfo object - containing information for  fileName, fileSize, serverMessage(if returned from server side), etc.
  	 */
  var fileInfo: js.UndefOr[js.Any] = js.undefined
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

object FileUploadingEventUIParam {
  @scala.inline
  def apply(
    fileId: Int | Double = null,
    fileInfo: js.Any = null,
    filePath: String = null,
    fileStatus: Int | Double = null,
    owner: js.Any = null,
    totalSize: Int | Double = null,
    uploadedBytes: Int | Double = null
  ): FileUploadingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (fileInfo != null) __obj.updateDynamic("fileInfo")(fileInfo)
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (fileStatus != null) __obj.updateDynamic("fileStatus")(fileStatus.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    if (uploadedBytes != null) __obj.updateDynamic("uploadedBytes")(uploadedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadingEventUIParam]
  }
}

