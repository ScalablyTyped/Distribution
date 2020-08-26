package typings.ipaddrJs.mod

import typings.ipaddrJs.ipaddrJsStrings.ipv6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipaddr.js", "IPv6")
@js.native
class IPv6 protected () extends IP {
  def this(parts: js.Array[Double]) = this()
  var parts: js.Array[Double] = js.native
  var zoneId: js.UndefOr[String] = js.native
  def isIPv4MappedAddress(): Boolean = js.native
  def kind(): ipv6 = js.native
  def `match`(addr: IPv6, bits: Double): Boolean = js.native
  def `match`(mask: js.Tuple2[IPv6, Double]): Boolean = js.native
  def range(): IPv6Range = js.native
  def subnetMatch(rangeList: RangeList[IPv6]): String = js.native
  def subnetMatch(rangeList: RangeList[IPv6], defaultName: String): String = js.native
  def toIPv4Address(): IPv4 = js.native
}

/* static members */
@JSImport("ipaddr.js", "IPv6")
@js.native
object IPv6 extends js.Object {
  def broadcastAddressFromCIDR(addr: String): IPv6 = js.native
  def isIPv6(addr: String): Boolean = js.native
  def isValid(addr: String): Boolean = js.native
  def parse(addr: String): IPv6 = js.native
  def parseCIDR(addr: String): js.Tuple2[IPv6, Double] = js.native
  def subnetMaskFromPrefixLength(prefix: Double): IPv6 = js.native
}

