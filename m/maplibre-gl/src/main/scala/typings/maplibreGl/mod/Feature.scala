package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.Max
import typings.maplibreGl.maplibreGlNumbers.`1`
import typings.maplibreGl.maplibreGlNumbers.`2`
import typings.maplibreGl.maplibreGlNumbers.`3`
import typings.maplibreGl.maplibreGlStrings.LineString
import typings.maplibreGl.maplibreGlStrings.MultiLineString
import typings.maplibreGl.maplibreGlStrings.MultiPoint
import typings.maplibreGl.maplibreGlStrings.MultiPolygon
import typings.maplibreGl.maplibreGlStrings.Point
import typings.maplibreGl.maplibreGlStrings.Polygon
import typings.maplibreGl.maplibreGlStrings.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  val geometry: js.UndefOr[js.Array[js.Array[^]]] = js.undefined
  
  val id: js.UndefOr[Any] = js.undefined
  
  val patterns: js.UndefOr[StringDictionary[Max]] = js.undefined
  
  val properties: StringDictionary[Any]
  
  val `type`: `1` | `2` | `3` | Unknown | Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon
}
object Feature {
  
  inline def apply(
    properties: StringDictionary[Any],
    `type`: `1` | `2` | `3` | Unknown | Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon
  ): Feature = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature]
  }
  
  extension [Self <: Feature](x: Self) {
    
    inline def setGeometry(value: js.Array[js.Array[^]]): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setGeometryVarargs(value: js.Array[^]*): Self = StObject.set(x, "geometry", js.Array(value*))
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPatterns(value: StringDictionary[Max]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
    
    inline def setProperties(value: StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: `1` | `2` | `3` | Unknown | Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
