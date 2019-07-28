package typings.markerDashAnimateDashUnobtrusive

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MarkerWithGhost")
@js.native
class MarkerWithGhost () extends SlidingMarker {
  def getGhostAnimationPosition(): LatLng = js.native
  def getGhostPosition(): LatLng = js.native
  def setGhostPosition(ghostPosition: LatLng): Unit = js.native
  def setGhostPosition(ghostPosition: LatLngLiteral): Unit = js.native
}

