package typings.ipSubnetCalculator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ip-subnet-calculator", "calculateSubnetMask")
@js.native
object calculateSubnetMask extends js.Object {
  def apply(ip: String, prefixSize: Double): SubnetResult = js.native
  def apply(ip: Double, prefixSize: Double): SubnetResult = js.native
}

