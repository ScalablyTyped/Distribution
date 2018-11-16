package typings
package ipaddrDotJsLib.ipaddrDotJsMod.AddressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPv4
  extends ipaddrDotJsLib.ipaddrDotJsMod.IP {
  def kind(): ipaddrDotJsLib.ipaddrDotJsLibStrings.ipv4 = js.native
  def `match`(addr: IPv4, bits: scala.Double): scala.Boolean = js.native
  def `match`(mask: js.Tuple2[IPv4, scala.Double]): scala.Boolean = js.native
  def range(): ipaddrDotJsLib.ipaddrDotJsMod.IPv4Range = js.native
  def subnetMatch(rangeList: ipaddrDotJsLib.ipaddrDotJsMod.RangeList[IPv4]): java.lang.String = js.native
  def subnetMatch(rangeList: ipaddrDotJsLib.ipaddrDotJsMod.RangeList[IPv4], defaultName: java.lang.String): java.lang.String = js.native
  def toIPv4MappedAddress(): IPv6 = js.native
}

