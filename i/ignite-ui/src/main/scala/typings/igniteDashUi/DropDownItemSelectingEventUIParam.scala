package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownItemSelectingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the editor container.
  	 */
  var editor: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the editable input.
  	 */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the list item which is about to be selected.
  	 */
  var item: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the list contaier.
  	 */
  var list: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DropDownItemSelectingEventUIParam {
  @scala.inline
  def apply(
    editor: js.Any = null,
    editorInput: js.Any = null,
    item: js.Any = null,
    list: js.Any = null,
    owner: js.Any = null
  ): DropDownItemSelectingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (editorInput != null) __obj.updateDynamic("editorInput")(editorInput)
    if (item != null) __obj.updateDynamic("item")(item)
    if (list != null) __obj.updateDynamic("list")(list)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[DropDownItemSelectingEventUIParam]
  }
}

