package typings.leafletMarkercluster.mod

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leaflet.mod.LayerOptions
import typings.leaflet.mod.PolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerClusterGroupOptions extends LayerOptions {
  
  /*
    * Smoothly split / merge cluster children when zooming and spiderfying.
    * If L.DomUtil.TRANSITION is false, this option has no effect (no animation is possible).
    */
  var animate: js.UndefOr[Boolean] = js.native
  
  /*
    * If set to true (and animate option is also true) then adding individual markers to the
    * MarkerClusterGroup after it has been added to the map will add the marker and animate it
    * into the cluster. Defaults to false as this gives better performance when bulk adding markers.
    * addLayers does not support this, only addLayer with individual Markers.
    */
  var animateAddingMarkers: js.UndefOr[Boolean] = js.native
  
  /*
    * Time delay (in ms) between consecutive periods of processing for addLayers. Default to 50ms.
    */
  var chunkDelay: js.UndefOr[Double] = js.native
  
  /*
    * Time interval (in ms) during which addLayers works before pausing to let the rest of the page process.
    * In particular, this prevents the page from freezing while adding a lot of markers. Defaults to 200ms.
    */
  var chunkInterval: js.UndefOr[Double] = js.native
  
  /*
    * Callback function that is called at the end of each chunkInterval.
    * Typically used to implement a progress indicator. Defaults to null.
    */
  var chunkProgress: js.UndefOr[
    js.Function3[
      /* processedMarkers */ Double, 
      /* totalMarkers */ Double, 
      /* elapsedTime */ Double, 
      Unit
    ]
  ] = js.native
  
  /*
    * Boolean to split the addLayers processing in to small intervals so that the page does not freeze.
    */
  var chunkedLoading: js.UndefOr[Boolean] = js.native
  
  /*
    * If set, at this zoom level and below markers will not be clustered. This defaults to disabled.
    */
  var disableClusteringAtZoom: js.UndefOr[Double] = js.native
  
  /*
    * Function used to create the cluster icon
    */
  var iconCreateFunction: js.UndefOr[js.Function1[/* cluster */ MarkerCluster, Icon_[IconOptions] | DivIcon_]] = js.native
  
  /*
    * The maximum radius that a cluster will cover from the central marker (in pixels). Default 80.
    * Decreasing will make more, smaller clusters. You can also use a function that accepts
    * the current map zoom and returns the maximum cluster radius in pixels
    */
  var maxClusterRadius: js.UndefOr[Double | (js.Function1[/* zoom */ Double, Double])] = js.native
  
  /*
    * Options to pass when creating the L.Polygon(points, options) to show the bounds of a cluster.
    * Defaults to empty
    */
  var polygonOptions: js.UndefOr[PolylineOptions] = js.native
  
  /*
    * Clusters and markers too far from the viewport are removed from the map
    * for performance.
    */
  var removeOutsideVisibleBounds: js.UndefOr[Boolean] = js.native
  
  /*
    * When you mouse over a cluster it shows the bounds of its markers.
    */
  var showCoverageOnHover: js.UndefOr[Boolean] = js.native
  
  /*
    * If set to true, overrides the icon for all added markers to make them appear as a 1 size cluster.
    */
  var singleMarkerMode: js.UndefOr[Boolean] = js.native
  
  /*
    * Allows you to specify PolylineOptions to style spider legs.
    * By default, they are { weight: 1.5, color: '#222', opacity: 0.5 }.
    */
  var spiderLegPolylineOptions: js.UndefOr[PolylineOptions] = js.native
  
  /*
    * Increase from 1 to increase the distance away from the center that spiderfied markers are placed.
    * Use if you are using big marker icons (Default: 1).
    */
  var spiderfyDistanceMultiplier: js.UndefOr[Double] = js.native
  
  /*
    * When you click a cluster at the bottom zoom level we spiderfy it
    * so you can see all of its markers.
    */
  var spiderfyOnMaxZoom: js.UndefOr[Boolean] = js.native
  
  /*
    * When you click a cluster we zoom to its bounds.
    */
  var zoomToBoundsOnClick: js.UndefOr[Boolean] = js.native
}
object MarkerClusterGroupOptions {
  
  @scala.inline
  def apply(): MarkerClusterGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerClusterGroupOptions]
  }
  
  @scala.inline
  implicit class MarkerClusterGroupOptionsOps[Self <: MarkerClusterGroupOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setAnimateAddingMarkers(value: Boolean): Self = this.set("animateAddingMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateAddingMarkers: Self = this.set("animateAddingMarkers", js.undefined)
    
    @scala.inline
    def setChunkDelay(value: Double): Self = this.set("chunkDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkDelay: Self = this.set("chunkDelay", js.undefined)
    
    @scala.inline
    def setChunkInterval(value: Double): Self = this.set("chunkInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkInterval: Self = this.set("chunkInterval", js.undefined)
    
    @scala.inline
    def setChunkProgress(
      value: (/* processedMarkers */ Double, /* totalMarkers */ Double, /* elapsedTime */ Double) => Unit
    ): Self = this.set("chunkProgress", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteChunkProgress: Self = this.set("chunkProgress", js.undefined)
    
    @scala.inline
    def setChunkedLoading(value: Boolean): Self = this.set("chunkedLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkedLoading: Self = this.set("chunkedLoading", js.undefined)
    
    @scala.inline
    def setDisableClusteringAtZoom(value: Double): Self = this.set("disableClusteringAtZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableClusteringAtZoom: Self = this.set("disableClusteringAtZoom", js.undefined)
    
    @scala.inline
    def setIconCreateFunction(value: /* cluster */ MarkerCluster => Icon_[IconOptions] | DivIcon_): Self = this.set("iconCreateFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIconCreateFunction: Self = this.set("iconCreateFunction", js.undefined)
    
    @scala.inline
    def setMaxClusterRadiusFunction1(value: /* zoom */ Double => Double): Self = this.set("maxClusterRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxClusterRadius(value: Double | (js.Function1[/* zoom */ Double, Double])): Self = this.set("maxClusterRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxClusterRadius: Self = this.set("maxClusterRadius", js.undefined)
    
    @scala.inline
    def setPolygonOptions(value: PolylineOptions): Self = this.set("polygonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonOptions: Self = this.set("polygonOptions", js.undefined)
    
    @scala.inline
    def setRemoveOutsideVisibleBounds(value: Boolean): Self = this.set("removeOutsideVisibleBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveOutsideVisibleBounds: Self = this.set("removeOutsideVisibleBounds", js.undefined)
    
    @scala.inline
    def setShowCoverageOnHover(value: Boolean): Self = this.set("showCoverageOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCoverageOnHover: Self = this.set("showCoverageOnHover", js.undefined)
    
    @scala.inline
    def setSingleMarkerMode(value: Boolean): Self = this.set("singleMarkerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleMarkerMode: Self = this.set("singleMarkerMode", js.undefined)
    
    @scala.inline
    def setSpiderLegPolylineOptions(value: PolylineOptions): Self = this.set("spiderLegPolylineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpiderLegPolylineOptions: Self = this.set("spiderLegPolylineOptions", js.undefined)
    
    @scala.inline
    def setSpiderfyDistanceMultiplier(value: Double): Self = this.set("spiderfyDistanceMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpiderfyDistanceMultiplier: Self = this.set("spiderfyDistanceMultiplier", js.undefined)
    
    @scala.inline
    def setSpiderfyOnMaxZoom(value: Boolean): Self = this.set("spiderfyOnMaxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpiderfyOnMaxZoom: Self = this.set("spiderfyOnMaxZoom", js.undefined)
    
    @scala.inline
    def setZoomToBoundsOnClick(value: Boolean): Self = this.set("zoomToBoundsOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomToBoundsOnClick: Self = this.set("zoomToBoundsOnClick", js.undefined)
  }
}
