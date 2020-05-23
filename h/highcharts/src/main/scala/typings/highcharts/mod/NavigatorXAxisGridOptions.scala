package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorXAxisGridOptions extends js.Object {
  /**
    * (Gantt) Set border color for the label grid lines.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Gantt) Set border width of the label grid lines.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) Set cell height for grid axis labels. By default this is
    * calculated from font size. This option only applies to horizontal axes.
    */
  var cellHeight: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) Set specific options for each column (or row for horizontal axes)
    * in the grid. Each extra column/row is its own axis, and the axis options
    * can be set here.
    */
  var columns: js.UndefOr[js.Array[XAxisOptions]] = js.undefined
  /**
    * (Gantt) Enable grid on the axis labels. Defaults to true for Gantt
    * charts.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object NavigatorXAxisGridOptions {
  @scala.inline
  def apply(
    borderColor: ColorString = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    cellHeight: js.UndefOr[Double] = js.undefined,
    columns: js.Array[XAxisOptions] = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): NavigatorXAxisGridOptions = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellHeight)) __obj.updateDynamic("cellHeight")(cellHeight.get.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorXAxisGridOptions]
  }
}

