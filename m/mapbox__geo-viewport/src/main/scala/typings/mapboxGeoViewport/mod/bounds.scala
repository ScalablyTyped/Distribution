package typings.mapboxGeoViewport.mod

import typings.mapboxGeoViewport.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(viewport: Lat, zoom: Double, dimensions: js.Tuple2[Double, Double]): BoundingBox = js.native
  def apply(viewport: Lat, zoom: Double, dimensions: js.Tuple2[Double, Double], tileSize: Double): BoundingBox = js.native
}
