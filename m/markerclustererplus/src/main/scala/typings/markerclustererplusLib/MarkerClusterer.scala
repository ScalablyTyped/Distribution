package typings
package markerclustererplusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MarkerClusterer")
@js.native
class MarkerClusterer protected ()
  extends googlemapsLib.googleNs.mapsNs.OverlayView {
  /**
    * Creates a MarkerClusterer object with the options specified in {@link MarkerClustererOptions}.
    * @param map The Google map to attach to.
    * @param [markers] The markers to be added to the cluster.
    * @param [options] The optional parameters.
    */
  def this(map: googlemapsLib.googleNs.mapsNs.Map) = this()
  def this(map: googlemapsLib.googleNs.mapsNs.Map, markers: js.Array[googlemapsLib.googleNs.mapsNs.Marker]) = this()
  def this(map: googlemapsLib.googleNs.mapsNs.Map, markers: js.Array[googlemapsLib.googleNs.mapsNs.Marker], options: MarkerClustererOptions) = this()
  /**
    * Adds a marker to the clusterer. The clusters are redrawn unless
    * <code>noDraw</code> is set to <code>true</code>.
    *
    * @param marker The marker to add.
    * @param [noDraw] Set to <code>true</code> to prevent redrawing.
    */
  def addMarker(marker: googlemapsLib.googleNs.mapsNs.Marker): scala.Unit = js.native
  def addMarker(marker: googlemapsLib.googleNs.mapsNs.Marker, noDraw: scala.Boolean): scala.Unit = js.native
  /**
    * Adds an array of markers to the clusterer. The clusters are redrawn unless
    * <code>noDraw</code> is set to <code>true</code>.
    *
    * @param markers The markers to add.
    * @param [noDraw] Set to <code>true</code> to prevent redrawing.
    */
  def addMarkers(markers: js.Array[googlemapsLib.googleNs.mapsNs.Marker]): scala.Unit = js.native
  def addMarkers(markers: js.Array[googlemapsLib.googleNs.mapsNs.Marker], noDraw: scala.Boolean): scala.Unit = js.native
  /**
    * Adds a marker to a cluster, or creates a new cluster.
    *
    * @param marker The marker to add.
    */
  def `addToClosestCluster_`(marker: googlemapsLib.googleNs.mapsNs.Marker): scala.Unit = js.native
  /**
    * Removes all clusters and markers from the map and also removes all markers
    * managed by the clusterer.
    */
  def clearMarkers(): scala.Unit = js.native
  /**
    * Creates the clusters. This is done in batches to avoid timeout errors
    * in some browsers when there is a huge number of markers.
    *
    * @param iFirst The index of the first marker in the batch of
    *      markers to be added to clusters.
    */
  def `createClusters_`(iFirst: scala.Double): scala.Unit = js.native
  /**
    * Calculates the distance between two latlng locations in km.
    *
    * @param p1 The first lat lng point.
    * @param p2 The second lat lng point.
    * @return The distance between the two points in km.
    * @see http://www.movable-type.co.uk/scripts/latlong.html
    */
  def `distanceBetweenPoints_`(p1: googlemapsLib.googleNs.mapsNs.LatLng, p2: googlemapsLib.googleNs.mapsNs.LatLng): scala.Double = js.native
  /**
    * Extends an object's prototype by another's.
    *
    * @param obj1 The object to be extended.
    * @param obj2 The object to extend with.
    * @return The new extended object.
    * @ignore
    */
  def extend(obj1: js.Object, obj2: js.Object): js.Object = js.native
  /**
    *  Fits the map to the bounds of the markers managed by the clusterer.
    */
  def fitMapToMarkers(): scala.Unit = js.native
  /**
    * Returns the value of the <code>averageCenter</code> property.
    *
    * @return True if averageCenter property is set.
    */
  def getAverageCenter(): scala.Boolean = js.native
  /**
    * Returns the value of the <code>batchSizeIE</code> property.
    *
    * @return the value of the batchSizeIE property.
    */
  def getBatchSizeIE(): scala.Double = js.native
  /**
    * Returns the value of the <code>calculator</code> property.
    *
    * @return the value of the calculator property.
    */
  def getCalculator(): Calculator = js.native
  /**
    * Returns the value of the <code>clusterClass</code> property.
    *
    * @return the value of the clusterClass property.
    */
  def getClusterClass(): java.lang.String = js.native
  /**
    * Returns the current array of clusters formed by the clusterer.
    *
    * @return The array of clusters formed by the clusterer.
    */
  def getClusters(): js.Array[Cluster] = js.native
  /**
    * Returns the value of the <code>enableRetinaIcons</code> property.
    *
    * @return True if enableRetinaIcons property is set.
    */
  def getEnableRetinaIcons(): scala.Boolean = js.native
  /**
    * Returns the current bounds extended by the grid size.
    *
    * @param bounds The bounds to extend.
    * @return The extended bounds.
    * @ignore
    */
  def getExtendedBounds(bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds): googlemapsLib.googleNs.mapsNs.LatLngBounds = js.native
  /**
    * Returns the value of the <code>gridSize</code> property.
    *
    * @return The grid size.
    */
  def getGridSize(): scala.Double = js.native
  /**
    * Returns the value of the <code>hideLabel</code> property.
    *
    * @return the value of the hideLabel property.
    */
  def getHideLabel(): scala.Boolean = js.native
  /**
    * Returns the value of the <code>ignoreHidden</code> property.
    *
    * @return True if ignoreHidden property is set.
    */
  def getIgnoreHidden(): scala.Boolean = js.native
  /**
    * Returns the value of the <code>imageExtension</code> property.
    *
    * @return The value of the imageExtension property.
    */
  def getImageExtension(): java.lang.String = js.native
  /**
    * Returns the value of the <code>imagePath</code> property.
    *
    * @return The value of the imagePath property.
    */
  def getImagePath(): java.lang.String = js.native
  /**
    * Returns the value of the <code>imageSizes</code> property.
    *
    * @return The value of the imageSizes property.
    */
  def getImageSizes(): js.Array[scala.Double] = js.native
  /**
    * Returns the array of markers managed by the clusterer.
    *
    * @return The array of markers managed by the clusterer.
    */
  def getMarkers(): js.Array[googlemapsLib.googleNs.mapsNs.Marker] = js.native
  /**
    *  Returns the value of the <code>maxZoom</code> property.
    *
    *  @return The maximum zoom level.
    */
  def getMaxZoom(): scala.Double = js.native
  /**
    * Returns the value of the <code>minimumClusterSize</code> property.
    *
    * @return The minimum cluster size.
    */
  def getMinimumClusterSize(): scala.Double = js.native
  /**
    *  Returns the value of the <code>styles</code> property.
    *
    *  @return The array of styles defining the cluster markers to be used.
    */
  def getStyles(): js.Array[ClusterIconStyle] = js.native
  /**
    * Returns the value of the <code>title</code> property.
    *
    * @return The content of the title text.
    */
  def getTitle(): java.lang.String = js.native
  /**
    * Returns the number of clusters formed by the clusterer.
    *
    * @return The number of clusters formed by the clusterer.
    */
  def getTotalClusters(): scala.Double = js.native
  /**
    * Returns the number of markers managed by the clusterer.
    *
    * @return The number of markers.
    */
  def getTotalMarkers(): scala.Double = js.native
  /**
    * Returns the value of the <code>zoomOnClick</code> property.
    *
    * @return True if zoomOnClick property is set.
    */
  def getZoomOnClick(): scala.Boolean = js.native
  /**
    * Determines if a marker is contained in a bounds.
    *
    * @param marker The marker to check.
    * @param bounds The bounds to check against.
    * @return True if the marker is in the bounds.
    */
  def `isMarkerInBounds_`(marker: googlemapsLib.googleNs.mapsNs.Marker, bounds: googlemapsLib.googleNs.mapsNs.LatLngBounds): scala.Boolean = js.native
  /**
    * Pushes a marker to the clusterer.
    *
    * @param marker The marker to add.
    */
  def `pushMarkerTo_`(marker: googlemapsLib.googleNs.mapsNs.Marker): scala.Unit = js.native
  /**
    * Redraws all the clusters.
    */
  def `redraw_`(): scala.Unit = js.native
  /**
    * Removes a marker from the cluster and map.  The clusters are redrawn unless
    * <code>noDraw</code> is set to <code>true</code>. Returns <code>true</code> if the
    * marker was removed from the clusterer.
    *
    * @param marker The marker to remove.
    * @param [noDraw] Set to <code>true</code> to prevent redrawing.
    * @param [noMapRemove] Set to <code>true</code> to prevent removal from map but still removing from cluster management
    * @return True if the marker was removed from the clusterer.
    */
  def removeMarker(marker: googlemapsLib.googleNs.mapsNs.Marker): scala.Boolean = js.native
  def removeMarker(marker: googlemapsLib.googleNs.mapsNs.Marker, noDraw: scala.Boolean): scala.Boolean = js.native
  def removeMarker(marker: googlemapsLib.googleNs.mapsNs.Marker, noDraw: scala.Boolean, noMapRemove: scala.Boolean): scala.Boolean = js.native
  /**
    * Removes a marker and returns true if removed, false if not.
    *
    * @param marker The marker to remove
    * @param removeFromMap set to <code>true</code> to explicitly remove from map as well as cluster manangement
    * @return Whether the marker was removed or not
    */
  def `removeMarker_`(marker: googlemapsLib.googleNs.mapsNs.Marker): scala.Boolean = js.native
  def `removeMarker_`(marker: googlemapsLib.googleNs.mapsNs.Marker, removeFromMap: scala.Boolean): scala.Boolean = js.native
  /**
    * Removes an array of markers from the cluster and map. The clusters are redrawn unless
    * <code>noDraw</code> is set to <code>true</code>. Returns <code>true</code> if markers
    * were removed from the clusterer.
    *
    * @param markers The markers to remove.
    * @param [noDraw] Set to <code>true</code> to prevent redrawing.
    * @param [noMapRemove] Set to <code>true</code> to prevent removal from map but still removing from cluster management
    * @return True if markers were removed from the clusterer.
    */
  def removeMarkers(markers: js.Array[googlemapsLib.googleNs.mapsNs.Marker]): scala.Boolean = js.native
  def removeMarkers(markers: js.Array[googlemapsLib.googleNs.mapsNs.Marker], noDraw: scala.Boolean): scala.Boolean = js.native
  def removeMarkers(
    markers: js.Array[googlemapsLib.googleNs.mapsNs.Marker],
    noDraw: scala.Boolean,
    noMapRemove: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Recalculates and redraws all the marker clusters from scratch.
    * Call this after changing any properties.
    */
  def repaint(): scala.Unit = js.native
  /**
    * Removes all clusters from the map. The markers are also removed from the map
    * if <code>hide</code> is set to <code>true</code>.
    *
    * @param [hide] Set to <code>true</code> to also remove the markers
    *      from the map.
    */
  def `resetViewport_`(): scala.Unit = js.native
  def `resetViewport_`(hide: scala.Boolean): scala.Unit = js.native
  /**
    *  Sets the value of the <code>averageCenter</code> property.
    *
    *  @param averageCenter The value of the averageCenter property.
    */
  def setAverageCenter(averageCenter: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the value of the <code>batchSizeIE</code> property.
    *
    * @param batchSizeIE The value of the batchSizeIE property.
    */
  def setBatchSizeIE(batchSizeIE: scala.Double): scala.Unit = js.native
  /**
    * Sets the value of the <code>calculator</code> property.
    *
    * @param calculator The value
    *  of the calculator property.
    */
  def setCalculator(calculator: Calculator): scala.Unit = js.native
  /**
    * Sets the value of the <code>clusterClass</code> property.
    *
    * @param clusterClass The value of the clusterClass property.
    */
  def setClusterClass(clusterClass: java.lang.String): scala.Unit = js.native
  /**
    * Sets the value of the <code>enableRetinaIcons</code> property.
    *
    * @param enableRetinaIcons The value of the enableRetinaIcons property.
    */
  def setEnableRetinaIcons(enableRetinaIcons: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the value of the <code>gridSize</code> property.
    *
    * @param gridSize The grid size.
    */
  def setGridSize(gridSize: scala.Double): scala.Unit = js.native
  /**
    * Sets the value of the <code>hideLabel</code> property.
    *
    * @param printable The value of the hideLabel property.
    */
  def setHideLabel(printable: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the value of the <code>ignoreHidden</code> property.
    *
    * @param ignoreHidden The value of the ignoreHidden property.
    */
  def setIgnoreHidden(ignoreHidden: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the value of the <code>imageExtension</code> property.
    *
    * @param imageExtension The value of the imageExtension property.
    */
  def setImageExtension(imageExtension: java.lang.String): scala.Unit = js.native
  /**
    * Sets the value of the <code>imagePath</code> property.
    *
    * @param imagePath The value of the imagePath property.
    */
  def setImagePath(imagePath: java.lang.String): scala.Unit = js.native
  /**
    * Sets the value of the <code>imageSizes</code> property.
    *
    * @param imageSizes The value of the imageSizes property.
    */
  def setImageSizes(imageSizes: js.Array[scala.Double]): scala.Unit = js.native
  /**
    *  Sets the value of the <code>maxZoom</code> property.
    *
    *  @param maxZoom The maximum zoom level.
    */
  def setMaxZoom(maxZoom: scala.Double): scala.Unit = js.native
  /**
    * Sets the value of the <code>minimumClusterSize</code> property.
    *
    * @param minimumClusterSize The minimum cluster size.
    */
  def setMinimumClusterSize(minimumClusterSize: scala.Double): scala.Unit = js.native
  /**
    *  Sets the value of the <code>styles</code> property.
    *
    *  @param styles The array of styles to use.
    */
  def setStyles(styles: js.Array[ClusterIconStyle]): scala.Unit = js.native
  /**
    *  Sets the value of the <code>title</code> property.
    *
    *  @param title The value of the title property.
    */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
    *  Sets the value of the <code>zoomOnClick</code> property.
    *
    *  @param zoomOnClick The value of the zoomOnClick property.
    */
  def setZoomOnClick(zoomOnClick: scala.Boolean): scala.Unit = js.native
  /**
    * Sets up the styles object.
    */
  def `setupStyles_`(): scala.Unit = js.native
}

/* static members */
@JSGlobal("MarkerClusterer")
@js.native
object MarkerClusterer extends js.Object {
  /**
    * The number of markers to process in one batch.
    *
    */
  var BATCH_SIZE: scala.Double = js.native
  /**
    * The number of markers to process in one batch (IE only).
    *
    */
  var BATCH_SIZE_IE: scala.Double = js.native
  /**
    * The default function for determining the label text and style
    * for a cluster icon.
    *
    * @param markers The array of markers represented by the cluster.
    * @param numStyles The number of marker styles available.
    * @return The information resource for the cluster.
    * @ignore
    */
  @JSName("CALCULATOR")
  var CALCULATOR_Original: markerclustererplusLib.Calculator = js.native
  /**
    * The default extension name for the marker cluster images.
    *
    */
  var IMAGE_EXTENSION: java.lang.String = js.native
  /**
    * The default root name for the marker cluster images.
    *
    */
  var IMAGE_PATH: java.lang.String = js.native
  /**
    * The default array of sizes for the marker cluster images.
    *
    */
  var IMAGE_SIZES: js.Array[scala.Double] = js.native
  /**
    * The default function for determining the label text and style
    * for a cluster icon.
    *
    * @param markers The array of markers represented by the cluster.
    * @param numStyles The number of marker styles available.
    * @return The information resource for the cluster.
    * @ignore
    */
  def CALCULATOR(markers: js.Array[googlemapsLib.googleNs.mapsNs.Marker], clusterIconStylesCount: scala.Double): markerclustererplusLib.ClusterIconInfo = js.native
}

