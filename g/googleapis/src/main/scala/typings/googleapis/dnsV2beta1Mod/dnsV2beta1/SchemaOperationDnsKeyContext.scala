package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperationDnsKeyContext extends StObject {
  
  var newValue: js.UndefOr[SchemaDnsKey] = js.undefined
  
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
