package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterNat extends StObject {
  
  /**
    * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a
    * NAT only.
    */
  var drainNatIps: js.UndefOr[js.Array[String]] = js.undefined
  
  var enableEndpointIndependentMapping: js.UndefOr[Boolean] = js.undefined
  
  /** Timeout (in seconds) for ICMP connections. Defaults to 30s if not set. */
  var icmpIdleTimeoutSec: js.UndefOr[Double] = js.undefined
  
  /** Configure logging on this NAT. */
  var logConfig: js.UndefOr[RouterNatLogConfig] = js.undefined
  
  /**
    * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For
    * example, if the value of this field is 50, at least 64 ports are allocated to a VM.
    */
  var minPortsPerVm: js.UndefOr[Double] = js.undefined
  
  /** Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat
    * IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should
    * be empty.
    */
  var natIpAllocateOption: js.UndefOr[String] = js.undefined
  
  /** A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project. */
  var natIps: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specify the Nat option, which can take one of the following values: - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. -
    * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat
    * (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or
    * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
    */
  var sourceSubnetworkIpRangesToNat: js.UndefOr[String] = js.undefined
  
  /** A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above. */
  var subnetworks: js.UndefOr[js.Array[RouterNatSubnetworkToNat]] = js.undefined
  
  /** Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set. */
  var tcpEstablishedIdleTimeoutSec: js.UndefOr[Double] = js.undefined
  
  /** Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set. */
  var tcpTransitoryIdleTimeoutSec: js.UndefOr[Double] = js.undefined
  
  /** Timeout (in seconds) for UDP connections. Defaults to 30s if not set. */
  var udpIdleTimeoutSec: js.UndefOr[Double] = js.undefined
}
object RouterNat {
  
  inline def apply(): RouterNat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterNat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouterNat] (val x: Self) extends AnyVal {
    
    inline def setDrainNatIps(value: js.Array[String]): Self = StObject.set(x, "drainNatIps", value.asInstanceOf[js.Any])
    
    inline def setDrainNatIpsUndefined: Self = StObject.set(x, "drainNatIps", js.undefined)
    
    inline def setDrainNatIpsVarargs(value: String*): Self = StObject.set(x, "drainNatIps", js.Array(value*))
    
    inline def setEnableEndpointIndependentMapping(value: Boolean): Self = StObject.set(x, "enableEndpointIndependentMapping", value.asInstanceOf[js.Any])
    
    inline def setEnableEndpointIndependentMappingUndefined: Self = StObject.set(x, "enableEndpointIndependentMapping", js.undefined)
    
    inline def setIcmpIdleTimeoutSec(value: Double): Self = StObject.set(x, "icmpIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setIcmpIdleTimeoutSecUndefined: Self = StObject.set(x, "icmpIdleTimeoutSec", js.undefined)
    
    inline def setLogConfig(value: RouterNatLogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    inline def setMinPortsPerVm(value: Double): Self = StObject.set(x, "minPortsPerVm", value.asInstanceOf[js.Any])
    
    inline def setMinPortsPerVmUndefined: Self = StObject.set(x, "minPortsPerVm", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNatIpAllocateOption(value: String): Self = StObject.set(x, "natIpAllocateOption", value.asInstanceOf[js.Any])
    
    inline def setNatIpAllocateOptionUndefined: Self = StObject.set(x, "natIpAllocateOption", js.undefined)
    
    inline def setNatIps(value: js.Array[String]): Self = StObject.set(x, "natIps", value.asInstanceOf[js.Any])
    
    inline def setNatIpsUndefined: Self = StObject.set(x, "natIps", js.undefined)
    
    inline def setNatIpsVarargs(value: String*): Self = StObject.set(x, "natIps", js.Array(value*))
    
    inline def setSourceSubnetworkIpRangesToNat(value: String): Self = StObject.set(x, "sourceSubnetworkIpRangesToNat", value.asInstanceOf[js.Any])
    
    inline def setSourceSubnetworkIpRangesToNatUndefined: Self = StObject.set(x, "sourceSubnetworkIpRangesToNat", js.undefined)
    
    inline def setSubnetworks(value: js.Array[RouterNatSubnetworkToNat]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    inline def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    inline def setSubnetworksVarargs(value: RouterNatSubnetworkToNat*): Self = StObject.set(x, "subnetworks", js.Array(value*))
    
    inline def setTcpEstablishedIdleTimeoutSec(value: Double): Self = StObject.set(x, "tcpEstablishedIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTcpEstablishedIdleTimeoutSecUndefined: Self = StObject.set(x, "tcpEstablishedIdleTimeoutSec", js.undefined)
    
    inline def setTcpTransitoryIdleTimeoutSec(value: Double): Self = StObject.set(x, "tcpTransitoryIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTcpTransitoryIdleTimeoutSecUndefined: Self = StObject.set(x, "tcpTransitoryIdleTimeoutSec", js.undefined)
    
    inline def setUdpIdleTimeoutSec(value: Double): Self = StObject.set(x, "udpIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setUdpIdleTimeoutSecUndefined: Self = StObject.set(x, "udpIdleTimeoutSec", js.undefined)
  }
}
