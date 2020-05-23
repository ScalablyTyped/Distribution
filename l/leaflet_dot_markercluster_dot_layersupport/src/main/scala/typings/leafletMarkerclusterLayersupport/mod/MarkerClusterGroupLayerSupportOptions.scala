package typings.leafletMarkerclusterLayersupport.mod

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leaflet.mod.PolylineOptions
import typings.leafletMarkercluster.mod.MarkerCluster
import typings.leafletMarkercluster.mod.MarkerClusterGroupOptions
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
    chunkDelay: js.UndefOr[Double] = js.undefined,
    chunkInterval: js.UndefOr[Double] = js.undefined,
    chunkProgress: (/* processedMarkers */ Double, /* totalMarkers */ Double, /* elapsedTime */ Double) => Unit = null,
    chunkedLoading: js.UndefOr[Boolean] = js.undefined,
    disableClusteringAtZoom: js.UndefOr[Double] = js.undefined,
    iconCreateFunction: /* cluster */ MarkerCluster => Icon_[IconOptions] | DivIcon_ = null,
    maxClusterRadius: Double | (js.Function1[/* zoom */ Double, Double]) = null,
    pane: String = null,
    polygonOptions: PolylineOptions = null,
    removeOutsideVisibleBounds: js.UndefOr[Boolean] = js.undefined,
    showCoverageOnHover: js.UndefOr[Boolean] = js.undefined,
    singleMarkerMode: js.UndefOr[Boolean] = js.undefined,
    spiderLegPolylineOptions: PolylineOptions = null,
    spiderfyDistanceMultiplier: js.UndefOr[Double] = js.undefined,
    spiderfyOnMaxZoom: js.UndefOr[Boolean] = js.undefined,
    zoomToBoundsOnClick: js.UndefOr[Boolean] = js.undefined
  ): MarkerClusterGroupLayerSupportOptions = {
    val __obj = js.Dynamic.literal(singleAddRemoveBufferDuration = singleAddRemoveBufferDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animateAddingMarkers)) __obj.updateDynamic("animateAddingMarkers")(animateAddingMarkers.get.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkDelay)) __obj.updateDynamic("chunkDelay")(chunkDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkInterval)) __obj.updateDynamic("chunkInterval")(chunkInterval.get.asInstanceOf[js.Any])
    if (chunkProgress != null) __obj.updateDynamic("chunkProgress")(js.Any.fromFunction3(chunkProgress))
    if (!js.isUndefined(chunkedLoading)) __obj.updateDynamic("chunkedLoading")(chunkedLoading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableClusteringAtZoom)) __obj.updateDynamic("disableClusteringAtZoom")(disableClusteringAtZoom.get.asInstanceOf[js.Any])
    if (iconCreateFunction != null) __obj.updateDynamic("iconCreateFunction")(js.Any.fromFunction1(iconCreateFunction))
    if (maxClusterRadius != null) __obj.updateDynamic("maxClusterRadius")(maxClusterRadius.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(removeOutsideVisibleBounds)) __obj.updateDynamic("removeOutsideVisibleBounds")(removeOutsideVisibleBounds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCoverageOnHover)) __obj.updateDynamic("showCoverageOnHover")(showCoverageOnHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleMarkerMode)) __obj.updateDynamic("singleMarkerMode")(singleMarkerMode.get.asInstanceOf[js.Any])
    if (spiderLegPolylineOptions != null) __obj.updateDynamic("spiderLegPolylineOptions")(spiderLegPolylineOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(spiderfyDistanceMultiplier)) __obj.updateDynamic("spiderfyDistanceMultiplier")(spiderfyDistanceMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spiderfyOnMaxZoom)) __obj.updateDynamic("spiderfyOnMaxZoom")(spiderfyOnMaxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomToBoundsOnClick)) __obj.updateDynamic("zoomToBoundsOnClick")(zoomToBoundsOnClick.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerClusterGroupLayerSupportOptions]
  }
}

