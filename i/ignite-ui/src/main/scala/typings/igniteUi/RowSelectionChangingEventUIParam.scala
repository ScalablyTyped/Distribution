package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowSelectionChangingEventUIParam extends js.Object {
  /**
    * Gets the end index for a range row selection.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets reference to the row object.
    */
  var row: js.UndefOr[js.Any] = js.native
  /**
    * Gets reference to rows object array.
    */
  var selectedRows: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets the start index for a range row selection.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object RowSelectionChangingEventUIParam {
  @scala.inline
  def apply(): RowSelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSelectionChangingEventUIParam]
  }
  @scala.inline
  implicit class RowSelectionChangingEventUIParamOps[Self <: RowSelectionChangingEventUIParam] (val x: Self) extends AnyVal {
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
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRow(value: js.Any): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setSelectedRowsVarargs(value: js.Any*): Self = this.set("selectedRows", js.Array(value :_*))
    @scala.inline
    def setSelectedRows(value: js.Array[_]): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRows: Self = this.set("selectedRows", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
  
}

