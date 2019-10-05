package typings.atMapboxGeoDashViewport.atMapboxGeoDashViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/geo-viewport", "viewport")
@js.native
object viewport extends js.Object {
  def apply(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double]): GeoViewport = js.native
  def apply(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double], minzoom: Double): GeoViewport = js.native
  def apply(bounds: BoundingBox, dimensions: js.Tuple2[Double, Double], minzoom: Double, maxzoom: Double): GeoViewport = js.native
  def apply(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Double,
    tileSize: Double
  ): GeoViewport = js.native
  def apply(
    bounds: BoundingBox,
    dimensions: js.Tuple2[Double, Double],
    minzoom: Double,
    maxzoom: Double,
    tileSize: Double,
    allowFloat: Boolean
  ): GeoViewport = js.native
}

