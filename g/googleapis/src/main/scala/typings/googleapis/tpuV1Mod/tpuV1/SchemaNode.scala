package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNode extends StObject {
  
  /**
    * Required. The type of hardware accelerators associated with this node.
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
    * Output only. DEPRECATED! Use network_endpoints instead. The network address for the TPU Node as visible to Compute Engine instances.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource labels to represent user-provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. Immutable. The name of the TPU
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, "default" will be used.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The network endpoints where TPU workers can be accessed and sent work. It is recommended that Tensorflow clients of the node reach out to the 0th entry in this map first.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.undefined
  
  /**
    * Output only. DEPRECATED! Use network_endpoints instead. The network port for the TPU Node as visible to Compute Engine instances.
    */
  var port: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The scheduling options for this node.
    */
  var schedulingConfig: js.UndefOr[SchemaSchedulingConfig] = js.undefined
  
  /**
    * Output only. The service account used to run the tensor flow services within the node. To share resources, including Google Cloud Storage data, with the Tensorflow job running in the Node, this account must have permissions to that data.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current state for the TPU Node.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Symptoms that have occurred to the TPU Node.
    */
  var symptoms: js.UndefOr[js.Array[SchemaSymptom]] = js.undefined
  
  /**
    * Required. The version of Tensorflow running in the Node.
    */
  var tensorflowVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
    */
  var useServiceNetworking: js.UndefOr[Boolean | Null] = js.undefined
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
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHealth(value: String): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthDescription(value: String): Self = StObject.set(x, "healthDescription", value.asInstanceOf[js.Any])
    
    inline def setHealthDescriptionNull: Self = StObject.set(x, "healthDescription", null)
    
    inline def setHealthDescriptionUndefined: Self = StObject.set(x, "healthDescription", js.undefined)
    
    inline def setHealthNull: Self = StObject.set(x, "health", null)
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkEndpoints(value: js.Array[SchemaNetworkEndpoint]): Self = StObject.set(x, "networkEndpoints", value.asInstanceOf[js.Any])
    
    inline def setNetworkEndpointsUndefined: Self = StObject.set(x, "networkEndpoints", js.undefined)
    
    inline def setNetworkEndpointsVarargs(value: SchemaNetworkEndpoint*): Self = StObject.set(x, "networkEndpoints", js.Array(value*))
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setSchedulingConfig(value: SchemaSchedulingConfig): Self = StObject.set(x, "schedulingConfig", value.asInstanceOf[js.Any])
    
    inline def setSchedulingConfigUndefined: Self = StObject.set(x, "schedulingConfig", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSymptoms(value: js.Array[SchemaSymptom]): Self = StObject.set(x, "symptoms", value.asInstanceOf[js.Any])
    
    inline def setSymptomsUndefined: Self = StObject.set(x, "symptoms", js.undefined)
    
    inline def setSymptomsVarargs(value: SchemaSymptom*): Self = StObject.set(x, "symptoms", js.Array(value*))
    
    inline def setTensorflowVersion(value: String): Self = StObject.set(x, "tensorflowVersion", value.asInstanceOf[js.Any])
    
    inline def setTensorflowVersionNull: Self = StObject.set(x, "tensorflowVersion", null)
    
    inline def setTensorflowVersionUndefined: Self = StObject.set(x, "tensorflowVersion", js.undefined)
    
    inline def setUseServiceNetworking(value: Boolean): Self = StObject.set(x, "useServiceNetworking", value.asInstanceOf[js.Any])
    
    inline def setUseServiceNetworkingNull: Self = StObject.set(x, "useServiceNetworking", null)
    
    inline def setUseServiceNetworkingUndefined: Self = StObject.set(x, "useServiceNetworking", js.undefined)
  }
}
