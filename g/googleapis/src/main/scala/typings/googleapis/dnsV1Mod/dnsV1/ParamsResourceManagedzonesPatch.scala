package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagedzonesPatch
  extends StObject
     with StandardParameters {
  
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
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaManagedZone] = js.undefined
}
object ParamsResourceManagedzonesPatch {
  
  inline def apply(): ParamsResourceManagedzonesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedzonesPatch]
  }
  
  extension [Self <: ParamsResourceManagedzonesPatch](x: Self) {
    
    inline def setClientOperationId(value: String): Self = StObject.set(x, "clientOperationId", value.asInstanceOf[js.Any])
    
    inline def setClientOperationIdUndefined: Self = StObject.set(x, "clientOperationId", js.undefined)
    
    inline def setManagedZone(value: String): Self = StObject.set(x, "managedZone", value.asInstanceOf[js.Any])
    
    inline def setManagedZoneUndefined: Self = StObject.set(x, "managedZone", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaManagedZone): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
