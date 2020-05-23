package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileExtensionsValidatingEventUIParam extends js.Object {
  /**
    * Gets the file extension.
    */
  var fileExtension: js.UndefOr[String] = js.undefined
  /**
    * Gets the full file name.
    */
  var fileName: js.UndefOr[String] = js.undefined
  /**
    * Gets the the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FileExtensionsValidatingEventUIParam {
  @scala.inline
  def apply(fileExtension: String = null, fileName: String = null, owner: js.Any = null): FileExtensionsValidatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fileExtension != null) __obj.updateDynamic("fileExtension")(fileExtension.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileExtensionsValidatingEventUIParam]
  }
}

