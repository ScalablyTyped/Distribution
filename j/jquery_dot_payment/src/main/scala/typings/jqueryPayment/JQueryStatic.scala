package typings.jqueryPayment

import typings.jqueryPayment.JQueryPayment.Payment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var payment: Payment
}

object JQueryStatic {
  @scala.inline
  def apply(payment: Payment): JQueryStatic = {
    val __obj = js.Dynamic.literal(payment = payment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

