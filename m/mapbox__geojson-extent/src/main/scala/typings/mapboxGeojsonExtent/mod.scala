package typings.mapboxGeojsonExtent

import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJSON
import typings.geojson.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mapbox/geojson-extent", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(geoJson: GeoJSON): BBox = js.native
  
  def bboxify(geoJson: GeoJSON): GeoJSON = js.native
  
  def polygon(geoJson: GeoJSON): Polygon | Null = js.native
}
