package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.GeometryCollection")
@js.native
class GeometryCollection protected () extends Geometry {
  def this(elements: js.Array[(js.Array[Geometry | LatLng]) | LatLngLiteral]) = this()
  def getArray(): js.Array[Geometry] = js.native
  def getAt(n: Double): Geometry = js.native
  def getLength(): Double = js.native
}

