package typings.atMapboxGeojsonDashArea

import typings.geojson.geojsonMod.Geometry
import typings.geojson.geojsonMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/geojson-area", JSImport.Namespace)
@js.native
object atMapboxGeojsonDashAreaMod extends js.Object {
  def geometry(geo: Geometry): Double = js.native
  def ring(coordinates: js.Array[Position]): Double = js.native
}

