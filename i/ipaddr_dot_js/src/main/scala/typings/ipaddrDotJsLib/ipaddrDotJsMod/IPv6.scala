package typings
package ipaddrDotJsLib.ipaddrDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipaddr.js", "IPv6")
@js.native
class IPv6 protected () extends IP {
  def this(octets: js.Array[scala.Double]) = this()
  def isIPv4MappedAddress(): scala.Boolean = js.native
  def kind(): ipaddrDotJsLib.ipaddrDotJsLibStrings.ipv6 = js.native
  def `match`(addr: IPv6, bits: scala.Double): scala.Boolean = js.native
  def `match`(mask: js.Tuple2[IPv6, scala.Double]): scala.Boolean = js.native
  /* CompleteClass */
  override def prefixLengthFromSubnetMask(): scala.Double | ipaddrDotJsLib.ipaddrDotJsLibNumbers.`false` = js.native
  def range(): IPv6Range = js.native
  def subnetMatch(rangeList: RangeList[IPv6]): java.lang.String = js.native
  def subnetMatch(rangeList: RangeList[IPv6], defaultName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def toByteArray(): js.Array[scala.Double] = js.native
  def toIPv4Address(): IPv4 = js.native
  /* CompleteClass */
  override def toNormalizedString(): java.lang.String = js.native
}

/* static members */
@JSImport("ipaddr.js", "IPv6")
@js.native
object IPv6 extends js.Object {
  def broadcastAddressFromCIDR(addr: java.lang.String): ipaddrDotJsLib.ipaddrDotJsMod.IPv6 = js.native
  def isIPv6(addr: java.lang.String): scala.Boolean = js.native
  def isValid(addr: java.lang.String): scala.Boolean = js.native
  def parse(addr: java.lang.String): ipaddrDotJsLib.ipaddrDotJsMod.IPv6 = js.native
  def parseCIDR(addr: java.lang.String): js.Tuple2[ipaddrDotJsLib.ipaddrDotJsMod.IPv6, scala.Double] = js.native
  def subnetMaskFromPrefixLength(prefix: scala.Double): ipaddrDotJsLib.ipaddrDotJsMod.IPv6 = js.native
}

