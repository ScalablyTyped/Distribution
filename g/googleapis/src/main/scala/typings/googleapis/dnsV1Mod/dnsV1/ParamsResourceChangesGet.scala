package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChangesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The identifier of the requested change, from a previous ResourceRecordSetsChangeResponse.
    */
  var changeId: js.UndefOr[String] = js.undefined
  
  /**
    * For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    */
  var clientOperationId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the managed zone addressed by this request. Can be the managed zone name or ID.
    */
  var managedZone: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the project addressed by this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceChangesGet {
  
  inline def apply(): ParamsResourceChangesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangesGet]
  }
  
  extension [Self <: ParamsResourceChangesGet](x: Self) {
    
    inline def setChangeId(value: String): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    inline def setChangeIdUndefined: Self = StObject.set(x, "changeId", js.undefined)
    
    inline def setClientOperationId(value: String): Self = StObject.set(x, "clientOperationId", value.asInstanceOf[js.Any])
    
    inline def setClientOperationIdUndefined: Self = StObject.set(x, "clientOperationId", js.undefined)
    
    inline def setManagedZone(value: String): Self = StObject.set(x, "managedZone", value.asInstanceOf[js.Any])
    
    inline def setManagedZoneUndefined: Self = StObject.set(x, "managedZone", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
