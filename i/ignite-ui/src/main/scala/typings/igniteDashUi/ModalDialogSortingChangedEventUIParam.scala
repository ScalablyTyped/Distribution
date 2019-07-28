package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogSortingChangedEventUIParam extends js.Object {
  /**
  	 * Gets the column key.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets whether column should be ascending or not. If true it should be ascending
  	 */
  var isAsc: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets a reference to the modal dialog element. This is a jQuery object.
  	 */
  var modalDialogElement: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to GridSorting.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogSortingChangedEventUIParam {
  @scala.inline
  def apply(
    columnKey: String = null,
    isAsc: js.UndefOr[Boolean] = js.undefined,
    modalDialogElement: String = null,
    owner: js.Any = null
  ): ModalDialogSortingChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (!js.isUndefined(isAsc)) __obj.updateDynamic("isAsc")(isAsc)
    if (modalDialogElement != null) __obj.updateDynamic("modalDialogElement")(modalDialogElement)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ModalDialogSortingChangedEventUIParam]
  }
}

