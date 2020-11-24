package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TPU instance.
  */
@js.native
trait SchemaNode extends js.Object {
  
  /**
    * The type of hardware accelerators associated with this node. Required.
    */
  var acceleratorType: js.UndefOr[String] = js.native
  
  /**
    * The CIDR block that the TPU node will use when selecting an IP address.
    * This CIDR block must be a /29 block; the Compute Engine networks API
    * forbids a smaller block, and using a larger block would be wasteful (a
    * node can only consume one IP address). Errors will occur if the CIDR
    * block has already been used for a currently existing TPU node, the CIDR
    * block conflicts with any subnetworks in the user&#39;s provided network,
    * or the provided network is peered with another network that is using that
    * CIDR block. Required.
    */
  var cidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Output only. The time when the node was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The user-supplied description of the TPU. Maximum of 512 characters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The health status of the TPU node.
    */
  var health: js.UndefOr[String] = js.native
  
  /**
    * Output only. If this field is populated, it contains a description of why
    * the TPU Node is unhealthy.
    */
  var healthDescription: js.UndefOr[String] = js.native
  
  /**
    * Output only. DEPRECATED! Use network_endpoints instead. The network
    * address for the TPU Node as visible to Compute Engine instances.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * Resource labels to represent user-provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Output only. The immutable name of the TPU
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The name of a network they wish to peer the TPU node to. It must be a
    * preexisting Compute Engine network inside of the project on which this
    * API has been activated. If none is provided, &quot;default&quot; will be
    * used.
    */
  var network: js.UndefOr[String] = js.native
  
  /**
    * Output only. The network endpoints where TPU workers can be accessed and
    * sent work. It is recommended that Tensorflow clients of the node reach
    * out to the 0th entry in this map first.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.native
  
  /**
    * Output only. DEPRECATED! Use network_endpoints instead. The network port
    * for the TPU Node as visible to Compute Engine instances.
    */
  var port: js.UndefOr[String] = js.native
  
  var schedulingConfig: js.UndefOr[SchemaSchedulingConfig] = js.native
  
  /**
    * Output only. The service account used to run the tensor flow services
    * within the node. To share resources, including Google Cloud Storage data,
    * with the Tensorflow job running in the Node, this account must have
    * permissions to that data.
    */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /**
    * Output only. The current state for the TPU Node.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * The version of Tensorflow running in the Node. Required.
    */
  var tensorflowVersion: js.UndefOr[String] = js.native
}
object SchemaNode {
  
  @scala.inline
  def apply(): SchemaNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNode]
  }
  
  @scala.inline
  implicit class SchemaNodeOps[Self <: SchemaNode] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorType(value: String): Self = this.set("acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorType: Self = this.set("acceleratorType", js.undefined)
    
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("cidrBlock", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHealth(value: String): Self = this.set("health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealth: Self = this.set("health", js.undefined)
    
    @scala.inline
    def setHealthDescription(value: String): Self = this.set("healthDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthDescription: Self = this.set("healthDescription", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setNetworkEndpointsVarargs(value: SchemaNetworkEndpoint*): Self = this.set("networkEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setNetworkEndpoints(value: js.Array[SchemaNetworkEndpoint]): Self = this.set("networkEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkEndpoints: Self = this.set("networkEndpoints", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSchedulingConfig(value: SchemaSchedulingConfig): Self = this.set("schedulingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedulingConfig: Self = this.set("schedulingConfig", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTensorflowVersion(value: String): Self = this.set("tensorflowVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTensorflowVersion: Self = this.set("tensorflowVersion", js.undefined)
  }
}
