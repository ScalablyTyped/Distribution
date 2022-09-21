package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStructMatcher extends StObject {
  
  /**
    * The path to retrieve the Value from the Struct.
    */
  var path: js.UndefOr[js.Array[SchemaPathSegment]] = js.undefined
  
  /**
    * The StructMatcher is matched if the value retrieved by path is matched to this value.
    */
  var value: js.UndefOr[SchemaValueMatcher] = js.undefined
}
object SchemaStructMatcher {
  
  inline def apply(): SchemaStructMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructMatcher]
  }
  
  extension [Self <: SchemaStructMatcher](x: Self) {
    
    inline def setPath(value: js.Array[SchemaPathSegment]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: SchemaPathSegment*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setValue(value: SchemaValueMatcher): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
