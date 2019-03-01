package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadedEventUIParam extends js.Object {
  /**
  	 * Gets the unique identifier of the file.
  	 */
  var fileId: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets reference to the fileInfo object - containing information for  fileName, fileSize, serverMessage(if returned from server side), etc.
  	 */
  var fileInfo: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the name of the uploaded file.
  	 */
  var filePath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the igUpload widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the file size of the uploaded file.
  	 */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
}

object FileUploadedEventUIParam {
  @scala.inline
  def apply(
    fileId: scala.Int | scala.Double = null,
    fileInfo: js.Any = null,
    filePath: java.lang.String = null,
    owner: js.Any = null,
    totalSize: scala.Int | scala.Double = null
  ): FileUploadedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (fileInfo != null) __obj.updateDynamic("fileInfo")(fileInfo)
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadedEventUIParam]
  }
}

