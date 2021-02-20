package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterBgp extends StObject {
  
  /** User-specified flag to indicate which mode to use for advertisement. The options are DEFAULT or CUSTOM. */
  var advertiseMode: js.UndefOr[String] = js.native
  
  /**
    * User-specified list of prefix groups to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router. These
    * groups will be advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
    */
  var advertisedGroups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and is advertised to all peers of the router.
    * These IP ranges will be advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
    */
  var advertisedIpRanges: js.UndefOr[js.Array[RouterAdvertisedIpRange]] = js.native
  
  /**
    * Local BGP Autonomous System Number (ASN). Must be an RFC6996 private ASN, either 16-bit or 32-bit. The value will be fixed for this router resource. All VPN tunnels that link to
    * this router will have the same local ASN.
    */
  var asn: js.UndefOr[Double] = js.native
}
object RouterBgp {
  
  @scala.inline
  def apply(): RouterBgp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterBgp]
  }
  
  @scala.inline
  implicit class RouterBgpMutableBuilder[Self <: RouterBgp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiseMode(value: String): Self = StObject.set(x, "advertiseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiseModeUndefined: Self = StObject.set(x, "advertiseMode", js.undefined)
    
    @scala.inline
    def setAdvertisedGroups(value: js.Array[String]): Self = StObject.set(x, "advertisedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisedGroupsUndefined: Self = StObject.set(x, "advertisedGroups", js.undefined)
    
    @scala.inline
    def setAdvertisedGroupsVarargs(value: String*): Self = StObject.set(x, "advertisedGroups", js.Array(value :_*))
    
    @scala.inline
    def setAdvertisedIpRanges(value: js.Array[RouterAdvertisedIpRange]): Self = StObject.set(x, "advertisedIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisedIpRangesUndefined: Self = StObject.set(x, "advertisedIpRanges", js.undefined)
    
    @scala.inline
    def setAdvertisedIpRangesVarargs(value: RouterAdvertisedIpRange*): Self = StObject.set(x, "advertisedIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setAsn(value: Double): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsnUndefined: Self = StObject.set(x, "asn", js.undefined)
  }
}
