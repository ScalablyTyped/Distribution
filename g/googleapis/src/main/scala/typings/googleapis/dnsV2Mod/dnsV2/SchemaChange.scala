package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChange extends StObject {
  
  /**
    * Which ResourceRecordSets to add?
    */
  var additions: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.undefined
  
  /**
    * Which ResourceRecordSets to remove? Must match existing data exactly.
    */
  var deletions: js.UndefOr[js.Array[SchemaResourceRecordSet]] = js.undefined
  
  /**
    * Unique identifier for the resource; defined by the server (output only).
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the DNS queries for the zone will be served.
    */
  var isServing: js.UndefOr[Boolean | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time that this operation was started by the server (output only). This is in RFC3339 text format.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the operation (output only). A status of "done" means that the request to update the authoritative servers has been sent, but the servers might not be updated yet.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaChange {
  
  inline def apply(): SchemaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChange]
  }
  
  extension [Self <: SchemaChange](x: Self) {
    
    inline def setAdditions(value: js.Array[SchemaResourceRecordSet]): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    inline def setAdditionsVarargs(value: SchemaResourceRecordSet*): Self = StObject.set(x, "additions", js.Array(value*))
    
    inline def setDeletions(value: js.Array[SchemaResourceRecordSet]): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    inline def setDeletionsUndefined: Self = StObject.set(x, "deletions", js.undefined)
    
    inline def setDeletionsVarargs(value: SchemaResourceRecordSet*): Self = StObject.set(x, "deletions", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsServing(value: Boolean): Self = StObject.set(x, "isServing", value.asInstanceOf[js.Any])
    
    inline def setIsServingNull: Self = StObject.set(x, "isServing", null)
    
    inline def setIsServingUndefined: Self = StObject.set(x, "isServing", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
