package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileExtensionsValidatingEventUIParam extends js.Object {
  /**
  	 * Gets the file extension.
  	 */
  var fileExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the full file name.
  	 */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the the igUpload widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FileExtensionsValidatingEventUIParam {
  @scala.inline
  def apply(fileExtension: java.lang.String = null, fileName: java.lang.String = null, owner: js.Any = null): FileExtensionsValidatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[FileExtensionsValidatingEventUIParam]
  }
}

