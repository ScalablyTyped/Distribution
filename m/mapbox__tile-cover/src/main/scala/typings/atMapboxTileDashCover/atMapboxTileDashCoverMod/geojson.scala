package typings.atMapboxTileDashCover.atMapboxTileDashCoverMod

import typings.geojson.geojsonMod.FeatureCollection
import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/tile-cover", "geojson")
@js.native
object geojson extends js.Object {
  def apply(geom: Geometry, limits: Limits): FeatureCollection[Geometry, GeoJsonProperties] = js.native
}

