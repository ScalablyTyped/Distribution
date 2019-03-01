package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListClosingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the editor container.
  	 */
  var editor: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the editable input.
  	 */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the list contaier.
  	 */
  var list: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DropDownListClosingEventUIParam {
  @scala.inline
  def apply(editor: js.Any = null, editorInput: js.Any = null, list: js.Any = null, owner: js.Any = null): DropDownListClosingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (editorInput != null) __obj.updateDynamic("editorInput")(editorInput)
    if (list != null) __obj.updateDynamic("list")(list)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[DropDownListClosingEventUIParam]
  }
}

