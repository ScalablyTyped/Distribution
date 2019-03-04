package typings
package jqueryDotPaymentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var payment: jqueryDotPaymentLib.JQueryPaymentNs.Payment
}

object JQueryStatic {
  @scala.inline
  def apply(payment: jqueryDotPaymentLib.JQueryPaymentNs.Payment): JQueryStatic = {
    val __obj = js.Dynamic.literal(payment = payment)
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

