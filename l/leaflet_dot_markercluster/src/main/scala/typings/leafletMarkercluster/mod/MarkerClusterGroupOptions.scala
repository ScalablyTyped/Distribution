package typings.leafletMarkercluster.mod

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leaflet.mod.LayerOptions
import typings.leaflet.mod.PolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerClusterGroupOptions extends LayerOptions {
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
    * When you click a cluster at the bottom zoom level we spiderfy it
    * so you can see all of its markers.
    */
  var spiderfyOnMaxZoom: js.UndefOr[Boolean] = js.undefined
  /*
    * When you click a cluster we zoom to its bounds.
    */
  var zoomToBoundsOnClick: js.UndefOr[Boolean] = js.undefined
}

object MarkerClusterGroupOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    animateAddingMarkers: js.UndefOr[Boolean] = js.undefined,
    attribution: String = null,
    chunkDelay: Int | Double = null,
    chunkInterval: Int | Double = null,
    chunkProgress: (/* processedMarkers */ Double, /* totalMarkers */ Double, /* elapsedTime */ Double) => Unit = null,
    chunkedLoading: js.UndefOr[Boolean] = js.undefined,
    disableClusteringAtZoom: Int | Double = null,
    iconCreateFunction: /* cluster */ MarkerCluster => Icon_[IconOptions] | DivIcon_ = null,
    maxClusterRadius: Double | (js.Function1[/* zoom */ Double, Double]) = null,
    pane: String = null,
    polygonOptions: PolylineOptions = null,
    removeOutsideVisibleBounds: js.UndefOr[Boolean] = js.undefined,
    showCoverageOnHover: js.UndefOr[Boolean] = js.undefined,
    singleMarkerMode: js.UndefOr[Boolean] = js.undefined,
    spiderLegPolylineOptions: PolylineOptions = null,
    spiderfyDistanceMultiplier: Int | Double = null,
    spiderfyOnMaxZoom: js.UndefOr[Boolean] = js.undefined,
    zoomToBoundsOnClick: js.UndefOr[Boolean] = js.undefined
  ): MarkerClusterGroupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(animateAddingMarkers)) __obj.updateDynamic("animateAddingMarkers")(animateAddingMarkers.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (chunkDelay != null) __obj.updateDynamic("chunkDelay")(chunkDelay.asInstanceOf[js.Any])
    if (chunkInterval != null) __obj.updateDynamic("chunkInterval")(chunkInterval.asInstanceOf[js.Any])
    if (chunkProgress != null) __obj.updateDynamic("chunkProgress")(js.Any.fromFunction3(chunkProgress))
    if (!js.isUndefined(chunkedLoading)) __obj.updateDynamic("chunkedLoading")(chunkedLoading.asInstanceOf[js.Any])
    if (disableClusteringAtZoom != null) __obj.updateDynamic("disableClusteringAtZoom")(disableClusteringAtZoom.asInstanceOf[js.Any])
    if (iconCreateFunction != null) __obj.updateDynamic("iconCreateFunction")(js.Any.fromFunction1(iconCreateFunction))
    if (maxClusterRadius != null) __obj.updateDynamic("maxClusterRadius")(maxClusterRadius.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOutsideVisibleBounds)) __obj.updateDynamic("removeOutsideVisibleBounds")(removeOutsideVisibleBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(showCoverageOnHover)) __obj.updateDynamic("showCoverageOnHover")(showCoverageOnHover.asInstanceOf[js.Any])
    if (!js.isUndefined(singleMarkerMode)) __obj.updateDynamic("singleMarkerMode")(singleMarkerMode.asInstanceOf[js.Any])
    if (spiderLegPolylineOptions != null) __obj.updateDynamic("spiderLegPolylineOptions")(spiderLegPolylineOptions.asInstanceOf[js.Any])
    if (spiderfyDistanceMultiplier != null) __obj.updateDynamic("spiderfyDistanceMultiplier")(spiderfyDistanceMultiplier.asInstanceOf[js.Any])
    if (!js.isUndefined(spiderfyOnMaxZoom)) __obj.updateDynamic("spiderfyOnMaxZoom")(spiderfyOnMaxZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomToBoundsOnClick)) __obj.updateDynamic("zoomToBoundsOnClick")(zoomToBoundsOnClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerClusterGroupOptions]
  }
}

