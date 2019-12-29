package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.MultiPolygon")
@js.native
class MultiPolygon protected () extends Geometry {
  def this(elements: js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])]) = this()
  def getArray(): js.Array[Polygon] = js.native
  def getAt(n: Double): Polygon = js.native
  def getLength(): Double = js.native
}

