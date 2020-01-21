package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofnatTraversal extends js.Object {
  def client_nat_test(tests: Double): Double
  def fix_contact(): Double
  def nat_keepalive(): Double
}

object TypeofnatTraversal {
  @scala.inline
  def apply(client_nat_test: Double => Double, fix_contact: () => Double, nat_keepalive: () => Double): TypeofnatTraversal = {
    val __obj = js.Dynamic.literal(client_nat_test = js.Any.fromFunction1(client_nat_test), fix_contact = js.Any.fromFunction0(fix_contact), nat_keepalive = js.Any.fromFunction0(nat_keepalive))
  
    __obj.asInstanceOf[TypeofnatTraversal]
  }
}

