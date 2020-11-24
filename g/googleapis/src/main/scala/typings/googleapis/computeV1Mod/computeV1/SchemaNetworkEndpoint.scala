package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The network endpoint.
  */
@js.native
trait SchemaNetworkEndpoint extends js.Object {
  
  /**
    * The name for a specific VM instance that the IP address belongs to. This
    * is required for network endpoints of type GCE_VM_IP_PORT. The instance
    * must be in the same zone of network endpoint group.  The name must be
    * 1-63 characters long, and comply with RFC1035.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * Optional IPv4 address of network endpoint. The IP address must belong to
    * a VM in GCE (either the primary IP or as part of an aliased IP range). If
    * the IP address is not specified, then the primary IP address for the VM
    * instance in the network that the network endpoint group belongs to will
    * be used.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * Optional port number of network endpoint. If not specified and the
    * NetworkEndpointGroup.network_endpoint_type is GCE_IP_PORT, the
    * defaultPort for the network endpoint group will be used.
    */
  var port: js.UndefOr[Double] = js.native
}
object SchemaNetworkEndpoint {
  
  @scala.inline
  def apply(): SchemaNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpoint]
  }
  
  @scala.inline
  implicit class SchemaNetworkEndpointOps[Self <: SchemaNetworkEndpoint] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
