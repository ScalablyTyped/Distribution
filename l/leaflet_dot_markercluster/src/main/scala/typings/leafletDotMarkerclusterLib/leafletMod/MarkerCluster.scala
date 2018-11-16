package typings
package leafletDotMarkerclusterLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.MarkerCluster")
@js.native
class MarkerCluster ()
  extends leafletLib.leafletMod.Marker[js.Any] {
  /*
          * Recursively retrieve all child markers of this cluster.
          */
  def getAllChildMarkers(): js.Array[leafletLib.leafletMod.Marker[_]] = js.native
  /*
          * Returns the cluster bounds.
          */
  def getBounds(): leafletLib.leafletMod.LatLngBounds = js.native
  /*
          * Returns the count of how many child markers we have.
          */
  def getChildCount(): scala.Double = js.native
  /*
          * Zoom to the minimum of showing all of the child markers, or the extents of this cluster.
          */
  def zoomToBounds(): scala.Unit = js.native
}

