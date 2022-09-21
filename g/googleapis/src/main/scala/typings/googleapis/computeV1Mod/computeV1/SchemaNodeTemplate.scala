package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeTemplate extends StObject {
  
  var accelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.undefined
  
  /**
    * CPU overcommit.
    */
  var cpuOvercommitType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  var disks: js.UndefOr[js.Array[SchemaLocalDisk]] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The type of the resource. Always compute#nodeTemplate for node templates.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels to use for node affinity, which will be used in instance scheduling.
    */
  var nodeAffinityLabels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The node type to use for nodes group that are created from this template.
    */
  var nodeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
    */
  var nodeTypeFlexibility: js.UndefOr[SchemaNodeTemplateNodeTypeFlexibility] = js.undefined
  
  /**
    * [Output Only] The name of the region where the node template resides, such as us-central1.
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
    */
  var serverBinding: js.UndefOr[SchemaServerBinding] = js.undefined
  
  /**
    * [Output Only] The status of the node template. One of the following values: CREATING, READY, and DELETING.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] An optional, human-readable explanation of the status.
    */
  var statusMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaNodeTemplate {
  
  inline def apply(): SchemaNodeTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTemplate]
  }
  
  extension [Self <: SchemaNodeTemplate](x: Self) {
    
    inline def setAccelerators(value: js.Array[SchemaAcceleratorConfig]): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: SchemaAcceleratorConfig*): Self = StObject.set(x, "accelerators", js.Array(value*))
    
    inline def setCpuOvercommitType(value: String): Self = StObject.set(x, "cpuOvercommitType", value.asInstanceOf[js.Any])
    
    inline def setCpuOvercommitTypeNull: Self = StObject.set(x, "cpuOvercommitType", null)
    
    inline def setCpuOvercommitTypeUndefined: Self = StObject.set(x, "cpuOvercommitType", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampNull: Self = StObject.set(x, "creationTimestamp", null)
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisks(value: js.Array[SchemaLocalDisk]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: SchemaLocalDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeAffinityLabels(value: StringDictionary[String]): Self = StObject.set(x, "nodeAffinityLabels", value.asInstanceOf[js.Any])
    
    inline def setNodeAffinityLabelsNull: Self = StObject.set(x, "nodeAffinityLabels", null)
    
    inline def setNodeAffinityLabelsUndefined: Self = StObject.set(x, "nodeAffinityLabels", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeFlexibility(value: SchemaNodeTemplateNodeTypeFlexibility): Self = StObject.set(x, "nodeTypeFlexibility", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeFlexibilityUndefined: Self = StObject.set(x, "nodeTypeFlexibility", js.undefined)
    
    inline def setNodeTypeNull: Self = StObject.set(x, "nodeType", null)
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "nodeType", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServerBinding(value: SchemaServerBinding): Self = StObject.set(x, "serverBinding", value.asInstanceOf[js.Any])
    
    inline def setServerBindingUndefined: Self = StObject.set(x, "serverBinding", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
