package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOperationDnsKeyContext extends StObject {
  
  var newValue: js.UndefOr[SchemaDnsKey] = js.native
  
  var oldValue: js.UndefOr[SchemaDnsKey] = js.native
}
object SchemaOperationDnsKeyContext {
  
  @scala.inline
  def apply(): SchemaOperationDnsKeyContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationDnsKeyContext]
  }
  
  @scala.inline
  implicit class SchemaOperationDnsKeyContextMutableBuilder[Self <: SchemaOperationDnsKeyContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: SchemaDnsKey): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: SchemaDnsKey): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
