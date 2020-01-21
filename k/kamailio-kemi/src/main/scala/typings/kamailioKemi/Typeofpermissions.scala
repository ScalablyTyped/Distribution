package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpermissions extends js.Object {
  def allow_address(addr_group: Double, ips: String, port: Double): Double
  def allow_address_group(_addr: String, _port: Double): Double
  def allow_source_address(addr_group: Double): Double
  def allow_source_address_group(): Double
}

object Typeofpermissions {
  @scala.inline
  def apply(
    allow_address: (Double, String, Double) => Double,
    allow_address_group: (String, Double) => Double,
    allow_source_address: Double => Double,
    allow_source_address_group: () => Double
  ): Typeofpermissions = {
    val __obj = js.Dynamic.literal(allow_address = js.Any.fromFunction3(allow_address), allow_address_group = js.Any.fromFunction2(allow_address_group), allow_source_address = js.Any.fromFunction1(allow_source_address), allow_source_address_group = js.Any.fromFunction0(allow_source_address_group))
  
    __obj.asInstanceOf[Typeofpermissions]
  }
}

