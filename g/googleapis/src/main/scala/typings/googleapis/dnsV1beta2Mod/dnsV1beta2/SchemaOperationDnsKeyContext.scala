package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationDnsKeyContext extends StObject {
  
  /**
    * The post-operation DnsKey resource.
    */
  var newValue: js.UndefOr[SchemaDnsKey] = js.undefined
  
  /**
    * The pre-operation DnsKey resource.
    */
  var oldValue: js.UndefOr[SchemaDnsKey] = js.undefined
}
object SchemaOperationDnsKeyContext {
  
  inline def apply(): SchemaOperationDnsKeyContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationDnsKeyContext]
  }
  
  extension [Self <: SchemaOperationDnsKeyContext](x: Self) {
    
    inline def setNewValue(value: SchemaDnsKey): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: SchemaDnsKey): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
