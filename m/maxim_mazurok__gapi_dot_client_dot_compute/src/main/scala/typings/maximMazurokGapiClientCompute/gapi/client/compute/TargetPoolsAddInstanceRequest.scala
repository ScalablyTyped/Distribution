package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPoolsAddInstanceRequest extends StObject {
  
  /**
    * A full or partial URL to an instance to add to this target pool. This can be a full or partial URL. For example, the following are valid URLs: -
    * https://www.googleapis.com/compute/v1/projects/project-id/zones/zone /instances/instance-name - projects/project-id/zones/zone/instances/instance-name -
    * zones/zone/instances/instance-name
    */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.undefined
}
object TargetPoolsAddInstanceRequest {
  
  inline def apply(): TargetPoolsAddInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsAddInstanceRequest]
  }
  
  extension [Self <: TargetPoolsAddInstanceRequest](x: Self) {
    
    inline def setInstances(value: js.Array[InstanceReference]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: InstanceReference*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
