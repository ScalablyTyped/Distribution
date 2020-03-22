package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMappointClusterStatesOptions extends js.Object {
  var hover: js.UndefOr[PlotMappointClusterStatesHoverOptions] = js.undefined
}

object PlotMappointClusterStatesOptions {
  @scala.inline
  def apply(hover: PlotMappointClusterStatesHoverOptions = null): PlotMappointClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMappointClusterStatesOptions]
  }
}

