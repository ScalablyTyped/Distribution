package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesRemoveResourcePoliciesRequest extends js.Object {
  
  /** Resource policies to be removed from this instance. */
  var resourcePolicies: js.UndefOr[js.Array[String]] = js.native
}
object InstancesRemoveResourcePoliciesRequest {
  
  @scala.inline
  def apply(): InstancesRemoveResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesRemoveResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit class InstancesRemoveResourcePoliciesRequestOps[Self <: InstancesRemoveResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourcePoliciesVarargs(value: String*): Self = this.set("resourcePolicies", js.Array(value :_*))
    
    @scala.inline
    def setResourcePolicies(value: js.Array[String]): Self = this.set("resourcePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePolicies: Self = this.set("resourcePolicies", js.undefined)
  }
}
