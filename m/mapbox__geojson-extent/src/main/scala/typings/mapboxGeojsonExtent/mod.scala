package typings.mapboxGeojsonExtent

import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJSON
import typings.geojson.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/geojson-extent", JSImport.Namespace)
  @js.native
  def apply(geoJson: GeoJSON): BBox = js.native
  
  @JSImport("@mapbox/geojson-extent", "bboxify")
  @js.native
  def bboxify(geoJson: GeoJSON): GeoJSON = js.native
  
  @JSImport("@mapbox/geojson-extent", "polygon")
  @js.native
  def polygon(geoJson: GeoJSON): Polygon | Null = js.native
}
