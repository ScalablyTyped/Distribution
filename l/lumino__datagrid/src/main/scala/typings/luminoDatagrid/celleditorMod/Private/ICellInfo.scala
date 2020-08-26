package typings.luminoDatagrid.celleditorMod.Private

import typings.luminoDatagrid.datagridMod.DataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for cell properties.
  */
@js.native
trait ICellInfo extends js.Object {
  var column: Double = js.native
  var data: js.Any = js.native
  var grid: DataGrid = js.native
  var height: Double = js.native
  var row: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object ICellInfo {
  @scala.inline
  def apply(
    column: Double,
    data: js.Any,
    grid: DataGrid,
    height: Double,
    row: Double,
    width: Double,
    x: Double,
    y: Double
  ): ICellInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellInfo]
  }
  @scala.inline
  implicit class ICellInfoOps[Self <: ICellInfo] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrid(value: DataGrid): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

