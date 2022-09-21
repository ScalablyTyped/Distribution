package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializedFeaturePositionMap extends StObject {
  
  var ids: js.typedarray.Float64Array
  
  var positions: js.typedarray.Uint32Array
}
object SerializedFeaturePositionMap {
  
  inline def apply(ids: js.typedarray.Float64Array, positions: js.typedarray.Uint32Array): SerializedFeaturePositionMap = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedFeaturePositionMap]
  }
  
  extension [Self <: SerializedFeaturePositionMap](x: Self) {
    
    inline def setIds(value: js.typedarray.Float64Array): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setPositions(value: js.typedarray.Uint32Array): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
  }
}
