package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionInstanceGroupManagersAbandonInstancesRequest extends StObject {
  
  /** The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME]. */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
}
object RegionInstanceGroupManagersAbandonInstancesRequest {
  
  inline def apply(): RegionInstanceGroupManagersAbandonInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersAbandonInstancesRequest]
  }
  
  extension [Self <: RegionInstanceGroupManagersAbandonInstancesRequest](x: Self) {
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
