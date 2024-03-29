package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOperation extends StObject {
  
  /**
    * Only populated if the operation targeted a DnsKey (output only).
    */
  var dnsKeyContext: js.UndefOr[SchemaOperationDnsKeyContext] = js.undefined
  
  /**
    * Unique identifier for the resource. This is the client_operation_id if the client specified it when the mutation was initiated, otherwise, it is generated by the server. The name must be 1-63 characters long and match the regular expression [-a-z0-9]? (output only)
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that this operation was started by the server. This is in RFC3339 text format (output only).
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the operation. Can be one of the following: "PENDING" or "DONE" (output only). A status of "DONE" means that the request to update the authoritative servers has been sent, but the servers might not be updated yet.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the operation. Operations include insert, update, and delete (output only).
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User who requested the operation, for example: user@example.com. cloud-dns-system for operations automatically done by the system. (output only)
    */
  var user: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only populated if the operation targeted a ManagedZone (output only).
    */
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
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setZoneContext(value: SchemaOperationManagedZoneContext): Self = StObject.set(x, "zoneContext", value.asInstanceOf[js.Any])
    
    inline def setZoneContextUndefined: Self = StObject.set(x, "zoneContext", js.undefined)
  }
}
