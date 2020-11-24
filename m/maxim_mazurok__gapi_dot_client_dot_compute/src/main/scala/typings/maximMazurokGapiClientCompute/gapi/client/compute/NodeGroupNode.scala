package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupNode extends js.Object {
  
  /** CPU overcommit. */
  var cpuOvercommitType: js.UndefOr[String] = js.native
  
  /** Instances scheduled on this node. */
  var instances: js.UndefOr[js.Array[String]] = js.native
  
  /** The name of the node. */
  var name: js.UndefOr[String] = js.native
  
  /** The type of this node. */
  var nodeType: js.UndefOr[String] = js.native
  
  /** Binding properties for the physical server. */
  var serverBinding: js.UndefOr[ServerBinding] = js.native
  
  /** Server ID associated with this node. */
  var serverId: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object NodeGroupNode {
  
  @scala.inline
  def apply(): NodeGroupNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupNode]
  }
  
  @scala.inline
  implicit class NodeGroupNodeOps[Self <: NodeGroupNode] (val x: Self) extends AnyVal {
    
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
    def setCpuOvercommitType(value: String): Self = this.set("cpuOvercommitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuOvercommitType: Self = this.set("cpuOvercommitType", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = this.set("instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    
    @scala.inline
    def setServerBinding(value: ServerBinding): Self = this.set("serverBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerBinding: Self = this.set("serverBinding", js.undefined)
    
    @scala.inline
    def setServerId(value: String): Self = this.set("serverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerId: Self = this.set("serverId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
