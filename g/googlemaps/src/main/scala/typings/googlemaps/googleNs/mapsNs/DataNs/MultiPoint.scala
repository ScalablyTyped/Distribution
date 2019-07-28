package typings.googlemaps.googleNs.mapsNs.DataNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.MultiPoint")
@js.native
class MultiPoint protected () extends Geometry {
  def this(elements: js.Array[LatLng | LatLngLiteral]) = this()
  def getArray(): js.Array[LatLng] = js.native
  def getAt(n: Double): LatLng = js.native
  def getLength(): Double = js.native
}

