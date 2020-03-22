package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMappointClusterEventsOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Fires when the cluster point is clicked and
    * `drillToCluster` is enabled. One parameter, `event`, is passed to the
    * function. The default action is to zoom to the cluster points range. This
    * can be prevented by calling `event.preventDefault()`.
    */
  var drillToCluster: js.UndefOr[MarkerClusterDrillCallbackFunction] = js.undefined
}

object PlotMappointClusterEventsOptions {
  @scala.inline
  def apply(drillToCluster: MarkerClusterDrillCallbackFunction = null): PlotMappointClusterEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (drillToCluster != null) __obj.updateDynamic("drillToCluster")(drillToCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMappointClusterEventsOptions]
  }
}

