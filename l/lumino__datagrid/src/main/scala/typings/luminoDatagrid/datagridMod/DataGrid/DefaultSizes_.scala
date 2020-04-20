package typings.luminoDatagrid.datagridMod.DataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which defines the default sizes for a data grid.
  */
trait DefaultSizes_ extends js.Object {
  /**
    * The default height of a column header.
    */
  val columnHeaderHeight: Double
  /**
    * The default width of a column.
    */
  val columnWidth: Double
  /**
    * The default width of a row header.
    */
  val rowHeaderWidth: Double
  /**
    * The default height of a row.
    */
  val rowHeight: Double
}

object DefaultSizes_ {
  @scala.inline
  def apply(columnHeaderHeight: Double, columnWidth: Double, rowHeaderWidth: Double, rowHeight: Double): DefaultSizes_ = {
    val __obj = js.Dynamic.literal(columnHeaderHeight = columnHeaderHeight.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], rowHeaderWidth = rowHeaderWidth.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSizes_]
  }
}

