package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChangedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the old text.
  	 */
  var oldText: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the new text.
  	 */
  var text: js.UndefOr[String] = js.undefined
}

object TextChangedEventUIParam {
  @scala.inline
  def apply(oldText: String = null, owner: js.Any = null, text: String = null): TextChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (oldText != null) __obj.updateDynamic("oldText")(oldText.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChangedEventUIParam]
  }
}

