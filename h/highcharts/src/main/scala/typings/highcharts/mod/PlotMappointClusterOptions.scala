package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMappointClusterOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) When set to `false` prevent cluster overlapping -
    * this option works only when `layoutAlgorithm.type = "grid"`.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highmaps) Options for the cluster marker animation.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highcharts, Highmaps) Options for the cluster data labels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptionsObject] = js.undefined
  /**
    * (Highcharts, Highmaps) Zoom the plot area to the cluster points range
    * when a cluster is clicked.
    */
  var drillToCluster: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highmaps) Whether to enable the marker-clusters module.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  var events: js.UndefOr[PlotMappointClusterEventsOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) Options for layout algorithm. Inside there are
    * options to change the type of the algorithm, gridSize, distance or
    * iterations.
    */
  var layoutAlgorithm: js.UndefOr[PlotMappointClusterLayoutAlgorithmOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) Options for the cluster marker.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.undefined
  /**
    * (Highcharts, Highmaps) The minimum amount of points to be combined into a
    * cluster. This value has to be greater or equal to 2.
    */
  var minimumClusterSize: js.UndefOr[Double] = js.undefined
  var states: js.UndefOr[PlotMappointClusterStatesOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) An array defining zones within marker clusters.
    *
    * In styled mode, the color zones are styled with the
    * `.highcharts-cluster-zone-{n}` class, or custom classed from the
    * `className` option.
    */
  var zones: js.UndefOr[js.Array[PlotMappointClusterZonesOptions]] = js.undefined
}

object PlotMappointClusterOptions {
  @scala.inline
  def apply(
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | AnimationOptionsObject = null,
    dataLabels: DataLabelsOptionsObject = null,
    drillToCluster: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    events: PlotMappointClusterEventsOptions = null,
    layoutAlgorithm: PlotMappointClusterLayoutAlgorithmOptions = null,
    marker: PointMarkerOptionsObject = null,
    minimumClusterSize: Int | Double = null,
    states: PlotMappointClusterStatesOptions = null,
    zones: js.Array[PlotMappointClusterZonesOptions] = null
  ): PlotMappointClusterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(drillToCluster)) __obj.updateDynamic("drillToCluster")(drillToCluster.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (layoutAlgorithm != null) __obj.updateDynamic("layoutAlgorithm")(layoutAlgorithm.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (minimumClusterSize != null) __obj.updateDynamic("minimumClusterSize")(minimumClusterSize.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMappointClusterOptions]
  }
}

