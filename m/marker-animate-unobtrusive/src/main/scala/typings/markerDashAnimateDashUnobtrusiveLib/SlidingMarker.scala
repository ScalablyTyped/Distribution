package typings
package markerDashAnimateDashUnobtrusiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SlidingMarker")
@js.native
class SlidingMarker ()
  extends googlemapsLib.googleNs.mapsNs.Marker {
  def this(opts: SlidingMarkerOptions) = this()
  def getAnimationPosition(): googlemapsLib.googleNs.mapsNs.LatLng = js.native
  def getDuration(): scala.Double = js.native
  def getEasing(): markerDashAnimateDashUnobtrusiveLib.jQueryNs.easingNs.IEasingType = js.native
  def setDuration(duration: scala.Double): scala.Unit = js.native
  def setEasing(easing: markerDashAnimateDashUnobtrusiveLib.jQueryNs.easingNs.IEasingType): scala.Unit = js.native
  def setPositionNotAnimated(position: googlemapsLib.googleNs.mapsNs.LatLng): scala.Unit = js.native
  def setPositionNotAnimated(position: googlemapsLib.googleNs.mapsNs.LatLngLiteral): scala.Unit = js.native
}

/* static members */
@JSGlobal("SlidingMarker")
@js.native
object SlidingMarker extends js.Object {
  def initializeGlobally(): scala.Unit = js.native
}

