package typings.mapboxGeojsonExtent

import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJSON
import typings.geojson.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(geoJson: GeoJSON): BBox = ^.asInstanceOf[js.Dynamic].apply(geoJson.asInstanceOf[js.Any]).asInstanceOf[BBox]
  
  @JSImport("@mapbox/geojson-extent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bboxify(geoJson: GeoJSON): GeoJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("bboxify")(geoJson.asInstanceOf[js.Any]).asInstanceOf[GeoJSON]
  
  inline def polygon(geoJson: GeoJSON): Polygon | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(geoJson.asInstanceOf[js.Any]).asInstanceOf[Polygon | Null]
}
