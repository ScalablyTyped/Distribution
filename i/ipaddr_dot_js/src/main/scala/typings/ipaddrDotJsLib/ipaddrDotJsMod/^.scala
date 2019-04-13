package typings
package ipaddrDotJsLib.ipaddrDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipaddr.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromByteArray(bytes: js.Array[scala.Double]): IPv4 | IPv6 = js.native
  def isValid(addr: java.lang.String): scala.Boolean = js.native
  def parse(addr: java.lang.String): IPv4 | IPv6 = js.native
  def parseCIDR(mask: java.lang.String): js.Tuple2[IPv4 | IPv6, scala.Double] = js.native
  def process(address: java.lang.String): IPv4 | IPv6 = js.native
  def subnetMatch(addr: IPv4, rangeList: RangeList[IPv4]): java.lang.String = js.native
  def subnetMatch(addr: IPv4, rangeList: RangeList[IPv4], defaultName: java.lang.String): java.lang.String = js.native
  def subnetMatch(addr: IPv6, rangeList: RangeList[IPv6]): java.lang.String = js.native
  def subnetMatch(addr: IPv6, rangeList: RangeList[IPv6], defaultName: java.lang.String): java.lang.String = js.native
}

