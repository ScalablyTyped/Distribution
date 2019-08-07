package typings.atMapboxTileDashCover.atMapboxTileDashCoverMod

import typings.geojson.geojsonMod.FeatureCollection
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/tile-cover", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def geojson(geom: Geometry, limits: Limits): FeatureCollection[Geometry, GeoJsonProperties] = js.native
  def indexes(geom: Geometry, limits: Limits): js.Array[String] = js.native
  def tiles(geom: Geometry, limits: Limits): js.Array[js.Array[Double]] = js.native
}

