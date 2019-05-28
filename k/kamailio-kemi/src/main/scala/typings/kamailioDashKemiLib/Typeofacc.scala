package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofacc extends js.Object {
  // Equivalent of native kamailio.cfg function: acc_db_request("comment", "dbtable").
  def acc_db_request(comment: java.lang.String, dbtable: java.lang.String): scala.Double
  // Equivalent of native kamailio.cfg function: acc_log_request("comment").
  def acc_log_request(comment: java.lang.String): scala.Double
  // Equivalent of native kamailio.cfg function: acc_request("comment", "dbtable").
  def acc_request(comment: java.lang.String, dbtable: java.lang.String): scala.Double
}

object Typeofacc {
  @scala.inline
  def apply(
    acc_db_request: (java.lang.String, java.lang.String) => scala.Double,
    acc_log_request: java.lang.String => scala.Double,
    acc_request: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofacc = {
    val __obj = js.Dynamic.literal(acc_db_request = js.Any.fromFunction2(acc_db_request), acc_log_request = js.Any.fromFunction1(acc_log_request), acc_request = js.Any.fromFunction2(acc_request))
  
    __obj.asInstanceOf[Typeofacc]
  }
}

