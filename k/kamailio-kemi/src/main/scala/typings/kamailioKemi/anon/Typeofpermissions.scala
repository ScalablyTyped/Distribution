package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpermissions extends js.Object {
  def allow_address(addr_group: Double, ips: String, port: Double): Double = js.native
  def allow_address_group(_addr: String, _port: Double): Double = js.native
  def allow_source_address(addr_group: Double): Double = js.native
  def allow_source_address_group(): Double = js.native
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
  @scala.inline
  implicit class TypeofpermissionsOps[Self <: Typeofpermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllow_address(value: (Double, String, Double) => Double): Self = this.set("allow_address", js.Any.fromFunction3(value))
    @scala.inline
    def setAllow_address_group(value: (String, Double) => Double): Self = this.set("allow_address_group", js.Any.fromFunction2(value))
    @scala.inline
    def setAllow_source_address(value: Double => Double): Self = this.set("allow_source_address", js.Any.fromFunction1(value))
    @scala.inline
    def setAllow_source_address_group(value: () => Double): Self = this.set("allow_source_address_group", js.Any.fromFunction0(value))
  }
  
}

