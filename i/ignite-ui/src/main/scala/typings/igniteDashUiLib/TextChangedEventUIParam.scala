package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChangedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the old text.
  	 */
  var oldText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the new text.
  	 */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TextChangedEventUIParam {
  @scala.inline
  def apply(oldText: java.lang.String = null, owner: js.Any = null, text: java.lang.String = null): TextChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (oldText != null) __obj.updateDynamic("oldText")(oldText)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextChangedEventUIParam]
  }
}

