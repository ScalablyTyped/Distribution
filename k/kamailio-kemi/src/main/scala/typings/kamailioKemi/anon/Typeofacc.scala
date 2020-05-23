package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofacc extends js.Object {
  // Equivalent of native kamailio.cfg function: acc_db_request("comment", "dbtable").
  def acc_db_request(comment: String, dbtable: String): Double
  // Equivalent of native kamailio.cfg function: acc_log_request("comment").
  def acc_log_request(comment: String): Double
  // Equivalent of native kamailio.cfg function: acc_request("comment", "dbtable").
  def acc_request(comment: String, dbtable: String): Double
}

object Typeofacc {
  @scala.inline
  def apply(
    acc_db_request: (String, String) => Double,
    acc_log_request: String => Double,
    acc_request: (String, String) => Double
  ): Typeofacc = {
    val __obj = js.Dynamic.literal(acc_db_request = js.Any.fromFunction2(acc_db_request), acc_log_request = js.Any.fromFunction1(acc_log_request), acc_request = js.Any.fromFunction2(acc_request))
    __obj.asInstanceOf[Typeofacc]
  }
}

