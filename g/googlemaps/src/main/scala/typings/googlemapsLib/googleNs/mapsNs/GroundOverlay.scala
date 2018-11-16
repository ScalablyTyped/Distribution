package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.GroundOverlay")
@js.native
class GroundOverlay protected () extends MVCObject {
  def this(url: java.lang.String, bounds: LatLngBounds) = this()
  def this(url: java.lang.String, bounds: LatLngBoundsLiteral) = this()
  def this(url: java.lang.String, bounds: LatLngBoundsLiteral, opts: GroundOverlayOptions) = this()
  def this(url: java.lang.String, bounds: LatLngBounds, opts: GroundOverlayOptions) = this()
  def getBounds(): LatLngBounds = js.native
  def getMap(): Map = js.native
  def getOpacity(): scala.Double = js.native
  def getUrl(): java.lang.String = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
}

