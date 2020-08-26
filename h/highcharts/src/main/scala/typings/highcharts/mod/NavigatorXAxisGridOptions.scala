package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorXAxisGridOptions extends js.Object {
  /**
    * (Gantt) Set border color for the label grid lines.
    */
  var borderColor: js.UndefOr[ColorString] = js.native
  /**
    * (Gantt) Set border width of the label grid lines.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Set cell height for grid axis labels. By default this is
    * calculated from font size. This option only applies to horizontal axes.
    */
  var cellHeight: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Set specific options for each column (or row for horizontal axes)
    * in the grid. Each extra column/row is its own axis, and the axis options
    * can be set here.
    */
  var columns: js.UndefOr[js.Array[XAxisOptions]] = js.native
  /**
    * (Gantt) Enable grid on the axis labels. Defaults to true for Gantt
    * charts.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object NavigatorXAxisGridOptions {
  @scala.inline
  def apply(): NavigatorXAxisGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorXAxisGridOptions]
  }
  @scala.inline
  implicit class NavigatorXAxisGridOptionsOps[Self <: NavigatorXAxisGridOptions] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: ColorString): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: XAxisOptions*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[XAxisOptions]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

