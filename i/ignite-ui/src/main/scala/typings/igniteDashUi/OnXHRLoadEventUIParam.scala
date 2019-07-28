package typings.igniteDashUi

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
  def apply(fileId: Int | Double = null, fileInfo: js.Any = null, owner: js.Any = null, xhr: js.Any = null): OnXHRLoadEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (fileInfo != null) __obj.updateDynamic("fileInfo")(fileInfo)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[OnXHRLoadEventUIParam]
  }
}

