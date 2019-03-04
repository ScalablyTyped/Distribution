package typings
package jqueryDotPaymentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def payment(command: java.lang.String): JQuery
}

object JQuery {
  @scala.inline
  def apply(payment: js.Function1[java.lang.String, JQuery]): JQuery = {
    val __obj = js.Dynamic.literal(payment = payment)
  
    __obj.asInstanceOf[JQuery]
  }
}

