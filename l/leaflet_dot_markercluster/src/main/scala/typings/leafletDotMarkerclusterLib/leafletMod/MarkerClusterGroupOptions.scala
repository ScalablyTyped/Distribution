package typings
package leafletDotMarkerclusterLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerClusterGroupOptions
  extends leafletLib.leafletMod.LayerOptions {
  /*
    * Smoothly split / merge cluster children when zooming and spiderfying.
    * If L.DomUtil.TRANSITION is false, this option has no effect (no animation is possible).
    */
  var animate: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * If set to true (and animate option is also true) then adding individual markers to the
    * MarkerClusterGroup after it has been added to the map will add the marker and animate it
    * into the cluster. Defaults to false as this gives better performance when bulk adding markers.
    * addLayers does not support this, only addLayer with individual Markers.
    */
  var animateAddingMarkers: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Time delay (in ms) between consecutive periods of processing for addLayers. Default to 50ms.
    */
  var chunkDelay: js.UndefOr[scala.Double] = js.undefined
  /*
    * Boolean to split the addLayers processing in to small intervals so that the page does not freeze.
    */
  var chunkedLoading: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * If set, at this zoom level and below markers will not be clustered. This defaults to disabled.
    */
  var disableClusteringAtZoom: js.UndefOr[scala.Double] = js.undefined
  /*
    * Function used to create the cluster icon
    */
  var iconCreateFunction: js.UndefOr[
    js.Function1[
      /* cluster */ MarkerCluster, 
      leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon
    ]
  ] = js.undefined
  /*
    * The maximum radius that a cluster will cover from the central marker (in pixels). Default 80.
    * Decreasing will make more, smaller clusters. You can also use a function that accepts
    * the current map zoom and returns the maximum cluster radius in pixels
    */
  var maxClusterRadius: js.UndefOr[scala.Double | (js.Function1[/* zoom */ scala.Double, scala.Double])] = js.undefined
  /*
    * Options to pass when creating the L.Polygon(points, options) to show the bounds of a cluster.
    * Defaults to empty
    */
  var polygonOptions: js.UndefOr[leafletLib.leafletMod.PolylineOptions] = js.undefined
  /*
    * Clusters and markers too far from the viewport are removed from the map
    * for performance.
    */
  var removeOutsideVisibleBounds: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * When you mouse over a cluster it shows the bounds of its markers.
    */
  var showCoverageOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * If set to true, overrides the icon for all added markers to make them appear as a 1 size cluster.
    */
  var singleMarkerMode: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * Allows you to specify PolylineOptions to style spider legs.
    * By default, they are { weight: 1.5, color: '#222', opacity: 0.5 }.
    */
  var spiderLegPolylineOptions: js.UndefOr[leafletLib.leafletMod.PolylineOptions] = js.undefined
  /*
    * Increase from 1 to increase the distance away from the center that spiderfied markers are placed.
    * Use if you are using big marker icons (Default: 1).
    */
  var spiderfyDistanceMultiplier: js.UndefOr[scala.Double] = js.undefined
  /*
    * When you click a cluster at the bottom zoom level we spiderfy it
    * so you can see all of its markers.
    */
  var spiderfyOnMaxZoom: js.UndefOr[scala.Boolean] = js.undefined
  /*
    * When you click a cluster we zoom to its bounds.
    */
  var zoomToBoundsOnClick: js.UndefOr[scala.Boolean] = js.undefined
}

