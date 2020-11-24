package typings.ipSubnetCalculator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ip-subnet-calculator", "calculateCIDRPrefix")
@js.native
object calculateCIDRPrefix extends js.Object {
  
  def apply(ip: String, subnetMask: String): SubnetResult = js.native
  def apply(ip: String, subnetMask: Double): SubnetResult = js.native
  def apply(ip: Double, subnetMask: String): SubnetResult = js.native
  def apply(ip: Double, subnetMask: Double): SubnetResult = js.native
}
