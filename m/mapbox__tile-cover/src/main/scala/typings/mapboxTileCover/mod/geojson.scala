package typings.mapboxTileCover.mod

import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mapbox/tile-cover", "geojson")
@js.native
object geojson extends js.Object {
  
  def apply(geom: Geometry, limits: Limits): FeatureCollection[Geometry, GeoJsonProperties] = js.native
}
