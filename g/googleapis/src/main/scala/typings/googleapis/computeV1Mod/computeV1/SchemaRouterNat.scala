package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Nat resource. It enables the VMs within the specified
  * subnetworks to access Internet without external IP addresses. It specifies
  * a list of subnetworks (and the ranges within) that want to use NAT.
  * Customers can also provide the external IPs that would be used for NAT. GCP
  * would auto-allocate ephemeral IPs if no external IPs are provided.
  */
trait SchemaRouterNat extends StObject {
  
  /**
    * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
    */
  var icmpIdleTimeoutSec: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of ports allocated to a VM from this NAT config. If not
    * set, a default number of ports is allocated to a VM. This gets rounded up
    * to the nearest power of 2. Eg. if the value of this field is 50, at least
    * 64 ports will be allocated to a VM.
    */
  var minPortsPerVm: js.UndefOr[Double] = js.undefined
  
  /**
    * Unique name of this Nat service. The name must be 1-63 characters long
    * and comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specify the NatIpAllocateOption. If it is AUTO_ONLY, then nat_ip should
    * be empty.
    */
  var natIpAllocateOption: js.UndefOr[String] = js.undefined
  
  /**
    * A list of URLs of the IP resources used for this Nat service. These IPs
    * must be valid static external IP addresses assigned to the project.
    * max_length is subject to change post alpha.
    */
  var natIps: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specify the Nat option. If this field contains
    * ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES,
    * then there should not be any other Router.Nat section in any Router for
    * this network in this region.
    */
  var sourceSubnetworkIpRangesToNat: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Subnetwork resources whose traffic should be translated by NAT
    * Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the
    * SubnetworkIpRangeToNatOption above.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaRouterNatSubnetworkToNat]] = js.undefined
  
  /**
    * Timeout (in seconds) for TCP established connections. Defaults to 1200s
    * if not set.
    */
  var tcpEstablishedIdleTimeoutSec: js.UndefOr[Double] = js.undefined
  
  /**
    * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if
    * not set.
    */
  var tcpTransitoryIdleTimeoutSec: js.UndefOr[Double] = js.undefined
  
  /**
    * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
    */
  var udpIdleTimeoutSec: js.UndefOr[Double] = js.undefined
}
object SchemaRouterNat {
  
  inline def apply(): SchemaRouterNat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterNat]
  }
  
  extension [Self <: SchemaRouterNat](x: Self) {
    
    inline def setIcmpIdleTimeoutSec(value: Double): Self = StObject.set(x, "icmpIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setIcmpIdleTimeoutSecUndefined: Self = StObject.set(x, "icmpIdleTimeoutSec", js.undefined)
    
    inline def setMinPortsPerVm(value: Double): Self = StObject.set(x, "minPortsPerVm", value.asInstanceOf[js.Any])
    
    inline def setMinPortsPerVmUndefined: Self = StObject.set(x, "minPortsPerVm", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNatIpAllocateOption(value: String): Self = StObject.set(x, "natIpAllocateOption", value.asInstanceOf[js.Any])
    
    inline def setNatIpAllocateOptionUndefined: Self = StObject.set(x, "natIpAllocateOption", js.undefined)
    
    inline def setNatIps(value: js.Array[String]): Self = StObject.set(x, "natIps", value.asInstanceOf[js.Any])
    
    inline def setNatIpsUndefined: Self = StObject.set(x, "natIps", js.undefined)
    
    inline def setNatIpsVarargs(value: String*): Self = StObject.set(x, "natIps", js.Array(value :_*))
    
    inline def setSourceSubnetworkIpRangesToNat(value: String): Self = StObject.set(x, "sourceSubnetworkIpRangesToNat", value.asInstanceOf[js.Any])
    
    inline def setSourceSubnetworkIpRangesToNatUndefined: Self = StObject.set(x, "sourceSubnetworkIpRangesToNat", js.undefined)
    
    inline def setSubnetworks(value: js.Array[SchemaRouterNatSubnetworkToNat]): Self = StObject.set(x, "subnetworks", value.asInstanceOf[js.Any])
    
    inline def setSubnetworksUndefined: Self = StObject.set(x, "subnetworks", js.undefined)
    
    inline def setSubnetworksVarargs(value: SchemaRouterNatSubnetworkToNat*): Self = StObject.set(x, "subnetworks", js.Array(value :_*))
    
    inline def setTcpEstablishedIdleTimeoutSec(value: Double): Self = StObject.set(x, "tcpEstablishedIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTcpEstablishedIdleTimeoutSecUndefined: Self = StObject.set(x, "tcpEstablishedIdleTimeoutSec", js.undefined)
    
    inline def setTcpTransitoryIdleTimeoutSec(value: Double): Self = StObject.set(x, "tcpTransitoryIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTcpTransitoryIdleTimeoutSecUndefined: Self = StObject.set(x, "tcpTransitoryIdleTimeoutSec", js.undefined)
    
    inline def setUdpIdleTimeoutSec(value: Double): Self = StObject.set(x, "udpIdleTimeoutSec", value.asInstanceOf[js.Any])
    
    inline def setUdpIdleTimeoutSecUndefined: Self = StObject.set(x, "udpIdleTimeoutSec", js.undefined)
  }
}
