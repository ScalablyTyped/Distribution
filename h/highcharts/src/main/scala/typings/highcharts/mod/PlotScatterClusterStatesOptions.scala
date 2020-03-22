package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatterClusterStatesOptions extends js.Object {
  var hover: js.UndefOr[PlotScatterClusterStatesHoverOptions] = js.undefined
}

object PlotScatterClusterStatesOptions {
  @scala.inline
  def apply(hover: PlotScatterClusterStatesHoverOptions = null): PlotScatterClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScatterClusterStatesOptions]
  }
}

