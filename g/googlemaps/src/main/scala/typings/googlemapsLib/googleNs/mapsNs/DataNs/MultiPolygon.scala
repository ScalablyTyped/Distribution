package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.MultiPolygon")
@js.native
class MultiPolygon protected () extends Geometry {
  def this(elements: js.Array[
      Polygon | (js.Array[
        LinearRing | (js.Array[
          googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
        ])
      ])
    ]) = this()
  def getArray(): js.Array[Polygon] = js.native
  def getAt(n: scala.Double): Polygon = js.native
  def getLength(): scala.Double = js.native
}

