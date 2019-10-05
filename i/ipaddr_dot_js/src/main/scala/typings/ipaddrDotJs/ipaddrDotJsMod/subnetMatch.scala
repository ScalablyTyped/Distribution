package typings.ipaddrDotJs.ipaddrDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ipaddr.js", "subnetMatch")
@js.native
object subnetMatch extends js.Object {
  def apply(addr: IPv4, rangeList: RangeList[IPv4]): String = js.native
  def apply(addr: IPv4, rangeList: RangeList[IPv4], defaultName: String): String = js.native
  def apply(addr: IPv6, rangeList: RangeList[IPv6]): String = js.native
  def apply(addr: IPv6, rangeList: RangeList[IPv6], defaultName: String): String = js.native
}

