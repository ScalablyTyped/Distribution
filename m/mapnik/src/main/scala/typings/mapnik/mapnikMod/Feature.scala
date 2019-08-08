package typings.mapnik.mapnikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapnik", "Feature")
@js.native
class Feature () extends js.Object {
  def attributes(): js.Any = js.native
  def extent(): js.Tuple4[Double, Double, Double, Double] = js.native
  def fromJSON(geojson: String): Unit = js.native
  def geometry(): js.Any = js.native
   // TODO: Geometry class
  def id(): Double = js.native
  def toJSON(): String = js.native
}

