package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVennClusterStatesOptions extends js.Object {
  var hover: js.UndefOr[PlotVennClusterStatesHoverOptions] = js.undefined
}

object PlotVennClusterStatesOptions {
  @scala.inline
  def apply(hover: PlotVennClusterStatesHoverOptions = null): PlotVennClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVennClusterStatesOptions]
  }
}

