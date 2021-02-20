package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOperationManagedZoneContext extends StObject {
  
  var newValue: js.UndefOr[SchemaManagedZone] = js.native
  
  var oldValue: js.UndefOr[SchemaManagedZone] = js.native
}
object SchemaOperationManagedZoneContext {
  
  @scala.inline
  def apply(): SchemaOperationManagedZoneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationManagedZoneContext]
  }
  
  @scala.inline
  implicit class SchemaOperationManagedZoneContextMutableBuilder[Self <: SchemaOperationManagedZoneContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: SchemaManagedZone): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: SchemaManagedZone): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
