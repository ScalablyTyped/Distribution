package typings.leafletDotMarkercluster.leafletMod

import typings.leaflet.leafletMod.LatLngBounds
import typings.leaflet.leafletMod.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.MarkerCluster")
@js.native
class MarkerCluster ()
  extends Marker[js.Any] {
  /*
    * Recursively retrieve all child markers of this cluster.
    */
  def getAllChildMarkers(): js.Array[Marker[_]] = js.native
  /*
    * Returns the cluster bounds.
    */
  def getBounds(): LatLngBounds = js.native
  /*
    * Returns the count of how many child markers we have.
    */
  def getChildCount(): Double = js.native
  /*
    * Zoom to the minimum of showing all of the child markers, or the extents of this cluster.
    */
  def zoomToBounds(): Unit = js.native
}

