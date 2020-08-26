package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofnatTraversal extends js.Object {
  def client_nat_test(tests: Double): Double = js.native
  def fix_contact(): Double = js.native
  def nat_keepalive(): Double = js.native
}

object TypeofnatTraversal {
  @scala.inline
  def apply(client_nat_test: Double => Double, fix_contact: () => Double, nat_keepalive: () => Double): TypeofnatTraversal = {
    val __obj = js.Dynamic.literal(client_nat_test = js.Any.fromFunction1(client_nat_test), fix_contact = js.Any.fromFunction0(fix_contact), nat_keepalive = js.Any.fromFunction0(nat_keepalive))
    __obj.asInstanceOf[TypeofnatTraversal]
  }
  @scala.inline
  implicit class TypeofnatTraversalOps[Self <: TypeofnatTraversal] (val x: Self) extends AnyVal {
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
    def setClient_nat_test(value: Double => Double): Self = this.set("client_nat_test", js.Any.fromFunction1(value))
    @scala.inline
    def setFix_contact(value: () => Double): Self = this.set("fix_contact", js.Any.fromFunction0(value))
    @scala.inline
    def setNat_keepalive(value: () => Double): Self = this.set("nat_keepalive", js.Any.fromFunction0(value))
  }
  
}

