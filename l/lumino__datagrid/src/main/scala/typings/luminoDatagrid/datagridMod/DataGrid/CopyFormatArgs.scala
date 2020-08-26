package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.datamodelMod.DataModel.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the arguments to a copy format function.
  */
@js.native
trait CopyFormatArgs extends js.Object {
  /**
    * The column index of the value.
    */
  var column: Double = js.native
  /**
    * The metadata for the cell.
    */
  var metadata: Metadata = js.native
  /**
    * The cell region for the value.
    */
  var region: CellRegion = js.native
  /**
    * The row index of the value.
    */
  var row: Double = js.native
  /**
    * The value for the cell.
    */
  var value: js.Any = js.native
}

object CopyFormatArgs {
  @scala.inline
  def apply(column: Double, metadata: Metadata, region: CellRegion, row: Double, value: js.Any): CopyFormatArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyFormatArgs]
  }
  @scala.inline
  implicit class CopyFormatArgsOps[Self <: CopyFormatArgs] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: CellRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

