package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.LinearRing")
@js.native
class LinearRing protected () extends Geometry {
  def this(elements: js.Array[
      googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
    ]) = this()
  def getArray(): js.Array[googlemapsLib.googleNs.mapsNs.LatLng] = js.native
  def getAt(n: scala.Double): googlemapsLib.googleNs.mapsNs.LatLng = js.native
  def getLength(): scala.Double = js.native
}

