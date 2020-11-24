package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterNatSubnetworkToNat extends js.Object {
  
  /** URL for the subnetwork resource that will use NAT. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in
    * source_ip_ranges_to_nat.
    */
  var secondaryIpRangeNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is:
    * ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
    */
  var sourceIpRangesToNat: js.UndefOr[js.Array[String]] = js.native
}
object RouterNatSubnetworkToNat {
  
  @scala.inline
  def apply(): RouterNatSubnetworkToNat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterNatSubnetworkToNat]
  }
  
  @scala.inline
  implicit class RouterNatSubnetworkToNatOps[Self <: RouterNatSubnetworkToNat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSecondaryIpRangeNamesVarargs(value: String*): Self = this.set("secondaryIpRangeNames", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryIpRangeNames(value: js.Array[String]): Self = this.set("secondaryIpRangeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryIpRangeNames: Self = this.set("secondaryIpRangeNames", js.undefined)
    
    @scala.inline
    def setSourceIpRangesToNatVarargs(value: String*): Self = this.set("sourceIpRangesToNat", js.Array(value :_*))
    
    @scala.inline
    def setSourceIpRangesToNat(value: js.Array[String]): Self = this.set("sourceIpRangesToNat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIpRangesToNat: Self = this.set("sourceIpRangesToNat", js.undefined)
  }
}
