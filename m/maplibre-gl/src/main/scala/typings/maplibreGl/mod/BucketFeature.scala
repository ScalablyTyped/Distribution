package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.Max
import typings.maplibreGl.maplibreGlInts.`1`
import typings.maplibreGl.maplibreGlInts.`2`
import typings.maplibreGl.maplibreGlInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketFeature extends StObject {
  
  var geometry: js.Array[js.Array[^]]
  
  var id: js.UndefOr[Any] = js.undefined
  
  var index: Double
  
  val patterns: StringDictionary[Max]
  
  var properties: Any
  
  var sortKey: js.UndefOr[Double] = js.undefined
  
  var sourceLayerIndex: Double
  
  var `type`: `1` | `2` | `3`
}
object BucketFeature {
  
  inline def apply(
    geometry: js.Array[js.Array[^]],
    index: Double,
    patterns: StringDictionary[Max],
    properties: Any,
    sourceLayerIndex: Double,
    `type`: `1` | `2` | `3`
  ): BucketFeature = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sourceLayerIndex = sourceLayerIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketFeature] (val x: Self) extends AnyVal {
    
    inline def setGeometry(value: js.Array[js.Array[^]]): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryVarargs(value: js.Array[^]*): Self = StObject.set(x, "geometry", js.Array(value*))
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setPatterns(value: StringDictionary[Max]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSortKey(value: Double): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
    
    inline def setSourceLayerIndex(value: Double): Self = StObject.set(x, "sourceLayerIndex", value.asInstanceOf[js.Any])
    
    inline def setType(value: `1` | `2` | `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
