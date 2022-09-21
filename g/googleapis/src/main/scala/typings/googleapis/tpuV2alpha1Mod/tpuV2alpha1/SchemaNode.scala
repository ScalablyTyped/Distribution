package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNode extends StObject {
  
  /**
    * The type of hardware accelerators associated with this node.
    */
  var acceleratorType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The API version that created this Node.
    */
  var apiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user's provided network, or the provided network is peered with another network that is using that CIDR block.
    */
  var cidrBlock: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time when the node was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The additional data disks for the Node.
    */
  var dataDisks: js.UndefOr[js.Array[SchemaAttachedDisk]] = js.undefined
  
  /**
    * The user-supplied description of the TPU. Maximum of 512 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The health status of the TPU node.
    */
  var health: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. If this field is populated, it contains a description of why the TPU Node is unhealthy.
    */
  var healthDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique identifier for the TPU Node.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource labels to represent user-provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Custom metadata to apply to the TPU Node. Can set startup-script and shutdown-script
    */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Immutable. The name of the TPU.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network configurations for the TPU node.
    */
  var networkConfig: js.UndefOr[SchemaNetworkConfig] = js.undefined
  
  /**
    * Output only. The network endpoints where TPU workers can be accessed and sent work. It is recommended that runtime clients of the node reach out to the 0th entry in this map first.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.undefined
  
  /**
    * Required. The runtime version running in the Node.
    */
  var runtimeVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The scheduling options for this node.
    */
  var schedulingConfig: js.UndefOr[SchemaSchedulingConfig] = js.undefined
  
  /**
    * The Google Cloud Platform Service Account to be used by the TPU node VMs. If None is specified, the default compute service account will be used.
    */
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.undefined
  
  /**
    * Output only. The current state for the TPU Node.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Symptoms that have occurred to the TPU Node.
    */
  var symptoms: js.UndefOr[js.Array[SchemaSymptom]] = js.undefined
  
  /**
    * Tags to apply to the TPU Node. Tags are used to identify valid sources or targets for network firewalls.
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaNode {
  
  inline def apply(): SchemaNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNode]
  }
  
  extension [Self <: SchemaNode](x: Self) {
    
    inline def setAcceleratorType(value: String): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeNull: Self = StObject.set(x, "acceleratorType", null)
    
    inline def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionNull: Self = StObject.set(x, "apiVersion", null)
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockNull: Self = StObject.set(x, "cidrBlock", null)
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataDisks(value: js.Array[SchemaAttachedDisk]): Self = StObject.set(x, "dataDisks", value.asInstanceOf[js.Any])
    
    inline def setDataDisksUndefined: Self = StObject.set(x, "dataDisks", js.undefined)
    
    inline def setDataDisksVarargs(value: SchemaAttachedDisk*): Self = StObject.set(x, "dataDisks", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHealth(value: String): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthDescription(value: String): Self = StObject.set(x, "healthDescription", value.asInstanceOf[js.Any])
    
    inline def setHealthDescriptionNull: Self = StObject.set(x, "healthDescription", null)
    
    inline def setHealthDescriptionUndefined: Self = StObject.set(x, "healthDescription", js.undefined)
    
    inline def setHealthNull: Self = StObject.set(x, "health", null)
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkConfig(value: SchemaNetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setNetworkEndpoints(value: js.Array[SchemaNetworkEndpoint]): Self = StObject.set(x, "networkEndpoints", value.asInstanceOf[js.Any])
    
    inline def setNetworkEndpointsUndefined: Self = StObject.set(x, "networkEndpoints", js.undefined)
    
    inline def setNetworkEndpointsVarargs(value: SchemaNetworkEndpoint*): Self = StObject.set(x, "networkEndpoints", js.Array(value*))
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionNull: Self = StObject.set(x, "runtimeVersion", null)
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
    
    inline def setSchedulingConfig(value: SchemaSchedulingConfig): Self = StObject.set(x, "schedulingConfig", value.asInstanceOf[js.Any])
    
    inline def setSchedulingConfigUndefined: Self = StObject.set(x, "schedulingConfig", js.undefined)
    
    inline def setServiceAccount(value: SchemaServiceAccount): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSymptoms(value: js.Array[SchemaSymptom]): Self = StObject.set(x, "symptoms", value.asInstanceOf[js.Any])
    
    inline def setSymptomsUndefined: Self = StObject.set(x, "symptoms", js.undefined)
    
    inline def setSymptomsVarargs(value: SchemaSymptom*): Self = StObject.set(x, "symptoms", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
