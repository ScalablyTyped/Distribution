package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofacc extends js.Object {
  // Equivalent of native kamailio.cfg function: acc_db_request("comment", "dbtable").
  def acc_db_request(comment: String, dbtable: String): Double = js.native
  // Equivalent of native kamailio.cfg function: acc_log_request("comment").
  def acc_log_request(comment: String): Double = js.native
  // Equivalent of native kamailio.cfg function: acc_request("comment", "dbtable").
  def acc_request(comment: String, dbtable: String): Double = js.native
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
  @scala.inline
  implicit class TypeofaccOps[Self <: Typeofacc] (val x: Self) extends AnyVal {
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
    def setAcc_db_request(value: (String, String) => Double): Self = this.set("acc_db_request", js.Any.fromFunction2(value))
    @scala.inline
    def setAcc_log_request(value: String => Double): Self = this.set("acc_log_request", js.Any.fromFunction1(value))
    @scala.inline
    def setAcc_request(value: (String, String) => Double): Self = this.set("acc_request", js.Any.fromFunction2(value))
  }
  
}

