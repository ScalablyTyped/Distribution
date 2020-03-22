package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTreemapClusterStatesOptions extends js.Object {
  var hover: js.UndefOr[PlotTreemapClusterStatesHoverOptions] = js.undefined
}

object PlotTreemapClusterStatesOptions {
  @scala.inline
  def apply(hover: PlotTreemapClusterStatesHoverOptions = null): PlotTreemapClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTreemapClusterStatesOptions]
  }
}

