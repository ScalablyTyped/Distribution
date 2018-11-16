package typings
package atMapboxGeoDashViewportLib.geoDashViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/geo-viewport", JSImport.Namespace)
@js.native
object geoDashViewportModMembers extends js.Object {
  def bounds(
    viewport: atMapboxGeoDashViewportLib.Anon_Lat,
    zoom: scala.Double,
    dimensions: js.Tuple2[scala.Double, scala.Double]
  ): BoundingBox = js.native
  def bounds(
    viewport: atMapboxGeoDashViewportLib.Anon_Lat,
    zoom: scala.Double,
    dimensions: js.Tuple2[scala.Double, scala.Double],
    tileSize: scala.Double
  ): BoundingBox = js.native
  def bounds(
    viewport: js.Tuple2[scala.Double, scala.Double],
    zoom: scala.Double,
    dimensions: js.Tuple2[scala.Double, scala.Double]
  ): BoundingBox = js.native
  def bounds(
    viewport: js.Tuple2[scala.Double, scala.Double],
    zoom: scala.Double,
    dimensions: js.Tuple2[scala.Double, scala.Double],
    tileSize: scala.Double
  ): BoundingBox = js.native
  def viewport(bounds: BoundingBox, dimensions: js.Tuple2[scala.Double, scala.Double]): GeoViewport = js.native
  def viewport(bounds: BoundingBox, dimensions: js.Tuple2[scala.Double, scala.Double], minzoom: scala.Double): GeoViewport = js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[scala.Double, scala.Double],
    minzoom: scala.Double,
    maxzoom: scala.Double
  ): GeoViewport = js.native
  def viewport(
    bounds: BoundingBox,
    dimensions: js.Tuple2[scala.Double, scala.Double],
    minzoom: scala.Double,
    maxzoom: scala.Double,
    tileSize: scala.Double
  ): GeoViewport = js.native
}

