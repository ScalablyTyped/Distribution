package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFormDataSubmitEventUIParam extends js.Object {
  /**
  	 * Gets the unique identifier of the file.
  	 */
  var fileId: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets reference to the fileInfo object - containing information for  fileName, fileSize, serverMessage(if returned from the server-side), etc.
  	 */
  var fileInfo: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to FormData object(if the browser supports HTML5 file API) OR reference to jQuery representation of <form>.
  	 */
  var formData: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the igUpload widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to the original XMLHttpRequest object(if the browser supports HTML 5 file API - if not it is undefined).
  	 */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

object OnFormDataSubmitEventUIParam {
  @scala.inline
  def apply(
    fileId: Int | Double = null,
    fileInfo: js.Any = null,
    formData: js.Any = null,
    owner: js.Any = null,
    xhr: js.Any = null
  ): OnFormDataSubmitEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (fileInfo != null) __obj.updateDynamic("fileInfo")(fileInfo.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnFormDataSubmitEventUIParam]
  }
}

