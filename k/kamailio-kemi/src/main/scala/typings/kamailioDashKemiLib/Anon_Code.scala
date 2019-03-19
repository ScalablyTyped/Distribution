package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  def send_reply(code: scala.Double, reason: java.lang.String): scala.Double
  def sl_forward_reply(code: java.lang.String, reason: java.lang.String): scala.Double
  def sl_reply_error(): scala.Double
  def sl_send_reply(code: scala.Double, reason: java.lang.String): scala.Double
}

object Anon_Code {
  @scala.inline
  def apply(
    send_reply: (scala.Double, java.lang.String) => scala.Double,
    sl_forward_reply: (java.lang.String, java.lang.String) => scala.Double,
    sl_reply_error: () => scala.Double,
    sl_send_reply: (scala.Double, java.lang.String) => scala.Double
  ): Anon_Code = {
    val __obj = js.Dynamic.literal(send_reply = js.Any.fromFunction2(send_reply), sl_forward_reply = js.Any.fromFunction2(sl_forward_reply), sl_reply_error = js.Any.fromFunction0(sl_reply_error), sl_send_reply = js.Any.fromFunction2(sl_send_reply))
  
    __obj.asInstanceOf[Anon_Code]
  }
}

