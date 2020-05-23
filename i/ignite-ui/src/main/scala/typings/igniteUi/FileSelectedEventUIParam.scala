package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSelectedEventUIParam extends js.Object {
  /**
    * Gets the unique identifier of the file.
    */
  var fileId: js.UndefOr[Double] = js.undefined
  /**
    * Gets the name of the uploaded file.
    */
  var filePath: js.UndefOr[String] = js.undefined
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FileSelectedEventUIParam {
  @scala.inline
  def apply(fileId: js.UndefOr[Double] = js.undefined, filePath: String = null, owner: js.Any = null): FileSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileId)) __obj.updateDynamic("fileId")(fileId.get.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSelectedEventUIParam]
  }
}

