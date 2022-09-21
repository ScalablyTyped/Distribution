package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetGuestAttributesRequest extends StObject {
  
  /**
    * The guest attributes path to be queried.
    */
  var queryPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The 0-based worker ID. If it is empty, all workers' GuestAttributes will be returned.
    */
  var workerIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGetGuestAttributesRequest {
  
  inline def apply(): SchemaGetGuestAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetGuestAttributesRequest]
  }
  
  extension [Self <: SchemaGetGuestAttributesRequest](x: Self) {
    
    inline def setQueryPath(value: String): Self = StObject.set(x, "queryPath", value.asInstanceOf[js.Any])
    
    inline def setQueryPathNull: Self = StObject.set(x, "queryPath", null)
    
    inline def setQueryPathUndefined: Self = StObject.set(x, "queryPath", js.undefined)
    
    inline def setWorkerIds(value: js.Array[String]): Self = StObject.set(x, "workerIds", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdsNull: Self = StObject.set(x, "workerIds", null)
    
    inline def setWorkerIdsUndefined: Self = StObject.set(x, "workerIds", js.undefined)
    
    inline def setWorkerIdsVarargs(value: String*): Self = StObject.set(x, "workerIds", js.Array(value*))
  }
}
