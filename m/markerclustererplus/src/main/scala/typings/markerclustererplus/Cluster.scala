package typings.markerclustererplus

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.Map
import typings.googlemaps.googleNs.mapsNs.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Cluster")
@js.native
class Cluster protected () extends js.Object {
  /**
    * Creates a single cluster that manages a group of proximate markers.
    * Used internally, do not call this constructor directly.
    * @param mc The <code>MarkerClusterer</code> object with which this
    *       cluster is associated.
    */
  def this(mc: MarkerClusterer) = this()
  /**
    * Adds a marker to the cluster.
    *
    * @param marker The marker to be added.
    * @return True if the marker was added.
    * @ignore
    */
  def addMarker(marker: Marker): Boolean = js.native
  /**
    * Calculates the extended bounds of the cluster with the grid.
    */
  def calculateBounds_(): Unit = js.native
  /**
    * Returns the bounds of the cluster.
    *
    * @return the cluster bounds.
    * @ignore
    */
  def getBounds(): LatLngBounds = js.native
  /**
    * Returns the center of the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The center of the cluster.
    */
  def getCenter(): LatLng = js.native
  /**
    * Returns the map with which the cluster is associated.
    *
    * @return The map.
    * @ignore
    */
  def getMap(): Map = js.native
  /**
    * Returns the <code>MarkerClusterer</code> object with which the cluster is associated.
    *
    * @return The associated marker clusterer.
    * @ignore
    */
  def getMarkerClusterer(): MarkerClusterer = js.native
  /**
    * Returns the array of markers managed by the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The array of markers in the cluster.
    */
  def getMarkers(): js.Array[Marker] = js.native
  /**
    * Returns the number of markers managed by the cluster. You can call this from
    * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
    * for the <code>MarkerClusterer</code> object.
    *
    * @return The number of markers in the cluster.
    */
  def getSize(): Double = js.native
  /**
    * Determines if a marker has already been added to the cluster.
    *
    * @param marker The marker to check.
    * @return True if the marker has already been added.
    */
  def isMarkerAlreadyAdded_(marker: Marker): Boolean = js.native
  /**
    * Determines if a marker lies within the cluster's bounds.
    *
    * @param marker The marker to check.
    * @return True if the marker lies in the bounds.
    * @ignore
    */
  def isMarkerInClusterBounds(marker: Marker): Boolean = js.native
  /**
    * Removes the cluster from the map.
    *
    * @ignore
    */
  def remove(): Unit = js.native
  /**
    * Updates the cluster icon.
    */
  def updateIcon_(): Unit = js.native
}

