package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClientStatusRequest extends StObject {
  
  /**
    * Management server can use these match criteria to identify clients. The match follows OR semantics.
    */
  var nodeMatchers: js.UndefOr[js.Array[SchemaNodeMatcher]] = js.undefined
}
object SchemaClientStatusRequest {
  
  inline def apply(): SchemaClientStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientStatusRequest]
  }
  
  extension [Self <: SchemaClientStatusRequest](x: Self) {
    
    inline def setNodeMatchers(value: js.Array[SchemaNodeMatcher]): Self = StObject.set(x, "nodeMatchers", value.asInstanceOf[js.Any])
    
    inline def setNodeMatchersUndefined: Self = StObject.set(x, "nodeMatchers", js.undefined)
    
    inline def setNodeMatchersVarargs(value: SchemaNodeMatcher*): Self = StObject.set(x, "nodeMatchers", js.Array(value*))
  }
}
