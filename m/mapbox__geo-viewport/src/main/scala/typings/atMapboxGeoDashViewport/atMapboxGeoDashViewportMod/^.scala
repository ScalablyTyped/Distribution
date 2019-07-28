package typings.atMapboxGeoDashViewport.atMapboxGeoDashViewportMod

import typings.atMapboxGeoDashViewport.Anon_Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/geo-viewport", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bounds(viewport: js.Tuple2[Double, Double], zoom: Double, dimensions: js.Tuple2[Double, Double]): BoundingBox = js.native
  def bounds(
    viewport: js.Tuple2[Double, Double],
    zoom: Double,
    dimensions: js.Tuple2[Double, Double],
    tileSize: Double
  ): BoundingBox = js.native
  def bounds(viewport: Anon_Lat, zoom: Double, dimensions: js.Tuple2[Double, Double]): BoundingBox = js.native
  def bounds(viewport: Anon_Lat, zoom: Double, dimensions: js.Tuple2[Double, Double], tileSize: Double): BoundingBox = js.native
  def viewport(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double]): GeoViewport = js.native
  def viewport(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double], minzoom: Double): GeoViewport = js.native
  def viewport(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double], minzoom: Double, maxzoom: Double): GeoViewport = js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Double,
    tileSize: Double
  ): GeoViewport = js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Double,
    tileSize: Double,
    allowFloat: Boolean
  ): GeoViewport = js.native
}

