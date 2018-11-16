package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.Polygon")
@js.native
class Polygon protected () extends Geometry {
  def this(elements: js.Array[
      LinearRing | (js.Array[
        googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
      ])
    ]) = this()
  def getArray(): js.Array[LinearRing] = js.native
  def getAt(n: scala.Double): LinearRing = js.native
  def getLength(): scala.Double = js.native
}

