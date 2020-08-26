package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDialogSortingChangedEventUIParam extends js.Object {
  /**
    * Gets the column key.
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Gets whether column should be ascending or not. If true it should be ascending
    */
  var isAsc: js.UndefOr[Boolean] = js.native
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.native
  /**
    * Gets a reference to GridSorting.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ModalDialogSortingChangedEventUIParam {
  @scala.inline
  def apply(): ModalDialogSortingChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogSortingChangedEventUIParam]
  }
  @scala.inline
  implicit class ModalDialogSortingChangedEventUIParamOps[Self <: ModalDialogSortingChangedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setIsAsc(value: Boolean): Self = this.set("isAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAsc: Self = this.set("isAsc", js.undefined)
    @scala.inline
    def setModalDialogElement(value: String): Self = this.set("modalDialogElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogElement: Self = this.set("modalDialogElement", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}

