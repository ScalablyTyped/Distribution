package typings.leafletDotMarkerclusterDotLayersupport.leafletMod

import typings.leaflet.leafletMod.DivIcon
import typings.leaflet.leafletMod.Icon
import typings.leaflet.leafletMod.IconOptions
import typings.leaflet.leafletMod.PolylineOptions
import typings.leafletDotMarkercluster.leafletMod.MarkerCluster
import typings.leafletDotMarkercluster.leafletMod.MarkerClusterGroupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerClusterGroupLayerSupportOptions extends MarkerClusterGroupOptions {
  /**
    * Buffer single addLayer and removeLayer requests for efficiency.
    */
  var singleAddRemoveBufferDuration: Double
}

object MarkerClusterGroupLayerSupportOptions {
  @scala.inline
  def apply(
    singleAddRemoveBufferDuration: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    animateAddingMarkers: js.UndefOr[Boolean] = js.undefined,
    attribution: String = null,
    chunkDelay: Int | Double = null,
    chunkInterval: Int | Double = null,
    chunkProgress: (/* processedMarkers */ Double, /* totalMarkers */ Double, /* elapsedTime */ Double) => Unit = null,
    chunkedLoading: js.UndefOr[Boolean] = js.undefined,
    disableClusteringAtZoom: Int | Double = null,
    iconCreateFunction: /* cluster */ MarkerCluster => Icon[IconOptions] | DivIcon = null,
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
  ): MarkerClusterGroupLayerSupportOptions = {
    val __obj = js.Dynamic.literal(singleAddRemoveBufferDuration = singleAddRemoveBufferDuration.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[MarkerClusterGroupLayerSupportOptions]
  }
}

