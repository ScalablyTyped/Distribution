package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVectorClusterStatesOptions extends js.Object {
  var hover: js.UndefOr[PlotVectorClusterStatesHoverOptions] = js.undefined
}

object PlotVectorClusterStatesOptions {
  @scala.inline
  def apply(hover: PlotVectorClusterStatesHoverOptions = null): PlotVectorClusterStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVectorClusterStatesOptions]
  }
}

