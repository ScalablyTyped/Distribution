package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsl extends js.Object {
  def send_reply(code: Double, reason: String): Double
  def sl_forward_reply(code: String, reason: String): Double
  def sl_reply_error(): Double
  def sl_send_reply(code: Double, reason: String): Double
}

object Typeofsl {
  @scala.inline
  def apply(
    send_reply: (Double, String) => Double,
    sl_forward_reply: (String, String) => Double,
    sl_reply_error: () => Double,
    sl_send_reply: (Double, String) => Double
  ): Typeofsl = {
    val __obj = js.Dynamic.literal(send_reply = js.Any.fromFunction2(send_reply), sl_forward_reply = js.Any.fromFunction2(sl_forward_reply), sl_reply_error = js.Any.fromFunction0(sl_reply_error), sl_send_reply = js.Any.fromFunction2(sl_send_reply))
  
    __obj.asInstanceOf[Typeofsl]
  }
}

