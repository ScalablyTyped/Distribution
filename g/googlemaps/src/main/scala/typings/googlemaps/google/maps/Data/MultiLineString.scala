package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.MultiLineString")
@js.native
class MultiLineString protected () extends Geometry {
  def this(elements: js.Array[LineString | (js.Array[LatLng | LatLngLiteral])]) = this()
  def getArray(): js.Array[LineString] = js.native
  def getAt(n: Double): LineString = js.native
  def getLength(): Double = js.native
}

