package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueChangedEventUIParam extends js.Object {
  /**
  	 * Gets the editor input.
  	 */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the value entered from the user after internal formatting. The argument type might differ depending on the editor type.
  	 */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the value entered from the user before internal formatting. The argument type might differ depending on the editor type.
  	 */
  var originalValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

