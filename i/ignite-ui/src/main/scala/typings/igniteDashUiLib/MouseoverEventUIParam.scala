package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseoverEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the editor input field.
  	 */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the event target.
  	 */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the event object of the browser.
  	 */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object MouseoverEventUIParam {
  @scala.inline
  def apply(
    editorInput: js.Any = null,
    element: js.Any = null,
    originalEvent: js.Any = null,
    owner: js.Any = null
  ): MouseoverEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (editorInput != null) __obj.updateDynamic("editorInput")(editorInput)
    if (element != null) __obj.updateDynamic("element")(element)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[MouseoverEventUIParam]
  }
}

