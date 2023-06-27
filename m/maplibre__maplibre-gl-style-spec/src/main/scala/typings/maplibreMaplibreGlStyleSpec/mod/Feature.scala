package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StringDictionary
import typings.maplibreMaplibreGlStyleSpec.anon.Max
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecInts.`1`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecInts.`2`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecInts.`3`
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.LineString
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.MultiLineString
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.MultiPoint
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.MultiPolygon
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.Point
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.Polygon
import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  val geometry: js.UndefOr[js.Array[js.Array[typings.mapboxPointGeometry.mod.^]]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    inline def setGeometry(value: js.Array[js.Array[typings.mapboxPointGeometry.mod.^]]): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setGeometryVarargs(value: js.Array[typings.mapboxPointGeometry.mod.^]*): Self = StObject.set(x, "geometry", js.Array(value*))
    
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
