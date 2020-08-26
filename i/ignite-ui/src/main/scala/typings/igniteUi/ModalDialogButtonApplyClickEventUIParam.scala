package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDialogButtonApplyClickEventUIParam extends js.Object {
  /**
    * Gets the array of column layouts.
    */
  var groupedColumnLayouts: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets the array of grouped columns.
    */
  var groupedColumns: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets a reference to the modal dialog element. This is a jQuery object.
    */
  var modalDialogElement: js.UndefOr[String] = js.native
  /**
    * Gets access the GroupBy widget object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets the array of sorted columns.
    */
  var sortingExpr: js.UndefOr[js.Array[_]] = js.native
}

object ModalDialogButtonApplyClickEventUIParam {
  @scala.inline
  def apply(): ModalDialogButtonApplyClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalDialogButtonApplyClickEventUIParam]
  }
  @scala.inline
  implicit class ModalDialogButtonApplyClickEventUIParamOps[Self <: ModalDialogButtonApplyClickEventUIParam] (val x: Self) extends AnyVal {
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
    def setGroupedColumnLayoutsVarargs(value: js.Any*): Self = this.set("groupedColumnLayouts", js.Array(value :_*))
    @scala.inline
    def setGroupedColumnLayouts(value: js.Array[_]): Self = this.set("groupedColumnLayouts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupedColumnLayouts: Self = this.set("groupedColumnLayouts", js.undefined)
    @scala.inline
    def setGroupedColumnsVarargs(value: js.Any*): Self = this.set("groupedColumns", js.Array(value :_*))
    @scala.inline
    def setGroupedColumns(value: js.Array[_]): Self = this.set("groupedColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupedColumns: Self = this.set("groupedColumns", js.undefined)
    @scala.inline
    def setModalDialogElement(value: String): Self = this.set("modalDialogElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalDialogElement: Self = this.set("modalDialogElement", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setSortingExprVarargs(value: js.Any*): Self = this.set("sortingExpr", js.Array(value :_*))
    @scala.inline
    def setSortingExpr(value: js.Array[_]): Self = this.set("sortingExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortingExpr: Self = this.set("sortingExpr", js.undefined)
  }
  
}

