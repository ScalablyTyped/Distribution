package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionInstanceGroupManagersDeleteInstancesRequest extends StObject {
  
  /**
    * The URLs of one or more instances to delete. This can be a full URL or a
    * partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME].
    */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaRegionInstanceGroupManagersDeleteInstancesRequest {
  
  inline def apply(): SchemaRegionInstanceGroupManagersDeleteInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersDeleteInstancesRequest]
  }
  
  extension [Self <: SchemaRegionInstanceGroupManagersDeleteInstancesRequest](x: Self) {
    
    inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
