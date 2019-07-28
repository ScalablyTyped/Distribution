package typings.igniteDashUi

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

object ValueChangedEventUIParam {
  @scala.inline
  def apply(
    editorInput: js.Any = null,
    newValue: js.Any = null,
    originalValue: js.Any = null,
    owner: js.Any = null
  ): ValueChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (editorInput != null) __obj.updateDynamic("editorInput")(editorInput)
    if (newValue != null) __obj.updateDynamic("newValue")(newValue)
    if (originalValue != null) __obj.updateDynamic("originalValue")(originalValue)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ValueChangedEventUIParam]
  }
}

