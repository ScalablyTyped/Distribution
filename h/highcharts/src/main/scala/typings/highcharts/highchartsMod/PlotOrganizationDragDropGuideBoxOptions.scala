package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotOrganizationDragDropGuideBoxOptions extends js.Object {
  /**
    * (Highcharts) Style options for the guide box default state.
    */
  var default: js.UndefOr[PlotOrganizationDragDropGuideBoxDefaultOptions] = js.undefined
}

object PlotOrganizationDragDropGuideBoxOptions {
  @scala.inline
  def apply(default: PlotOrganizationDragDropGuideBoxDefaultOptions = null): PlotOrganizationDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[PlotOrganizationDragDropGuideBoxOptions]
  }
}

