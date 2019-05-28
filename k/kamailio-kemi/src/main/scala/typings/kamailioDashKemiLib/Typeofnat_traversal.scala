package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnat_traversal extends js.Object {
  def client_nat_test(tests: scala.Double): scala.Double
  def fix_contact(): scala.Double
  def nat_keepalive(): scala.Double
}

object Typeofnat_traversal {
  @scala.inline
  def apply(
    client_nat_test: scala.Double => scala.Double,
    fix_contact: () => scala.Double,
    nat_keepalive: () => scala.Double
  ): Typeofnat_traversal = {
    val __obj = js.Dynamic.literal(client_nat_test = js.Any.fromFunction1(client_nat_test), fix_contact = js.Any.fromFunction0(fix_contact), nat_keepalive = js.Any.fromFunction0(nat_keepalive))
  
    __obj.asInstanceOf[Typeofnat_traversal]
  }
}

