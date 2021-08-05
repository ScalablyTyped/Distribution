package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupsListInstancesRequest extends StObject {
  
  /**
    * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of
    * their state.
    */
  var instanceState: js.UndefOr[String] = js.undefined
}
object InstanceGroupsListInstancesRequest {
  
  inline def apply(): InstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupsListInstancesRequest]
  }
  
  extension [Self <: InstanceGroupsListInstancesRequest](x: Self) {
    
    inline def setInstanceState(value: String): Self = StObject.set(x, "instanceState", value.asInstanceOf[js.Any])
    
    inline def setInstanceStateUndefined: Self = StObject.set(x, "instanceState", js.undefined)
  }
}
