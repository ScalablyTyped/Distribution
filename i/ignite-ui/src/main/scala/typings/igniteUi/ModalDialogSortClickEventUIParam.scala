package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogSortClickEventUIParam extends js.Object {
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to GridSorting.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogSortClickEventUIParam {
  @scala.inline
  def apply(columnKey: String = null, modalDialogElement: String = null, owner: js.Any = null): ModalDialogSortClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (modalDialogElement != null) __obj.updateDynamic("modalDialogElement")(modalDialogElement.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalDialogSortClickEventUIParam]
  }
}

