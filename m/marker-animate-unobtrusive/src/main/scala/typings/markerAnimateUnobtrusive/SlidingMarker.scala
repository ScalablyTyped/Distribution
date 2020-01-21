package typings.markerAnimateUnobtrusive

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.Marker
import typings.markerAnimateUnobtrusive.jQuery.easing.IEasingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SlidingMarker")
@js.native
class SlidingMarker () extends Marker {
  def this(opts: SlidingMarkerOptions) = this()
  def getAnimationPosition(): LatLng = js.native
  def getDuration(): Double = js.native
  def getEasing(): IEasingType = js.native
  def setDuration(duration: Double): Unit = js.native
  def setEasing(easing: IEasingType): Unit = js.native
  def setPositionNotAnimated(position: LatLng): Unit = js.native
  def setPositionNotAnimated(position: LatLngLiteral): Unit = js.native
}

/* static members */
@JSGlobal("SlidingMarker")
@js.native
object SlidingMarker extends js.Object {
  def initializeGlobally(): Unit = js.native
}

