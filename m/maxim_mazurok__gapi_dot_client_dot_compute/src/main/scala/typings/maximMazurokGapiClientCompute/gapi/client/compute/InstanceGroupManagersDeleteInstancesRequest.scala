package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagersDeleteInstancesRequest extends StObject {
  
  /** The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME]. */
  var instances: js.UndefOr[js.Array[String]] = js.undefined
}
object InstanceGroupManagersDeleteInstancesRequest {
  
  @scala.inline
  def apply(): InstanceGroupManagersDeleteInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersDeleteInstancesRequest]
  }
  
  @scala.inline
  implicit class InstanceGroupManagersDeleteInstancesRequestMutableBuilder[Self <: InstanceGroupManagersDeleteInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
