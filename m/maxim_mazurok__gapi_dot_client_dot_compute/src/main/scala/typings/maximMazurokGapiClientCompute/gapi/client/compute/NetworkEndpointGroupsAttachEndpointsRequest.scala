package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkEndpointGroupsAttachEndpointsRequest extends js.Object {
  
  /** The list of network endpoints to be attached. */
  var networkEndpoints: js.UndefOr[js.Array[NetworkEndpoint]] = js.native
}
object NetworkEndpointGroupsAttachEndpointsRequest {
  
  @scala.inline
  def apply(): NetworkEndpointGroupsAttachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointGroupsAttachEndpointsRequest]
  }
  
  @scala.inline
  implicit class NetworkEndpointGroupsAttachEndpointsRequestOps[Self <: NetworkEndpointGroupsAttachEndpointsRequest] (val x: Self) extends AnyVal {
    
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
    def setNetworkEndpointsVarargs(value: NetworkEndpoint*): Self = this.set("networkEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setNetworkEndpoints(value: js.Array[NetworkEndpoint]): Self = this.set("networkEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkEndpoints: Self = this.set("networkEndpoints", js.undefined)
  }
}
