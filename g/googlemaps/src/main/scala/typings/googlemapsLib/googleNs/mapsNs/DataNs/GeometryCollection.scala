package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.GeometryCollection")
@js.native
class GeometryCollection protected () extends Geometry {
  def this(elements: js.Array[
      (js.Array[Geometry | googlemapsLib.googleNs.mapsNs.LatLng]) | googlemapsLib.googleNs.mapsNs.LatLngLiteral
    ]) = this()
  def getArray(): js.Array[Geometry] = js.native
  def getAt(n: scala.Double): Geometry = js.native
  def getLength(): scala.Double = js.native
}

