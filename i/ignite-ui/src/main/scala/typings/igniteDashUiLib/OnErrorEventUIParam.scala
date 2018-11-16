package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnErrorEventUIParam extends js.Object {
  /**
  	 * Gets the current errorCode.
  	 */
  var errorCode: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the detailed error description.
  	 */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the error type - it could be clientside or serverside.
  	 */
  var errorType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the identifier of the file for which the event is fired(after that it can be used API function getFileInfo). NOTE: It is possible to be null in some cases: try to drop multiple files when mode is single , check maximum allowed uploading files fails or check for count of maximum allowed simultaneous files upload fails.
  	 */
  var fileId: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the igUpload widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the specific server message returned by server - if errorType is serverside.
  	 */
  var serverMessage: js.UndefOr[java.lang.String] = js.undefined
}

