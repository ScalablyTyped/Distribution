package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupsAddInstancesRequest extends StObject {
  
  /** The list of instances to add to the instance group. */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.undefined
}
object InstanceGroupsAddInstancesRequest {
  
  inline def apply(): InstanceGroupsAddInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupsAddInstancesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceGroupsAddInstancesRequest] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: js.Array[InstanceReference]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: InstanceReference*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
