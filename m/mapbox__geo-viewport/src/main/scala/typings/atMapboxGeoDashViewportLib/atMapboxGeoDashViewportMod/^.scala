package typings
package atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/geo-viewport", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bounds(
    viewport: atMapboxGeoDashViewportLib.Anon_Lat,
    zoom: scala.Double,
    dimensions: js.Tuple2[scala.Double, scala.Double]
  ): atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.BoundingBox = js.native
  def bounds(
    viewport: atMapboxGeoDashViewportLib.Anon_Lat,
    zoom: scala.Double,
    dimensions: js.Tuple2[scala.Double, scala.Double],
    tileSize: scala.Double
  ): atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.BoundingBox = js.native
  def bounds(
    viewport: js.Tuple2[scala.Double, scala.Double],
    zoom: scala.Double,
    dimensions: js.Tuple2[scala.Double, scala.Double]
  ): atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.BoundingBox = js.native
  def bounds(
    viewport: js.Tuple2[scala.Double, scala.Double],
    zoom: scala.Double,
    dimensions: js.Tuple2[scala.Double, scala.Double],
    tileSize: scala.Double
  ): atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.BoundingBox = js.native
  def viewport(
    bounds: atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.BoundingBox,
    dimensions: js.Tuple2[scala.Double, scala.Double]
  ): atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.GeoViewport = js.native
  def viewport(
    bounds: atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.BoundingBox,
    dimensions: js.Tuple2[scala.Double, scala.Double],
    minzoom: scala.Double
  ): atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.GeoViewport = js.native
  def viewport(
    bounds: atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.BoundingBox,
    dimensions: js.Tuple2[scala.Double, scala.Double],
    minzoom: scala.Double,
    maxzoom: scala.Double
  ): atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.GeoViewport = js.native
  def viewport(
    bounds: atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.BoundingBox,
    dimensions: js.Tuple2[scala.Double, scala.Double],
    minzoom: scala.Double,
    maxzoom: scala.Double,
    tileSize: scala.Double
  ): atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.GeoViewport = js.native
  def viewport(
    bounds: atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.BoundingBox,
    dimensions: js.Tuple2[scala.Double, scala.Double],
    minzoom: scala.Double,
    maxzoom: scala.Double,
    tileSize: scala.Double,
    allowFloat: scala.Boolean
  ): atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod.GeoViewport = js.native
}

