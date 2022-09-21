package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeTemplate extends StObject {
  
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
  
  /** CPU overcommit. */
  var cpuOvercommitType: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  var disks: js.UndefOr[js.Array[LocalDisk]] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The type of the resource. Always compute#nodeTemplate for node templates. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the
    * name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following
    * characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Labels to use for node affinity, which will be used in instance scheduling. */
  var nodeAffinityLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.NodeTemplate & TopLevel[Any]
  ] = js.undefined
  
  /** The node type to use for nodes group that are created from this template. */
  var nodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive
    * with the node_type property; you can only define one or the other, but not both.
    */
  var nodeTypeFlexibility: js.UndefOr[NodeTemplateNodeTypeFlexibility] = js.undefined
  
  /** [Output Only] The name of the region where the node template resides, such as us-central1. */
  var region: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server -
    * RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
    */
  var serverBinding: js.UndefOr[ServerBinding] = js.undefined
  
  /** [Output Only] The status of the node template. One of the following values: CREATING, READY, and DELETING. */
  var status: js.UndefOr[String] = js.undefined
  
  /** [Output Only] An optional, human-readable explanation of the status. */
  var statusMessage: js.UndefOr[String] = js.undefined
}
object NodeTemplate {
  
  inline def apply(): NodeTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTemplate]
  }
  
  extension [Self <: NodeTemplate](x: Self) {
    
    inline def setAccelerators(value: js.Array[AcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: AcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value*))
    
    inline def setCpuOvercommitType(value: String): Self = StObject.set(x, "cpuOvercommitType", value.asInstanceOf[js.Any])
    
    inline def setCpuOvercommitTypeUndefined: Self = StObject.set(x, "cpuOvercommitType", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisks(value: js.Array[LocalDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: LocalDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeAffinityLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.NodeTemplate & TopLevel[Any]
    ): Self = StObject.set(x, "nodeAffinityLabels", value.asInstanceOf[js.Any])
    
    inline def setNodeAffinityLabelsUndefined: Self = StObject.set(x, "nodeAffinityLabels", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeFlexibility(value: NodeTemplateNodeTypeFlexibility): Self = StObject.set(x, "nodeTypeFlexibility", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeFlexibilityUndefined: Self = StObject.set(x, "nodeTypeFlexibility", js.undefined)
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServerBinding(value: ServerBinding): Self = StObject.set(x, "serverBinding", value.asInstanceOf[js.Any])
    
    inline def setServerBindingUndefined: Self = StObject.set(x, "serverBinding", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
