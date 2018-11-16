package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data.MultiLineString")
@js.native
class MultiLineString protected () extends Geometry {
  def this(elements: js.Array[
      LineString | (js.Array[
        googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
      ])
    ]) = this()
  def getArray(): js.Array[LineString] = js.native
  def getAt(n: scala.Double): LineString = js.native
  def getLength(): scala.Double = js.native
}

