package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofsl extends js.Object {
  
  def send_reply(code: Double, reason: String): Double = js.native
  
  def sl_forward_reply(code: String, reason: String): Double = js.native
  
  def sl_reply_error(): Double = js.native
  
  def sl_send_reply(code: Double, reason: String): Double = js.native
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
  
  @scala.inline
  implicit class TypeofslOps[Self <: Typeofsl] (val x: Self) extends AnyVal {
    
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
    def setSend_reply(value: (Double, String) => Double): Self = this.set("send_reply", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSl_forward_reply(value: (String, String) => Double): Self = this.set("sl_forward_reply", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSl_reply_error(value: () => Double): Self = this.set("sl_reply_error", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSl_send_reply(value: (Double, String) => Double): Self = this.set("sl_send_reply", js.Any.fromFunction2(value))
  }
}
