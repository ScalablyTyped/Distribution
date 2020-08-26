package typings.igniteUi

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellRightClickEventUIParam extends js.Object {
  /**
    * Gets a reference to cell DOM element.
    */
  var cellElement: js.UndefOr[Element] = js.native
  /**
    * Gets the column index of the DOM element.
    */
  var colIndex: js.UndefOr[Double] = js.native
  /**
    * Gets the column key.
    */
  var colKey: js.UndefOr[String] = js.native
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the row DOM element.
    */
  var row: js.UndefOr[Element] = js.native
  /**
    * Gets the row index.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /**
    * Gets the row key.
    */
  var rowKey: js.UndefOr[js.Any] = js.native
}

object CellRightClickEventUIParam {
  @scala.inline
  def apply(): CellRightClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellRightClickEventUIParam]
  }
  @scala.inline
  implicit class CellRightClickEventUIParamOps[Self <: CellRightClickEventUIParam] (val x: Self) extends AnyVal {
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
    def setCellElement(value: Element): Self = this.set("cellElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellElement: Self = this.set("cellElement", js.undefined)
    @scala.inline
    def setColIndex(value: Double): Self = this.set("colIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColIndex: Self = this.set("colIndex", js.undefined)
    @scala.inline
    def setColKey(value: String): Self = this.set("colKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColKey: Self = this.set("colKey", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setRow(value: Element): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    @scala.inline
    def setRowKey(value: js.Any): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowKey: Self = this.set("rowKey", js.undefined)
  }
  
}

