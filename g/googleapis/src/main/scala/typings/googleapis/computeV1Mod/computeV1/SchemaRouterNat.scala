package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Nat resource. It enables the VMs within the specified
  * subnetworks to access Internet without external IP addresses. It specifies
  * a list of subnetworks (and the ranges within) that want to use NAT.
  * Customers can also provide the external IPs that would be used for NAT. GCP
  * would auto-allocate ephemeral IPs if no external IPs are provided.
  */
@js.native
trait SchemaRouterNat extends js.Object {
  /**
    * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
    */
  var icmpIdleTimeoutSec: js.UndefOr[Double] = js.native
  /**
    * Minimum number of ports allocated to a VM from this NAT config. If not
    * set, a default number of ports is allocated to a VM. This gets rounded up
    * to the nearest power of 2. Eg. if the value of this field is 50, at least
    * 64 ports will be allocated to a VM.
    */
  var minPortsPerVm: js.UndefOr[Double] = js.native
  /**
    * Unique name of this Nat service. The name must be 1-63 characters long
    * and comply with RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specify the NatIpAllocateOption. If it is AUTO_ONLY, then nat_ip should
    * be empty.
    */
  var natIpAllocateOption: js.UndefOr[String] = js.native
  /**
    * A list of URLs of the IP resources used for this Nat service. These IPs
    * must be valid static external IP addresses assigned to the project.
    * max_length is subject to change post alpha.
    */
  var natIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specify the Nat option. If this field contains
    * ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES,
    * then there should not be any other Router.Nat section in any Router for
    * this network in this region.
    */
  var sourceSubnetworkIpRangesToNat: js.UndefOr[String] = js.native
  /**
    * A list of Subnetwork resources whose traffic should be translated by NAT
    * Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the
    * SubnetworkIpRangeToNatOption above.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaRouterNatSubnetworkToNat]] = js.native
  /**
    * Timeout (in seconds) for TCP established connections. Defaults to 1200s
    * if not set.
    */
  var tcpEstablishedIdleTimeoutSec: js.UndefOr[Double] = js.native
  /**
    * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if
    * not set.
    */
  var tcpTransitoryIdleTimeoutSec: js.UndefOr[Double] = js.native
  /**
    * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
    */
  var udpIdleTimeoutSec: js.UndefOr[Double] = js.native
}

object SchemaRouterNat {
  @scala.inline
  def apply(
    icmpIdleTimeoutSec: Int | Double = null,
    minPortsPerVm: Int | Double = null,
    name: String = null,
    natIpAllocateOption: String = null,
    natIps: js.Array[String] = null,
    sourceSubnetworkIpRangesToNat: String = null,
    subnetworks: js.Array[SchemaRouterNatSubnetworkToNat] = null,
    tcpEstablishedIdleTimeoutSec: Int | Double = null,
    tcpTransitoryIdleTimeoutSec: Int | Double = null,
    udpIdleTimeoutSec: Int | Double = null
  ): SchemaRouterNat = {
    val __obj = js.Dynamic.literal()
    if (icmpIdleTimeoutSec != null) __obj.updateDynamic("icmpIdleTimeoutSec")(icmpIdleTimeoutSec.asInstanceOf[js.Any])
    if (minPortsPerVm != null) __obj.updateDynamic("minPortsPerVm")(minPortsPerVm.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (natIpAllocateOption != null) __obj.updateDynamic("natIpAllocateOption")(natIpAllocateOption.asInstanceOf[js.Any])
    if (natIps != null) __obj.updateDynamic("natIps")(natIps.asInstanceOf[js.Any])
    if (sourceSubnetworkIpRangesToNat != null) __obj.updateDynamic("sourceSubnetworkIpRangesToNat")(sourceSubnetworkIpRangesToNat.asInstanceOf[js.Any])
    if (subnetworks != null) __obj.updateDynamic("subnetworks")(subnetworks.asInstanceOf[js.Any])
    if (tcpEstablishedIdleTimeoutSec != null) __obj.updateDynamic("tcpEstablishedIdleTimeoutSec")(tcpEstablishedIdleTimeoutSec.asInstanceOf[js.Any])
    if (tcpTransitoryIdleTimeoutSec != null) __obj.updateDynamic("tcpTransitoryIdleTimeoutSec")(tcpTransitoryIdleTimeoutSec.asInstanceOf[js.Any])
    if (udpIdleTimeoutSec != null) __obj.updateDynamic("udpIdleTimeoutSec")(udpIdleTimeoutSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRouterNat]
  }
}

