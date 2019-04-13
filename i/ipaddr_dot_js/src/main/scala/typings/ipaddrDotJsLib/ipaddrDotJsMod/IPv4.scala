package typings
package ipaddrDotJsLib.ipaddrDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipaddr.js", "IPv4")
@js.native
class IPv4 protected () extends IP {
  def this(octets: js.Array[scala.Double]) = this()
  def kind(): ipaddrDotJsLib.ipaddrDotJsLibStrings.ipv4 = js.native
  def `match`(addr: IPv4, bits: scala.Double): scala.Boolean = js.native
  def `match`(mask: js.Tuple2[IPv4, scala.Double]): scala.Boolean = js.native
  /* CompleteClass */
  override def prefixLengthFromSubnetMask(): scala.Double | ipaddrDotJsLib.ipaddrDotJsLibNumbers.`false` = js.native
  def range(): IPv4Range = js.native
  def subnetMatch(rangeList: RangeList[IPv4]): java.lang.String = js.native
  def subnetMatch(rangeList: RangeList[IPv4], defaultName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def toByteArray(): js.Array[scala.Double] = js.native
  def toIPv4MappedAddress(): IPv6 = js.native
  /* CompleteClass */
  override def toNormalizedString(): java.lang.String = js.native
}

/* static members */
@JSImport("ipaddr.js", "IPv4")
@js.native
object IPv4 extends js.Object {
  def broadcastAddressFromCIDR(addr: java.lang.String): ipaddrDotJsLib.ipaddrDotJsMod.IPv4 = js.native
  def isIPv4(addr: java.lang.String): scala.Boolean = js.native
  def isValid(addr: java.lang.String): scala.Boolean = js.native
  def isValidFourPartDecimal(addr: java.lang.String): scala.Boolean = js.native
  def networkAddressFromCIDR(addr: java.lang.String): ipaddrDotJsLib.ipaddrDotJsMod.IPv4 = js.native
  def parse(addr: java.lang.String): ipaddrDotJsLib.ipaddrDotJsMod.IPv4 = js.native
  def parseCIDR(addr: java.lang.String): js.Tuple2[ipaddrDotJsLib.ipaddrDotJsMod.IPv4, scala.Double] = js.native
  def subnetMaskFromPrefixLength(prefix: scala.Double): ipaddrDotJsLib.ipaddrDotJsMod.IPv4 = js.native
}

