package typings.atMapboxGeoDashViewport.atMapboxGeoDashViewportMod

import typings.atMapboxGeoDashViewport.Anon_Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/geo-viewport", "bounds")
@js.native
object bounds extends js.Object {
  def apply(viewport: js.Tuple2[Double, Double], zoom: Double, dimensions: js.Tuple2[Double, Double]): BoundingBox = js.native
  def apply(
    viewport: js.Tuple2[Double, Double],
    zoom: Double,
    dimensions: js.Tuple2[Double, Double],
    tileSize: Double
  ): BoundingBox = js.native
  def apply(viewport: Anon_Lat, zoom: Double, dimensions: js.Tuple2[Double, Double]): BoundingBox = js.native
  def apply(viewport: Anon_Lat, zoom: Double, dimensions: js.Tuple2[Double, Double], tileSize: Double): BoundingBox = js.native
}

