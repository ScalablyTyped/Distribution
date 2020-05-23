package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownItemSelectedEventUIParam extends js.Object {
  /**
    * Gets a reference to the editable input.
    */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the list item which is selected.
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

object DropDownItemSelectedEventUIParam {
  @scala.inline
  def apply(editorInput: js.Any = null, item: js.Any = null, list: js.Any = null, owner: js.Any = null): DropDownItemSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (editorInput != null) __obj.updateDynamic("editorInput")(editorInput.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownItemSelectedEventUIParam]
  }
}

