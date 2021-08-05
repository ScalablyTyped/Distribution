package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterBgp extends StObject {
  
  /** User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM. */
  var advertiseMode: js.UndefOr[String] = js.undefined
  
  /**
    * User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
    * groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router.
    * These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[RouterAdvertisedIpRange]] = js.undefined
  
  /**
    * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to
    * this router will have the same local ASN.
    */
  var asn: js.UndefOr[Double] = js.undefined
}
object RouterBgp {
  
  inline def apply(): RouterBgp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterBgp]
  }
  
  extension [Self <: RouterBgp](x: Self) {
    
    inline def setAdvertiseMode(value: String): Self = StObject.set(x, "advertiseMode", value.asInstanceOf[js.Any])
    
    inline def setAdvertiseModeUndefined: Self = StObject.set(x, "advertiseMode", js.undefined)
    
    inline def setAdvertisedGroups(value: js.Array[String]): Self = StObject.set(x, "advertisedGroups", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedGroupsUndefined: Self = StObject.set(x, "advertisedGroups", js.undefined)
    
    inline def setAdvertisedGroupsVarargs(value: String*): Self = StObject.set(x, "advertisedGroups", js.Array(value :_*))
    
    inline def setAdvertisedIpRanges(value: js.Array[RouterAdvertisedIpRange]): Self = StObject.set(x, "advertisedIpRanges", value.asInstanceOf[js.Any])
    
    inline def setAdvertisedIpRangesUndefined: Self = StObject.set(x, "advertisedIpRanges", js.undefined)
    
    inline def setAdvertisedIpRangesVarargs(value: RouterAdvertisedIpRange*): Self = StObject.set(x, "advertisedIpRanges", js.Array(value :_*))
    
    inline def setAsn(value: Double): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    inline def setAsnUndefined: Self = StObject.set(x, "asn", js.undefined)
  }
}
