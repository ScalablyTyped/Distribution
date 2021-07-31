package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a subnet that was created or discovered by a private access
  * management service.
  */
trait SchemaSubnetwork extends StObject {
  
  /**
    * Subnetwork CIDR range in `10.x.x.x/y` format.
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /**
    * Subnetwork name. See https://cloud.google.com/compute/docs/vpc/
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * In the Shared VPC host project, the VPC network that&#39;s peered with
    * the consumer network. For example:
    * `projects/1234321/global/networks/host-network`
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * This is a discovered subnet that is not within the current consumer
    * allocated ranges.
    */
  var outsideAllocation: js.UndefOr[Boolean] = js.undefined
}
object SchemaSubnetwork {
  
  @scala.inline
  def apply(): SchemaSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetwork]
  }
  
  @scala.inline
  implicit class SchemaSubnetworkMutableBuilder[Self <: SchemaSubnetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setOutsideAllocation(value: Boolean): Self = StObject.set(x, "outsideAllocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutsideAllocationUndefined: Self = StObject.set(x, "outsideAllocation", js.undefined)
  }
}
