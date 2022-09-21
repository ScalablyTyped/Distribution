package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectivityTest extends StObject {
  
  /**
    * Output only. The time the test was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user-supplied description of the Connectivity Test. Maximum of 512 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Destination specification of the Connectivity Test. You can use a combination of destination IP address, Compute Engine VM instance, or VPC network to uniquely identify the destination location. Even if the destination IP address is not unique, the source IP location is unique. Usually, the analysis can infer the destination endpoint from route information. If the destination you specify is a VM instance and the instance has multiple network interfaces, then you must also specify either a destination IP address or VPC network to identify the destination interface. A reachability analysis proceeds even if the destination location is ambiguous. However, the result can include endpoints that you don't intend to test.
    */
  var destination: js.UndefOr[SchemaEndpoint] = js.undefined
  
  /**
    * Output only. The display name of a Connectivity Test.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource labels to represent user-provided metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. Unique name of the resource using the form: `projects/{project_id\}/locations/global/connectivityTests/{test_id\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IP Protocol of the test. When not provided, "TCP" is assumed.
    */
  var protocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The reachability details of this test from the latest run. The details are updated when creating a new test, updating an existing test, or triggering a one-time rerun of an existing test.
    */
  var reachabilityDetails: js.UndefOr[SchemaReachabilityDetails] = js.undefined
  
  /**
    * Other projects that may be relevant for reachability analysis. This is applicable to scenarios where a test can cross project boundaries.
    */
  var relatedProjects: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Source specification of the Connectivity Test. You can use a combination of source IP address, virtual machine (VM) instance, or Compute Engine network to uniquely identify the source location. Examples: If the source IP address is an internal IP address within a Google Cloud Virtual Private Cloud (VPC) network, then you must also specify the VPC network. Otherwise, specify the VM instance, which already contains its internal IP address and VPC network information. If the source of the test is within an on-premises network, then you must provide the destination VPC network. If the source endpoint is a Compute Engine VM instance with multiple network interfaces, the instance itself is not sufficient to identify the endpoint. So, you must also specify the source IP address or VPC network. A reachability analysis proceeds even if the source location is ambiguous. However, the test result may include endpoints that you don't intend to test.
    */
  var source: js.UndefOr[SchemaEndpoint] = js.undefined
  
  /**
    * Output only. The time the test's configuration was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnectivityTest {
  
  inline def apply(): SchemaConnectivityTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectivityTest]
  }
  
  extension [Self <: SchemaConnectivityTest](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestination(value: SchemaEndpoint): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setReachabilityDetails(value: SchemaReachabilityDetails): Self = StObject.set(x, "reachabilityDetails", value.asInstanceOf[js.Any])
    
    inline def setReachabilityDetailsUndefined: Self = StObject.set(x, "reachabilityDetails", js.undefined)
    
    inline def setRelatedProjects(value: js.Array[String]): Self = StObject.set(x, "relatedProjects", value.asInstanceOf[js.Any])
    
    inline def setRelatedProjectsNull: Self = StObject.set(x, "relatedProjects", null)
    
    inline def setRelatedProjectsUndefined: Self = StObject.set(x, "relatedProjects", js.undefined)
    
    inline def setRelatedProjectsVarargs(value: String*): Self = StObject.set(x, "relatedProjects", js.Array(value*))
    
    inline def setSource(value: SchemaEndpoint): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
