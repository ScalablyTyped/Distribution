package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueChangingEventUIParam extends js.Object {
  /**
    * Gets the editor input.
    */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the editor's new value. The argument type might differ depending on the editor type.
    */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the editor's old value. The argument type might differ depending on the editor type.
    */
  var oldValue: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ValueChangingEventUIParam {
  @scala.inline
  def apply(editorInput: js.Any = null, newValue: js.Any = null, oldValue: js.Any = null, owner: js.Any = null): ValueChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (editorInput != null) __obj.updateDynamic("editorInput")(editorInput.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueChangingEventUIParam]
  }
}

