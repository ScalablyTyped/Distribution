package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.MapCanvasProjection")
@js.native
class MapCanvasProjection () extends MVCObject {
  def fromContainerPixelToLatLng(pixel: Point): LatLng = js.native
  def fromContainerPixelToLatLng(pixel: Point, nowrap: scala.Boolean): LatLng = js.native
  def fromDivPixelToLatLng(pixel: Point): LatLng = js.native
  def fromDivPixelToLatLng(pixel: Point, nowrap: scala.Boolean): LatLng = js.native
  def fromLatLngToContainerPixel(latLng: LatLng): Point = js.native
  def fromLatLngToDivPixel(latLng: LatLng): Point = js.native
  def getWorldWidth(): scala.Double = js.native
}

