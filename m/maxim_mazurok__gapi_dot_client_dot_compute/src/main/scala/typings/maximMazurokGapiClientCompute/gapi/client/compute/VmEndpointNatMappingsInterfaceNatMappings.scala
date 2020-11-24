package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VmEndpointNatMappingsInterfaceNatMappings extends js.Object {
  
  /**
    * List of all drain IP:port-range mappings assigned to this interface. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example:
    * ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
    */
  var drainNatIpPortRanges: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of all IP:port-range mappings assigned to this interface. These ranges are inclusive, that is, both the first and the last ports can be used for NAT. Example:
    * ["2.2.2.2:12345-12355", "1.1.1.1:2234-2234"].
    */
  var natIpPortRanges: js.UndefOr[js.Array[String]] = js.native
  
  /** Total number of drain ports across all NAT IPs allocated to this interface. It equals to the aggregated port number in the field drain_nat_ip_port_ranges. */
  var numTotalDrainNatPorts: js.UndefOr[Double] = js.native
  
  /** Total number of ports across all NAT IPs allocated to this interface. It equals to the aggregated port number in the field nat_ip_port_ranges. */
  var numTotalNatPorts: js.UndefOr[Double] = js.native
  
  /** Alias IP range for this interface endpoint. It will be a private (RFC 1918) IP range. Examples: "10.33.4.55/32", or "192.168.5.0/24". */
  var sourceAliasIpRange: js.UndefOr[String] = js.native
  
  /** Primary IP of the VM for this NIC. */
  var sourceVirtualIp: js.UndefOr[String] = js.native
}
object VmEndpointNatMappingsInterfaceNatMappings {
  
  @scala.inline
  def apply(): VmEndpointNatMappingsInterfaceNatMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmEndpointNatMappingsInterfaceNatMappings]
  }
  
  @scala.inline
  implicit class VmEndpointNatMappingsInterfaceNatMappingsOps[Self <: VmEndpointNatMappingsInterfaceNatMappings] (val x: Self) extends AnyVal {
    
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
    def setDrainNatIpPortRangesVarargs(value: String*): Self = this.set("drainNatIpPortRanges", js.Array(value :_*))
    
    @scala.inline
    def setDrainNatIpPortRanges(value: js.Array[String]): Self = this.set("drainNatIpPortRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrainNatIpPortRanges: Self = this.set("drainNatIpPortRanges", js.undefined)
    
    @scala.inline
    def setNatIpPortRangesVarargs(value: String*): Self = this.set("natIpPortRanges", js.Array(value :_*))
    
    @scala.inline
    def setNatIpPortRanges(value: js.Array[String]): Self = this.set("natIpPortRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatIpPortRanges: Self = this.set("natIpPortRanges", js.undefined)
    
    @scala.inline
    def setNumTotalDrainNatPorts(value: Double): Self = this.set("numTotalDrainNatPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTotalDrainNatPorts: Self = this.set("numTotalDrainNatPorts", js.undefined)
    
    @scala.inline
    def setNumTotalNatPorts(value: Double): Self = this.set("numTotalNatPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTotalNatPorts: Self = this.set("numTotalNatPorts", js.undefined)
    
    @scala.inline
    def setSourceAliasIpRange(value: String): Self = this.set("sourceAliasIpRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAliasIpRange: Self = this.set("sourceAliasIpRange", js.undefined)
    
    @scala.inline
    def setSourceVirtualIp(value: String): Self = this.set("sourceVirtualIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceVirtualIp: Self = this.set("sourceVirtualIp", js.undefined)
  }
}
