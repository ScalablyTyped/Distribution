package typings
package ipaddrDotJsLib.ipaddrDotJsMod.AddressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPv6
  extends ipaddrDotJsLib.ipaddrDotJsMod.IP {
  def isIPv4MappedAddress(): scala.Boolean = js.native
  def kind(): ipaddrDotJsLib.ipaddrDotJsLibStrings.ipv6 = js.native
  def `match`(addr: IPv6, bits: scala.Double): scala.Boolean = js.native
  def `match`(mask: js.Tuple2[IPv6, scala.Double]): scala.Boolean = js.native
  def range(): ipaddrDotJsLib.ipaddrDotJsMod.IPv6Range = js.native
  def subnetMatch(rangeList: ipaddrDotJsLib.ipaddrDotJsMod.RangeList[IPv6]): java.lang.String = js.native
  def subnetMatch(rangeList: ipaddrDotJsLib.ipaddrDotJsMod.RangeList[IPv6], defaultName: java.lang.String): java.lang.String = js.native
  def toIPv4Address(): IPv4 = js.native
}

