package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellSelectionChangedEventUIParam extends js.Object {
  /**
    * Gets reference to the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.native
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets reference to selected cells object array.
    */
  var selectedCells: js.UndefOr[js.Array[_]] = js.native
}

object CellSelectionChangedEventUIParam {
  @scala.inline
  def apply(): CellSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectionChangedEventUIParam]
  }
  @scala.inline
  implicit class CellSelectionChangedEventUIParamOps[Self <: CellSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def setCell(value: js.Any): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("cell", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setSelectedCellsVarargs(value: js.Any*): Self = this.set("selectedCells", js.Array(value :_*))
    @scala.inline
    def setSelectedCells(value: js.Array[_]): Self = this.set("selectedCells", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedCells: Self = this.set("selectedCells", js.undefined)
  }
  
}

