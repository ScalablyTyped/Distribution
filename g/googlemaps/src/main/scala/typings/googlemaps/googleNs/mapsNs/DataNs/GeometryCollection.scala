package typings.googlemaps.googleNs.mapsNs.DataNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
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

