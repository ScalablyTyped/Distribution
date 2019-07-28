package typings.googlemaps.googleNs.mapsNs.DataNs

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.MultiPolygon")
@js.native
class MultiPolygon protected () extends Geometry {
  def this(elements: js.Array[
        typings.googlemaps.googleNs.mapsNs.DataNs.Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])
      ]) = this()
  def getArray(): js.Array[typings.googlemaps.googleNs.mapsNs.DataNs.Polygon] = js.native
  def getAt(n: Double): typings.googlemaps.googleNs.mapsNs.DataNs.Polygon = js.native
  def getLength(): Double = js.native
}

