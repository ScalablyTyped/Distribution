package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFormDataSubmitEventUIParam extends js.Object {
  /**
  	 * Gets the unique identifier of the file.
  	 */
  var fileId: js.UndefOr[scala.Double] = js.undefined
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

