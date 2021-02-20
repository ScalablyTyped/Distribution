package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends StObject {
  
  /** Device specific restrictions, all restrictions must hold for the Condition to be true. If not specified, all devices are allowed. */
  var devicePolicy: js.UndefOr[DevicePolicy] = js.native
  
  /**
    * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address block, the specified IP address portion must be properly truncated (i.e. all the host
    * bits must be zero) or the input is considered malformed. For example, "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly, for IPv6, "2001:db8::/32" is accepted whereas
    * "2001:db8::1/32" is not. The originating IP of a request must be in one of the listed subnets in order for this Condition to be true. If empty, all IP addresses are allowed.
    */
  var ipSubnetworks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The request must be made by one of the provided user or service accounts. Groups are not supported. Syntax: `user:{emailid}` `serviceAccount:{emailid}` If not specified, a request
    * may come from any user.
    */
  var members: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty fields, each field must be false for the Condition overall to be satisfied. Defaults to
    * false.
    */
  var negate: js.UndefOr[Boolean] = js.native
  
  /** The request must originate from one of the provided countries/regions. Must be valid ISO 3166-1 alpha-2 codes. */
  var regions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of other access levels defined in the same `Policy`, referenced by resource name. Referencing an `AccessLevel` which does not exist is an error. All access levels listed must
    * be granted for the Condition to be true. Example: "`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME"`
    */
  var requiredAccessLevels: js.UndefOr[js.Array[String]] = js.native
}
object Condition {
  
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicePolicy(value: DevicePolicy): Self = StObject.set(x, "devicePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePolicyUndefined: Self = StObject.set(x, "devicePolicy", js.undefined)
    
    @scala.inline
    def setIpSubnetworks(value: js.Array[String]): Self = StObject.set(x, "ipSubnetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSubnetworksUndefined: Self = StObject.set(x, "ipSubnetworks", js.undefined)
    
    @scala.inline
    def setIpSubnetworksVarargs(value: String*): Self = StObject.set(x, "ipSubnetworks", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
    
    @scala.inline
    def setRequiredAccessLevels(value: js.Array[String]): Self = StObject.set(x, "requiredAccessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredAccessLevelsUndefined: Self = StObject.set(x, "requiredAccessLevels", js.undefined)
    
    @scala.inline
    def setRequiredAccessLevelsVarargs(value: String*): Self = StObject.set(x, "requiredAccessLevels", js.Array(value :_*))
  }
}
