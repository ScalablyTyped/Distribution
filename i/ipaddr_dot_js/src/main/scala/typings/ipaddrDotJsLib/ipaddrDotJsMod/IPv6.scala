package typings
package ipaddrDotJsLib.ipaddrDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipaddr.js", "IPv6")
@js.native
class IPv6 protected ()
  extends ipaddrDotJsLib.ipaddrDotJsMod.AddressNs.IPv6 {
  def this(octets: js.Array[scala.Double]) = this()
  /* CompleteClass */
  override def prefixLengthFromSubnetMask(): scala.Double | ipaddrDotJsLib.ipaddrDotJsLibNumbers.`false` = js.native
  /* CompleteClass */
  override def toByteArray(): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def toNormalizedString(): java.lang.String = js.native
}

@JSImport("ipaddr.js", "IPv6")
@js.native
object IPv6 extends js.Object {
  def broadcastAddressFromCIDR(addr: java.lang.String): ipaddrDotJsLib.ipaddrDotJsMod.AddressNs.IPv6 = js.native
  def isIPv6(addr: java.lang.String): scala.Boolean = js.native
  def isValid(addr: java.lang.String): scala.Boolean = js.native
  def parse(addr: java.lang.String): ipaddrDotJsLib.ipaddrDotJsMod.AddressNs.IPv6 = js.native
  def parseCIDR(addr: java.lang.String): js.Tuple2[ipaddrDotJsLib.ipaddrDotJsMod.AddressNs.IPv6, scala.Double] = js.native
  def subnetMaskFromPrefixLength(prefix: scala.Double): ipaddrDotJsLib.ipaddrDotJsMod.AddressNs.IPv6 = js.native
}

