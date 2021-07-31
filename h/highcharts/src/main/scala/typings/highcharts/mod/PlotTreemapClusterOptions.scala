package typings.highcharts.mod

import typings.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreemapClusterOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) When set to `false` prevent cluster overlapping -
    * this option works only when `layoutAlgorithm.type = "grid"`.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Options for the cluster marker animation.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Options for the cluster data labels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptions] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Zoom the plot area to the cluster points range
    * when a cluster is clicked.
    */
  var drillToCluster: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Whether to enable the marker-clusters module.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var events: js.UndefOr[PlotTreemapClusterEventsOptions] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Options for layout algorithm. Inside there are
    * options to change the type of the algorithm, gridSize, distance or
    * iterations.
    */
  var layoutAlgorithm: js.UndefOr[PlotTreemapClusterLayoutAlgorithmOptions] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Options for the cluster marker.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The minimum amount of points to be combined into a
    * cluster. This value has to be greater or equal to 2.
    */
  var minimumClusterSize: js.UndefOr[Double] = js.undefined
  
  var states: js.UndefOr[PlotTreemapClusterStatesOptions] = js.undefined
  
  /**
    * (Highcharts, Highmaps) An array defining zones within marker clusters.
    *
    * In styled mode, the color zones are styled with the
    * `.highcharts-cluster-zone-{n}` class, or custom classed from the
    * `className` option.
    */
  var zones: js.UndefOr[js.Array[PlotTreemapClusterZonesOptions]] = js.undefined
}
object PlotTreemapClusterOptions {
  
  @scala.inline
  def apply(): PlotTreemapClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapClusterOptions]
  }
  
  @scala.inline
  implicit class PlotTreemapClusterOptionsMutableBuilder[Self <: PlotTreemapClusterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOverlapUndefined: Self = StObject.set(x, "allowOverlap", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setDataLabels(value: DataLabelsOptions): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDrillToCluster(value: Boolean): Self = StObject.set(x, "drillToCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillToClusterUndefined: Self = StObject.set(x, "drillToCluster", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setEvents(value: PlotTreemapClusterEventsOptions): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setLayoutAlgorithm(value: PlotTreemapClusterLayoutAlgorithmOptions): Self = StObject.set(x, "layoutAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutAlgorithmUndefined: Self = StObject.set(x, "layoutAlgorithm", js.undefined)
    
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMinimumClusterSize(value: Double): Self = StObject.set(x, "minimumClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumClusterSizeUndefined: Self = StObject.set(x, "minimumClusterSize", js.undefined)
    
    @scala.inline
    def setStates(value: PlotTreemapClusterStatesOptions): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setZones(value: js.Array[PlotTreemapClusterZonesOptions]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: PlotTreemapClusterZonesOptions*): Self = StObject.set(x, "zones", js.Array(value :_*))
  }
}
