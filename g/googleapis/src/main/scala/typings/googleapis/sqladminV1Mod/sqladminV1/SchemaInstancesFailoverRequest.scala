package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesFailoverRequest extends StObject {
  
  /**
    * Failover Context.
    */
  var failoverContext: js.UndefOr[SchemaFailoverContext] = js.undefined
}
object SchemaInstancesFailoverRequest {
  
  inline def apply(): SchemaInstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesFailoverRequest]
  }
  
  extension [Self <: SchemaInstancesFailoverRequest](x: Self) {
    
    inline def setFailoverContext(value: SchemaFailoverContext): Self = StObject.set(x, "failoverContext", value.asInstanceOf[js.Any])
    
    inline def setFailoverContextUndefined: Self = StObject.set(x, "failoverContext", js.undefined)
  }
}
