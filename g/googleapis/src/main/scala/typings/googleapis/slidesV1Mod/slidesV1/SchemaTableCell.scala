package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties and contents of each table cell.
  */
@js.native
trait SchemaTableCell extends js.Object {
  /**
    * Column span of the cell.
    */
  var columnSpan: js.UndefOr[Double] = js.native
  /**
    * The location of the cell within the table.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * Row span of the cell.
    */
  var rowSpan: js.UndefOr[Double] = js.native
  /**
    * The properties of the table cell.
    */
  var tableCellProperties: js.UndefOr[SchemaTableCellProperties] = js.native
  /**
    * The text content of the cell.
    */
  var text: js.UndefOr[SchemaTextContent] = js.native
}

object SchemaTableCell {
  @scala.inline
  def apply(): SchemaTableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCell]
  }
  @scala.inline
  implicit class SchemaTableCellOps[Self <: SchemaTableCell] (val x: Self) extends AnyVal {
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
    def setColumnSpan(value: Double): Self = this.set("columnSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSpan: Self = this.set("columnSpan", js.undefined)
    @scala.inline
    def setLocation(value: SchemaTableCellLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setTableCellProperties(value: SchemaTableCellProperties): Self = this.set("tableCellProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableCellProperties: Self = this.set("tableCellProperties", js.undefined)
    @scala.inline
    def setText(value: SchemaTextContent): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

