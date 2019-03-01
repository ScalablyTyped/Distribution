package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadAbortedEventUIParam extends js.Object {
  /**
  	 * Gets the unique identifier of the file.
  	 */
  var fileId: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the name of the uploaded file.
  	 */
  var filePath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the current file status.
  	 */
  var fileStatus: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the igUpload widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the file size of the uploaded file.
  	 */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the uploaded bytes.
  	 */
  var uploadedBytes: js.UndefOr[scala.Double] = js.undefined
}

object FileUploadAbortedEventUIParam {
  @scala.inline
  def apply(
    fileId: scala.Int | scala.Double = null,
    filePath: java.lang.String = null,
    fileStatus: scala.Int | scala.Double = null,
    owner: js.Any = null,
    totalSize: scala.Int | scala.Double = null,
    uploadedBytes: scala.Int | scala.Double = null
  ): FileUploadAbortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (fileStatus != null) __obj.updateDynamic("fileStatus")(fileStatus.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    if (uploadedBytes != null) __obj.updateDynamic("uploadedBytes")(uploadedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadAbortedEventUIParam]
  }
}

