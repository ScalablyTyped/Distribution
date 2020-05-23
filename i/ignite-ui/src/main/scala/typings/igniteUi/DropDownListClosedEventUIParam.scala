package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListClosedEventUIParam extends js.Object {
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

object DropDownListClosedEventUIParam {
  @scala.inline
  def apply(editor: js.Any = null, editorInput: js.Any = null, list: js.Any = null, owner: js.Any = null): DropDownListClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (editorInput != null) __obj.updateDynamic("editorInput")(editorInput.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownListClosedEventUIParam]
  }
}

