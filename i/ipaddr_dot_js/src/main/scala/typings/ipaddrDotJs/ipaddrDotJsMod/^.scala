package typings.ipaddrDotJs.ipaddrDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipaddr.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromByteArray(bytes: js.Array[Double]): IPv4 | IPv6 = js.native
  def isValid(addr: String): Boolean = js.native
  def parse(addr: String): IPv4 | IPv6 = js.native
  def parseCIDR(mask: String): js.Tuple2[IPv4 | IPv6, Double] = js.native
  def process(address: String): IPv4 | IPv6 = js.native
  def subnetMatch(addr: IPv4, rangeList: RangeList[IPv4]): String = js.native
  def subnetMatch(addr: IPv4, rangeList: RangeList[IPv4], defaultName: String): String = js.native
  def subnetMatch(addr: IPv6, rangeList: RangeList[IPv6]): String = js.native
  def subnetMatch(addr: IPv6, rangeList: RangeList[IPv6], defaultName: String): String = js.native
}

