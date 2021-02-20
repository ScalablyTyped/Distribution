package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to create a subnetwork in a previously peered service network.
  */
@js.native
trait SchemaAddSubnetworkRequest extends StObject {
  
  /**
    * Required. A resource that represents the service consumer, such as
    * `projects/123456`. The project number can be different from the value in
    * the consumer network parameter. For example, the network might be part of
    * a Shared VPC network. In those cases, Service Networking validates that
    * this resource belongs to that Shared VPC.
    */
  var consumer: js.UndefOr[String] = js.native
  
  /**
    * Required. The name of the service consumer&#39;s VPC network. The network
    * must have an existing private connection that was provisioned through the
    * connections.create method. The name must be in the following format:
    * `projects/{project}/global/networks/{network}`, where {project} is a
    * project number, such as `12345`. {network} is the name of a VPC network
    * in the project.
    */
  var consumerNetwork: js.UndefOr[String] = js.native
  
  /**
    * An optional description of the subnet.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. The prefix length of the subnet&#39;s IP address range.  Use
    * CIDR range notation, such as `30` to provision a subnet with an
    * `x.x.x.x/30` CIDR range. The IP address range is drawn from a pool of
    * available ranges in the service consumer&#39;s allocated range.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.native
  
  /**
    * Required. The name of a [region](/compute/docs/regions-zones) for the
    * subnet, such `europe-west1`.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Optional. The starting address of a range. The address must be a valid
    * IPv4 address in the x.x.x.x format. This value combined with the IP
    * prefix range is the CIDR range for the subnet. The range must be within
    * the allocated range that is assigned to the private connection. If the
    * CIDR range isn&#39;t available, the call fails.
    */
  var requestedAddress: js.UndefOr[String] = js.native
  
  /**
    * Required. A name for the new subnet. For information about the naming
    * requirements, see
    * [subnetwork](/compute/docs/reference/rest/v1/subnetworks) in the Compute
    * API documentation.
    */
  var subnetwork: js.UndefOr[String] = js.native
  
  /**
    * A list of members that are granted the `compute.networkUser` role on the
    * subnet.
    */
  var subnetworkUsers: js.UndefOr[js.Array[String]] = js.native
}
object SchemaAddSubnetworkRequest {
  
  @scala.inline
  def apply(): SchemaAddSubnetworkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSubnetworkRequest]
  }
  
  @scala.inline
  implicit class SchemaAddSubnetworkRequestMutableBuilder[Self <: SchemaAddSubnetworkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumer(value: String): Self = StObject.set(x, "consumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
    
    @scala.inline
    def setConsumerUndefined: Self = StObject.set(x, "consumer", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIpPrefixLength(value: Double): Self = StObject.set(x, "ipPrefixLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpPrefixLengthUndefined: Self = StObject.set(x, "ipPrefixLength", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRequestedAddress(value: String): Self = StObject.set(x, "requestedAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedAddressUndefined: Self = StObject.set(x, "requestedAddress", js.undefined)
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    @scala.inline
    def setSubnetworkUsers(value: js.Array[String]): Self = StObject.set(x, "subnetworkUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetworkUsersUndefined: Self = StObject.set(x, "subnetworkUsers", js.undefined)
    
    @scala.inline
    def setSubnetworkUsersVarargs(value: String*): Self = StObject.set(x, "subnetworkUsers", js.Array(value :_*))
  }
}
