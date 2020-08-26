package typings.luminoDatagrid.datagridMod.DataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which defines the default sizes for a data grid.
  */
@js.native
trait DefaultSizes_ extends js.Object {
  /**
    * The default height of a column header.
    */
  val columnHeaderHeight: Double = js.native
  /**
    * The default width of a column.
    */
  val columnWidth: Double = js.native
  /**
    * The default width of a row header.
    */
  val rowHeaderWidth: Double = js.native
  /**
    * The default height of a row.
    */
  val rowHeight: Double = js.native
}

object DefaultSizes_ {
  @scala.inline
  def apply(columnHeaderHeight: Double, columnWidth: Double, rowHeaderWidth: Double, rowHeight: Double): DefaultSizes_ = {
    val __obj = js.Dynamic.literal(columnHeaderHeight = columnHeaderHeight.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], rowHeaderWidth = rowHeaderWidth.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSizes_]
  }
  @scala.inline
  implicit class DefaultSizes_Ops[Self <: DefaultSizes_] (val x: Self) extends AnyVal {
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
    def setColumnHeaderHeight(value: Double): Self = this.set("columnHeaderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowHeaderWidth(value: Double): Self = this.set("rowHeaderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
  }
  
}

