package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MousemoveEventUIParam extends js.Object {
  /**
    * Gets a reference to the editor input field.
    */
  var editorInput: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the event target.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object MousemoveEventUIParam {
  @scala.inline
  def apply(editorInput: js.Any = null, element: js.Any = null, owner: js.Any = null): MousemoveEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (editorInput != null) __obj.updateDynamic("editorInput")(editorInput.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[MousemoveEventUIParam]
  }
}

