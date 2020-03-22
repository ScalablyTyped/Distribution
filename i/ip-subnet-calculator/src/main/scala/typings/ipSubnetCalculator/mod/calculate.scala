package typings.ipSubnetCalculator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ip-subnet-calculator", "calculate")
@js.native
object calculate extends js.Object {
  def apply(ipStart: String, ipEnd: String): js.Array[SubnetResult] = js.native
  def apply(ipStart: String, ipEnd: Double): js.Array[SubnetResult] = js.native
  def apply(ipStart: Double, ipEnd: String): js.Array[SubnetResult] = js.native
  def apply(ipStart: Double, ipEnd: Double): js.Array[SubnetResult] = js.native
}

