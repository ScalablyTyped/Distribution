package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupsListInstancesRequest extends StObject {
  
  /**
    * A filter for the state of the instances in the instance group. Valid options are ALL or RUNNING. If you do not specify this parameter the list includes all instances regardless of
    * their state.
    */
  var instanceState: js.UndefOr[String] = js.native
}
object InstanceGroupsListInstancesRequest {
  
  @scala.inline
  def apply(): InstanceGroupsListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupsListInstancesRequest]
  }
  
  @scala.inline
  implicit class InstanceGroupsListInstancesRequestMutableBuilder[Self <: InstanceGroupsListInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceState(value: String): Self = StObject.set(x, "instanceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceStateUndefined: Self = StObject.set(x, "instanceState", js.undefined)
  }
}
