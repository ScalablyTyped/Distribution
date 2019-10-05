package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.LineString")
@js.native
class LineString protected () extends Geometry {
  def this(elements: js.Array[LatLng | LatLngLiteral]) = this()
  def getArray(): js.Array[LatLng] = js.native
  def getAt(n: Double): LatLng = js.native
  def getLength(): Double = js.native
}

