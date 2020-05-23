package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnXHRLoadEventUIParam extends js.Object {
  /**
    * Gets the unique identifier of the file.
    */
  var fileId: js.UndefOr[Double] = js.undefined
  /**
    * Gets reference to the fileInfo object - containing information for  fileName, fileSize, serverMessage(if returned from the server-side), etc.
    */
  var fileInfo: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets reference to the original XMLHttpRequest object.
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

object OnXHRLoadEventUIParam {
  @scala.inline
  def apply(
    fileId: js.UndefOr[Double] = js.undefined,
    fileInfo: js.Any = null,
    owner: js.Any = null,
    xhr: js.Any = null
  ): OnXHRLoadEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileId)) __obj.updateDynamic("fileId")(fileId.get.asInstanceOf[js.Any])
    if (fileInfo != null) __obj.updateDynamic("fileInfo")(fileInfo.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnXHRLoadEventUIParam]
  }
}

