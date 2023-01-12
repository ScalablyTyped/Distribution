package typings.leafletMarkercluster

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.FitBoundsOptions
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leaflet.mod.LatLngBounds_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.LayerOptions
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.Marker_
import typings.leaflet.mod.Point_
import typings.leaflet.mod.PolylineOptions
import typings.leafletMarkercluster.leafletMarkerclusterStrings.animationend
import typings.leafletMarkercluster.leafletMarkerclusterStrings.spiderfied
import typings.leafletMarkercluster.leafletMarkerclusterStrings.unspiderfied
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "MarkerCluster")
  @js.native
  open class MarkerCluster protected () extends Marker_[Any] {
    def this(latlng: LatLngExpression) = this()
    def this(latlng: LatLngExpression, options: MarkerOptions) = this()
    
    /*
      * Recursively retrieve all child markers of this cluster.
      */
    def getAllChildMarkers(): js.Array[Marker_[Any]] = js.native
    
    /*
      * Returns the cluster bounds.
      */
    def getBounds(): LatLngBounds_ = js.native
    
    /*
      * Returns the count of how many child markers we have.
      */
    def getChildCount(): Double = js.native
    
    /*
      * Spiderfies the child markers of this cluster.
      */
    def spiderfy(): Unit = js.native
    
    /*
      * Unspiderfies a cluster (opposite of spiderfy).
      */
    def unspiderfy(): Unit = js.native
    
    /*
      * Zoom to the minimum of showing all of the child markers, or the extents of this cluster.
      */
    def zoomToBounds(): Unit = js.native
    def zoomToBounds(options: FitBoundsOptions): Unit = js.native
  }
  
  @JSImport("leaflet", "MarkerClusterGroup")
  @js.native
  open class MarkerClusterGroup_ () extends FeatureGroup_[Any] {
    def this(options: MarkerClusterGroupOptions) = this()
    
    /*
      * Bulk methods for adding and removing markers and should be favoured over the
      * single versions when doing bulk addition/removal of markers.
      */
    def addLayers(layers: js.Array[Layer]): this.type = js.native
    def addLayers(layers: js.Array[Layer], skipLayerAddEvent: Boolean): this.type = js.native
    
    /*
      * Returns the array of total markers contained within that cluster.
      */
    def getAllChildMarkers(): js.Array[Marker_[Any]] = js.native
    
    /*
      * Returns the total number of markers contained within that cluster.
      */
    def getChildCount(): Double = js.native
    
    /*
      * If you have a marker in your MarkerClusterGroup and you want to get the visible
      * parent of it
      */
    def getVisibleParent(marker: Marker_[Any]): Marker_[Any] = js.native
    
    /*
      * If you have customized the clusters icon to use some data from the contained markers,
      * and later that data changes, use this method to force a refresh of the cluster icons.
      */
    def refreshClusters(): this.type = js.native
    def refreshClusters(clusters: js.Array[Marker_[Any]]): this.type = js.native
    def refreshClusters(clusters: StringDictionary[Layer]): this.type = js.native
    def refreshClusters(clusters: LayerGroup_[Any]): this.type = js.native
    def refreshClusters(clusters: Marker_[Any]): this.type = js.native
    
    def removeLayers(layers: js.Array[Layer]): this.type = js.native
    
    /*
      * Zooms to show the given marker (spiderfying if required),
      * calls the callback when the marker is visible on the map.
      */
    def zoomToShowLayer(layer: Layer): Unit = js.native
    def zoomToShowLayer(layer: Layer, callback: js.Function0[Unit]): Unit = js.native
  }
  
  /*
    * Create a marker cluster group, optionally given marker cluster group options.
    */
  inline def markerClusterGroup(options: js.UndefOr[MarkerClusterGroupOptions]): MarkerClusterGroup_ = ^.asInstanceOf[js.Dynamic].applyDynamic("markerClusterGroup")(options.asInstanceOf[js.Any]).asInstanceOf[MarkerClusterGroup_]
  
  /*
    * Cluster-related handler functions.
    */
  type AnimationEndEventHandlerFn = js.Function1[/* event */ LeafletEvent, Unit]
  
  /*
    * Extend Evented to include cluster events.
    */
  @js.native
  trait Evented extends StObject {
    
    def addEventListener(`type`: spiderfied | unspiderfied): this.type = js.native
    def addEventListener(`type`: spiderfied | unspiderfied, fn: Unit, context: Any): this.type = js.native
    def addEventListener(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn): this.type = js.native
    def addEventListener(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn, context: Any): this.type = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(`type`: animationend): this.type = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(`type`: animationend, fn: Unit, context: Any): this.type = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn): this.type = js.native
    @JSName("addEventListener")
    def addEventListener_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn, context: Any): this.type = js.native
    
    def addOneTimeEventListener(`type`: spiderfied | unspiderfied): this.type = js.native
    def addOneTimeEventListener(`type`: spiderfied | unspiderfied, fn: Unit, context: Any): this.type = js.native
    def addOneTimeEventListener(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn): this.type = js.native
    def addOneTimeEventListener(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn, context: Any): this.type = js.native
    @JSName("addOneTimeEventListener")
    def addOneTimeEventListener_animationend(`type`: animationend): this.type = js.native
    @JSName("addOneTimeEventListener")
    def addOneTimeEventListener_animationend(`type`: animationend, fn: Unit, context: Any): this.type = js.native
    @JSName("addOneTimeEventListener")
    def addOneTimeEventListener_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn): this.type = js.native
    @JSName("addOneTimeEventListener")
    def addOneTimeEventListener_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn, context: Any): this.type = js.native
    
    def off(`type`: spiderfied | unspiderfied): this.type = js.native
    def off(`type`: spiderfied | unspiderfied, fn: Unit, context: Any): this.type = js.native
    def off(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn): this.type = js.native
    def off(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn, context: Any): this.type = js.native
    @JSName("off")
    def off_animationend(`type`: animationend): this.type = js.native
    @JSName("off")
    def off_animationend(`type`: animationend, fn: Unit, context: Any): this.type = js.native
    @JSName("off")
    def off_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn): this.type = js.native
    @JSName("off")
    def off_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn, context: Any): this.type = js.native
    
    def on(`type`: spiderfied | unspiderfied): this.type = js.native
    def on(`type`: spiderfied | unspiderfied, fn: Unit, context: Any): this.type = js.native
    def on(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn): this.type = js.native
    def on(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn, context: Any): this.type = js.native
    @JSName("on")
    def on_animationend(`type`: animationend): this.type = js.native
    @JSName("on")
    def on_animationend(`type`: animationend, fn: Unit, context: Any): this.type = js.native
    @JSName("on")
    def on_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn): this.type = js.native
    @JSName("on")
    def on_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn, context: Any): this.type = js.native
    
    def once(`type`: spiderfied | unspiderfied): this.type = js.native
    def once(`type`: spiderfied | unspiderfied, fn: Unit, context: Any): this.type = js.native
    def once(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn): this.type = js.native
    def once(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn, context: Any): this.type = js.native
    @JSName("once")
    def once_animationend(`type`: animationend): this.type = js.native
    @JSName("once")
    def once_animationend(`type`: animationend, fn: Unit, context: Any): this.type = js.native
    @JSName("once")
    def once_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn): this.type = js.native
    @JSName("once")
    def once_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn, context: Any): this.type = js.native
    
    def removeEventListener(`type`: spiderfied | unspiderfied): this.type = js.native
    def removeEventListener(`type`: spiderfied | unspiderfied, fn: Unit, context: Any): this.type = js.native
    def removeEventListener(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn): this.type = js.native
    def removeEventListener(`type`: spiderfied | unspiderfied, fn: SpiderfyEventHandlerFn, context: Any): this.type = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(`type`: animationend): this.type = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(`type`: animationend, fn: Unit, context: Any): this.type = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn): this.type = js.native
    @JSName("removeEventListener")
    def removeEventListener_animationend(`type`: animationend, fn: AnimationEndEventHandlerFn, context: Any): this.type = js.native
  }
  
  /*
    * Extend existing event handler function map to include cluster events.
    */
  trait LeafletEventHandlerFnMap extends StObject {
    
    /*
      * Fires when marker clustering/unclustering animation has completed.
      */
    var animationend: js.UndefOr[AnimationEndEventHandlerFn] = js.undefined
    
    /*
      * Fires when overlapping markers get spiderified.
      */
    var spiderfied: js.UndefOr[SpiderfyEventHandlerFn] = js.undefined
    
    /*
      * Fires when overlapping markers get unspiderified.
      */
    var unspiderfied: js.UndefOr[SpiderfyEventHandlerFn] = js.undefined
  }
  object LeafletEventHandlerFnMap {
    
    inline def apply(): LeafletEventHandlerFnMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeafletEventHandlerFnMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LeafletEventHandlerFnMap] (val x: Self) extends AnyVal {
      
      inline def setAnimationend(value: /* event */ LeafletEvent => Unit): Self = StObject.set(x, "animationend", js.Any.fromFunction1(value))
      
      inline def setAnimationendUndefined: Self = StObject.set(x, "animationend", js.undefined)
      
      inline def setSpiderfied(value: /* event */ MarkerClusterSpiderfyEvent => Unit): Self = StObject.set(x, "spiderfied", js.Any.fromFunction1(value))
      
      inline def setSpiderfiedUndefined: Self = StObject.set(x, "spiderfied", js.undefined)
      
      inline def setUnspiderfied(value: /* event */ MarkerClusterSpiderfyEvent => Unit): Self = StObject.set(x, "unspiderfied", js.Any.fromFunction1(value))
      
      inline def setUnspiderfiedUndefined: Self = StObject.set(x, "unspiderfied", js.undefined)
    }
  }
  
  trait MarkerClusterGroupOptions
    extends StObject
       with LayerOptions {
    
    /*
      * Smoothly split / merge cluster children when zooming and spiderfying.
      * If L.DomUtil.TRANSITION is false, this option has no effect (no animation is possible).
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /*
      * If set to true (and animate option is also true) then adding individual markers to the
      * MarkerClusterGroup after it has been added to the map will add the marker and animate it
      * into the cluster. Defaults to false as this gives better performance when bulk adding markers.
      * addLayers does not support this, only addLayer with individual Markers.
      */
    var animateAddingMarkers: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Time delay (in ms) between consecutive periods of processing for addLayers. Default to 50ms.
      */
    var chunkDelay: js.UndefOr[Double] = js.undefined
    
    /*
      * Time interval (in ms) during which addLayers works before pausing to let the rest of the page process.
      * In particular, this prevents the page from freezing while adding a lot of markers. Defaults to 200ms.
      */
    var chunkInterval: js.UndefOr[Double] = js.undefined
    
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
      ] = js.undefined
    
    /*
      * Boolean to split the addLayers processing in to small intervals so that the page does not freeze.
      */
    var chunkedLoading: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Map pane where the cluster icons will be added.
      * Defaults to L.Marker's default (currently 'markerPane')
      */
    var clusterPane: js.UndefOr[String] = js.undefined
    
    /*
      * If set, at this zoom level and below markers will not be clustered. This defaults to disabled.
      */
    var disableClusteringAtZoom: js.UndefOr[Double] = js.undefined
    
    /*
      * Function used to create the cluster icon
      */
    var iconCreateFunction: js.UndefOr[js.Function1[/* cluster */ MarkerCluster, Icon_[IconOptions] | DivIcon_]] = js.undefined
    
    /*
      * The maximum radius that a cluster will cover from the central marker (in pixels). Default 80.
      * Decreasing will make more, smaller clusters. You can also use a function that accepts
      * the current map zoom and returns the maximum cluster radius in pixels
      */
    var maxClusterRadius: js.UndefOr[Double | (js.Function1[/* zoom */ Double, Double])] = js.undefined
    
    /*
      * Options to pass when creating the L.Polygon(points, options) to show the bounds of a cluster.
      * Defaults to empty
      */
    var polygonOptions: js.UndefOr[PolylineOptions] = js.undefined
    
    /*
      * Clusters and markers too far from the viewport are removed from the map
      * for performance.
      */
    var removeOutsideVisibleBounds: js.UndefOr[Boolean] = js.undefined
    
    /*
      * When you mouse over a cluster it shows the bounds of its markers.
      */
    var showCoverageOnHover: js.UndefOr[Boolean] = js.undefined
    
    /*
      * If set to true, overrides the icon for all added markers to make them appear as a 1 size cluster.
      */
    var singleMarkerMode: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Allows you to specify PolylineOptions to style spider legs.
      * By default, they are { weight: 1.5, color: '#222', opacity: 0.5 }.
      */
    var spiderLegPolylineOptions: js.UndefOr[PolylineOptions] = js.undefined
    
    /*
      * Increase from 1 to increase the distance away from the center that spiderfied markers are placed.
      * Use if you are using big marker icons (Default: 1).
      */
    var spiderfyDistanceMultiplier: js.UndefOr[Double] = js.undefined
    
    /*
      * When you click a cluster at any zoom level we spiderfy it
      * so you can see all of its markers.
      */
    var spiderfyOnEveryZoom: js.UndefOr[Boolean] = js.undefined
    
    /*
      * When you click a cluster at the bottom zoom level we spiderfy it
      * so you can see all of its markers.
      */
    var spiderfyOnMaxZoom: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Custom function to calculate spiderfy shape positions
      */
    var spiderfyShapePositions: js.UndefOr[js.Function2[/* count */ Double, /* centerPoint */ Point_, js.Array[Point_]]] = js.undefined
    
    /*
      * When you click a cluster we zoom to its bounds.
      */
    var zoomToBoundsOnClick: js.UndefOr[Boolean] = js.undefined
  }
  object MarkerClusterGroupOptions {
    
    inline def apply(): MarkerClusterGroupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerClusterGroupOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkerClusterGroupOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateAddingMarkers(value: Boolean): Self = StObject.set(x, "animateAddingMarkers", value.asInstanceOf[js.Any])
      
      inline def setAnimateAddingMarkersUndefined: Self = StObject.set(x, "animateAddingMarkers", js.undefined)
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setChunkDelay(value: Double): Self = StObject.set(x, "chunkDelay", value.asInstanceOf[js.Any])
      
      inline def setChunkDelayUndefined: Self = StObject.set(x, "chunkDelay", js.undefined)
      
      inline def setChunkInterval(value: Double): Self = StObject.set(x, "chunkInterval", value.asInstanceOf[js.Any])
      
      inline def setChunkIntervalUndefined: Self = StObject.set(x, "chunkInterval", js.undefined)
      
      inline def setChunkProgress(
        value: (/* processedMarkers */ Double, /* totalMarkers */ Double, /* elapsedTime */ Double) => Unit
      ): Self = StObject.set(x, "chunkProgress", js.Any.fromFunction3(value))
      
      inline def setChunkProgressUndefined: Self = StObject.set(x, "chunkProgress", js.undefined)
      
      inline def setChunkedLoading(value: Boolean): Self = StObject.set(x, "chunkedLoading", value.asInstanceOf[js.Any])
      
      inline def setChunkedLoadingUndefined: Self = StObject.set(x, "chunkedLoading", js.undefined)
      
      inline def setClusterPane(value: String): Self = StObject.set(x, "clusterPane", value.asInstanceOf[js.Any])
      
      inline def setClusterPaneUndefined: Self = StObject.set(x, "clusterPane", js.undefined)
      
      inline def setDisableClusteringAtZoom(value: Double): Self = StObject.set(x, "disableClusteringAtZoom", value.asInstanceOf[js.Any])
      
      inline def setDisableClusteringAtZoomUndefined: Self = StObject.set(x, "disableClusteringAtZoom", js.undefined)
      
      inline def setIconCreateFunction(value: /* cluster */ MarkerCluster => Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "iconCreateFunction", js.Any.fromFunction1(value))
      
      inline def setIconCreateFunctionUndefined: Self = StObject.set(x, "iconCreateFunction", js.undefined)
      
      inline def setMaxClusterRadius(value: Double | (js.Function1[/* zoom */ Double, Double])): Self = StObject.set(x, "maxClusterRadius", value.asInstanceOf[js.Any])
      
      inline def setMaxClusterRadiusFunction1(value: /* zoom */ Double => Double): Self = StObject.set(x, "maxClusterRadius", js.Any.fromFunction1(value))
      
      inline def setMaxClusterRadiusUndefined: Self = StObject.set(x, "maxClusterRadius", js.undefined)
      
      inline def setPolygonOptions(value: PolylineOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
      
      inline def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
      
      inline def setRemoveOutsideVisibleBounds(value: Boolean): Self = StObject.set(x, "removeOutsideVisibleBounds", value.asInstanceOf[js.Any])
      
      inline def setRemoveOutsideVisibleBoundsUndefined: Self = StObject.set(x, "removeOutsideVisibleBounds", js.undefined)
      
      inline def setShowCoverageOnHover(value: Boolean): Self = StObject.set(x, "showCoverageOnHover", value.asInstanceOf[js.Any])
      
      inline def setShowCoverageOnHoverUndefined: Self = StObject.set(x, "showCoverageOnHover", js.undefined)
      
      inline def setSingleMarkerMode(value: Boolean): Self = StObject.set(x, "singleMarkerMode", value.asInstanceOf[js.Any])
      
      inline def setSingleMarkerModeUndefined: Self = StObject.set(x, "singleMarkerMode", js.undefined)
      
      inline def setSpiderLegPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "spiderLegPolylineOptions", value.asInstanceOf[js.Any])
      
      inline def setSpiderLegPolylineOptionsUndefined: Self = StObject.set(x, "spiderLegPolylineOptions", js.undefined)
      
      inline def setSpiderfyDistanceMultiplier(value: Double): Self = StObject.set(x, "spiderfyDistanceMultiplier", value.asInstanceOf[js.Any])
      
      inline def setSpiderfyDistanceMultiplierUndefined: Self = StObject.set(x, "spiderfyDistanceMultiplier", js.undefined)
      
      inline def setSpiderfyOnEveryZoom(value: Boolean): Self = StObject.set(x, "spiderfyOnEveryZoom", value.asInstanceOf[js.Any])
      
      inline def setSpiderfyOnEveryZoomUndefined: Self = StObject.set(x, "spiderfyOnEveryZoom", js.undefined)
      
      inline def setSpiderfyOnMaxZoom(value: Boolean): Self = StObject.set(x, "spiderfyOnMaxZoom", value.asInstanceOf[js.Any])
      
      inline def setSpiderfyOnMaxZoomUndefined: Self = StObject.set(x, "spiderfyOnMaxZoom", js.undefined)
      
      inline def setSpiderfyShapePositions(value: (/* count */ Double, /* centerPoint */ Point_) => js.Array[Point_]): Self = StObject.set(x, "spiderfyShapePositions", js.Any.fromFunction2(value))
      
      inline def setSpiderfyShapePositionsUndefined: Self = StObject.set(x, "spiderfyShapePositions", js.undefined)
      
      inline def setZoomToBoundsOnClick(value: Boolean): Self = StObject.set(x, "zoomToBoundsOnClick", value.asInstanceOf[js.Any])
      
      inline def setZoomToBoundsOnClickUndefined: Self = StObject.set(x, "zoomToBoundsOnClick", js.undefined)
    }
  }
  
  /*
    * Event fired on spiderfy cluster actions.
    */
  trait MarkerClusterSpiderfyEvent
    extends StObject
       with LeafletEvent {
    
    /*
      * The cluster that fired the event.
      */
    var cluster: MarkerCluster
    
    /*
      * The markers in the cluster that fired the event.
      */
    var markers: js.Array[Marker_[Any]]
  }
  object MarkerClusterSpiderfyEvent {
    
    inline def apply(
      cluster: MarkerCluster,
      layer: Any,
      markers: js.Array[Marker_[Any]],
      popup: Any,
      propagatedFrom: Any,
      sourceTarget: Any,
      target: Any,
      `type`: String
    ): MarkerClusterSpiderfyEvent = {
      val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerClusterSpiderfyEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkerClusterSpiderfyEvent] (val x: Self) extends AnyVal {
      
      inline def setCluster(value: MarkerCluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      inline def setMarkers(value: js.Array[Marker_[Any]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersVarargs(value: Marker_[Any]*): Self = StObject.set(x, "markers", js.Array(value*))
    }
  }
  
  type SpiderfyEventHandlerFn = js.Function1[/* event */ MarkerClusterSpiderfyEvent, Unit]
}
