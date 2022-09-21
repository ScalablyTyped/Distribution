package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContext extends StObject {
  
  /**
    * A list of RPC context rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[SchemaContextRule]] = js.undefined
}
object SchemaContext {
  
  inline def apply(): SchemaContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContext]
  }
  
  extension [Self <: SchemaContext](x: Self) {
    
    inline def setRules(value: js.Array[SchemaContextRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaContextRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
