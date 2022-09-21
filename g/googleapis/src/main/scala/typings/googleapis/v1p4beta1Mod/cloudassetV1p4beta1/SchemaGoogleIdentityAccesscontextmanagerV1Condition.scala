package typings.googleapis.v1p4beta1Mod.cloudassetV1p4beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1Condition extends StObject {
  
  /**
    * Device specific restrictions, all restrictions must hold for the Condition to be true. If not specified, all devices are allowed.
    */
  var devicePolicy: js.UndefOr[SchemaGoogleIdentityAccesscontextmanagerV1DevicePolicy] = js.undefined
  
  /**
    * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address block, the specified IP address portion must be properly truncated (i.e. all the host bits must be zero) or the input is considered malformed. For example, "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly, for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32" is not. The originating IP of a request must be in one of the listed subnets in order for this Condition to be true. If empty, all IP addresses are allowed.
    */
  var ipSubnetworks: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The request must be made by one of the provided user or service accounts. Groups are not supported. Syntax: `user:{emailid\}` `serviceAccount:{emailid\}` If not specified, a request may come from any user.
    */
  var members: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
    */
  var negate: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The request must originate from one of the provided countries/regions. Must be valid ISO 3166-1 alpha-2 codes.
    */
  var regions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of other access levels defined in the same `Policy`, referenced by resource name. Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be granted for the Condition to be true. Example: "`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME"`
    */
  var requiredAccessLevels: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1Condition {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1Condition]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1Condition](x: Self) {
    
    inline def setDevicePolicy(value: SchemaGoogleIdentityAccesscontextmanagerV1DevicePolicy): Self = StObject.set(x, "devicePolicy", value.asInstanceOf[js.Any])
    
    inline def setDevicePolicyUndefined: Self = StObject.set(x, "devicePolicy", js.undefined)
    
    inline def setIpSubnetworks(value: js.Array[String]): Self = StObject.set(x, "ipSubnetworks", value.asInstanceOf[js.Any])
    
    inline def setIpSubnetworksNull: Self = StObject.set(x, "ipSubnetworks", null)
    
    inline def setIpSubnetworksUndefined: Self = StObject.set(x, "ipSubnetworks", js.undefined)
    
    inline def setIpSubnetworksVarargs(value: String*): Self = StObject.set(x, "ipSubnetworks", js.Array(value*))
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setNegateNull: Self = StObject.set(x, "negate", null)
    
    inline def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
    
    inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsNull: Self = StObject.set(x, "regions", null)
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setRequiredAccessLevels(value: js.Array[String]): Self = StObject.set(x, "requiredAccessLevels", value.asInstanceOf[js.Any])
    
    inline def setRequiredAccessLevelsNull: Self = StObject.set(x, "requiredAccessLevels", null)
    
    inline def setRequiredAccessLevelsUndefined: Self = StObject.set(x, "requiredAccessLevels", js.undefined)
    
    inline def setRequiredAccessLevelsVarargs(value: String*): Self = StObject.set(x, "requiredAccessLevels", js.Array(value*))
  }
}
