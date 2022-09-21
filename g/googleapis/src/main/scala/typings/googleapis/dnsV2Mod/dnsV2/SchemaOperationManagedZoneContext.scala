package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationManagedZoneContext extends StObject {
  
  /**
    * The post-operation ManagedZone resource.
    */
  var newValue: js.UndefOr[SchemaManagedZone] = js.undefined
  
  /**
    * The pre-operation ManagedZone resource.
    */
  var oldValue: js.UndefOr[SchemaManagedZone] = js.undefined
}
object SchemaOperationManagedZoneContext {
  
  inline def apply(): SchemaOperationManagedZoneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationManagedZoneContext]
  }
  
  extension [Self <: SchemaOperationManagedZoneContext](x: Self) {
    
    inline def setNewValue(value: SchemaManagedZone): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: SchemaManagedZone): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
