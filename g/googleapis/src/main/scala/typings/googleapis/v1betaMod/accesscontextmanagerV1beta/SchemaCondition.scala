package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A condition necessary for an `AccessLevel` to be granted. The Condition is
  * an AND over its fields. So a Condition is true if: 1) the request IP is
  * from one of the listed subnetworks AND 2) the originating device complies
  * with the listed device policy AND 3) all listed access levels are granted
  * AND 4) the request was sent at a time allowed by the DateTimeRestriction.
  */
trait SchemaCondition extends StObject {
  
  /**
    * Device specific restrictions, all restrictions must hold for the
    * Condition to be true. If not specified, all devices are allowed.
    */
  var devicePolicy: js.UndefOr[SchemaDevicePolicy] = js.undefined
  
  /**
    * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that
    * for a CIDR IP address block, the specified IP address portion must be
    * properly truncated (i.e. all the host bits must be zero) or the input is
    * considered malformed. For example, &quot;192.0.2.0/24&quot; is accepted
    * but &quot;192.0.2.1/24&quot; is not. Similarly, for IPv6,
    * &quot;2001:db8::/32&quot; is accepted whereas &quot;2001:db8::1/32&quot;
    * is not. The originating IP of a request must be in one of the listed
    * subnets in order for this Condition to be true. If empty, all IP
    * addresses are allowed.
    */
  var ipSubnetworks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The request must be made by one of the provided user or service accounts.
    * Groups are not supported. Syntax: `user:{emailid}`
    * `serviceAccount:{emailid}` If not specified, a request may come from any
    * user.
    */
  var members: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether to negate the Condition. If true, the Condition becomes a NAND
    * over its non-empty fields, each field must be false for the Condition
    * overall to be satisfied. Defaults to false.
    */
  var negate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The request must originate from one of the provided countries/regions.
    * Must be valid ISO 3166-1 alpha-2 codes.
    */
  var regions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of other access levels defined in the same `Policy`, referenced by
    * resource name. Referencing an `AccessLevel` which does not exist is an
    * error. All access levels listed must be granted for the Condition to be
    * true. Example:
    * &quot;`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME&quot;`
    */
  var requiredAccessLevels: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaCondition {
  
  @scala.inline
  def apply(): SchemaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCondition]
  }
  
  @scala.inline
  implicit class SchemaConditionMutableBuilder[Self <: SchemaCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicePolicy(value: SchemaDevicePolicy): Self = StObject.set(x, "devicePolicy", value.asInstanceOf[js.Any])
    
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
