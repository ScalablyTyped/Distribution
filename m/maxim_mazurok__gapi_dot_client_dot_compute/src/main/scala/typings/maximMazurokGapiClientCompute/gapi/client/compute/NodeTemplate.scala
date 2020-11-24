package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeTemplate extends js.Object {
  
  /** CPU overcommit. */
  var cpuOvercommitType: js.UndefOr[String] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] The type of the resource. Always compute#nodeTemplate for node templates. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the
    * name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following
    * characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Labels to use for node affinity, which will be used in instance scheduling. */
  var nodeAffinityLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.NodeTemplate with TopLevel[js.Any]
  ] = js.native
  
  /** The node type to use for nodes group that are created from this template. */
  var nodeType: js.UndefOr[String] = js.native
  
  /**
    * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties.
    *
    * This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
    */
  var nodeTypeFlexibility: js.UndefOr[NodeTemplateNodeTypeFlexibility] = js.native
  
  /** [Output Only] The name of the region where the node template resides, such as us-central1. */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Sets the binding properties for the physical server. Valid values include:
    * - [Default] RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server
    * - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible
    *
    * See Sole-tenant node options for more information.
    */
  var serverBinding: js.UndefOr[ServerBinding] = js.native
  
  /** [Output Only] The status of the node template. One of the following values: CREATING, READY, and DELETING. */
  var status: js.UndefOr[String] = js.native
  
  /** [Output Only] An optional, human-readable explanation of the status. */
  var statusMessage: js.UndefOr[String] = js.native
}
object NodeTemplate {
  
  @scala.inline
  def apply(): NodeTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTemplate]
  }
  
  @scala.inline
  implicit class NodeTemplateOps[Self <: NodeTemplate] (val x: Self) extends AnyVal {
    
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNodeAffinityLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.NodeTemplate with TopLevel[js.Any]
    ): Self = this.set("nodeAffinityLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeAffinityLabels: Self = this.set("nodeAffinityLabels", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("nodeType", js.undefined)
    
    @scala.inline
    def setNodeTypeFlexibility(value: NodeTemplateNodeTypeFlexibility): Self = this.set("nodeTypeFlexibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeTypeFlexibility: Self = this.set("nodeTypeFlexibility", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setServerBinding(value: ServerBinding): Self = this.set("serverBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerBinding: Self = this.set("serverBinding", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
  }
}
