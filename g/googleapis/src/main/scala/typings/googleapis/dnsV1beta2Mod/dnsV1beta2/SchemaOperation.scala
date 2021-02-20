package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOperation extends StObject {
  
  var dnsKeyContext: js.UndefOr[SchemaOperationDnsKeyContext] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#operation&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var startTime: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var user: js.UndefOr[String] = js.native
  
  var zoneContext: js.UndefOr[SchemaOperationManagedZoneContext] = js.native
}
object SchemaOperation {
  
  @scala.inline
  def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  @scala.inline
  implicit class SchemaOperationMutableBuilder[Self <: SchemaOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsKeyContext(value: SchemaOperationDnsKeyContext): Self = StObject.set(x, "dnsKeyContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsKeyContextUndefined: Self = StObject.set(x, "dnsKeyContext", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setZoneContext(value: SchemaOperationManagedZoneContext): Self = StObject.set(x, "zoneContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneContextUndefined: Self = StObject.set(x, "zoneContext", js.undefined)
  }
}
