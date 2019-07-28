package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogOpeningEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the modal dialog element. This is a jQuery object.
  	 */
  var modalDialogElement: js.UndefOr[String] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogOpeningEventUIParam {
  @scala.inline
  def apply(modalDialogElement: String = null, owner: js.Any = null): ModalDialogOpeningEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (modalDialogElement != null) __obj.updateDynamic("modalDialogElement")(modalDialogElement)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ModalDialogOpeningEventUIParam]
  }
}

