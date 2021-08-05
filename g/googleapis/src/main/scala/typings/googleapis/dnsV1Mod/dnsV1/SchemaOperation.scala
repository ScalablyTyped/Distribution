package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperation extends StObject {
  
  var dnsKeyContext: js.UndefOr[SchemaOperationDnsKeyContext] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#operation&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var startTime: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
  
  var zoneContext: js.UndefOr[SchemaOperationManagedZoneContext] = js.undefined
}
object SchemaOperation {
  
  inline def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  extension [Self <: SchemaOperation](x: Self) {
    
    inline def setDnsKeyContext(value: SchemaOperationDnsKeyContext): Self = StObject.set(x, "dnsKeyContext", value.asInstanceOf[js.Any])
    
    inline def setDnsKeyContextUndefined: Self = StObject.set(x, "dnsKeyContext", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setZoneContext(value: SchemaOperationManagedZoneContext): Self = StObject.set(x, "zoneContext", value.asInstanceOf[js.Any])
    
    inline def setZoneContextUndefined: Self = StObject.set(x, "zoneContext", js.undefined)
  }
}
