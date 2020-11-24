package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdmq extends js.Object {
  
  def bcast_message(peer_str: String, body_str: String, ct_str: String): Double = js.native
  
  def handle_message(): Double = js.native
  
  def handle_message_rc(returnval: Double): Double = js.native
  
  def is_from_node(): Double = js.native
  
  def send_message(peer_str: String, to_str: String, body_str: String, ct_str: String): Double = js.native
  
  def t_replicate(): Double = js.native
  
  def t_replicate_mode(mode: Double): Double = js.native
}
object Typeofdmq {
  
  @scala.inline
  def apply(
    bcast_message: (String, String, String) => Double,
    handle_message: () => Double,
    handle_message_rc: Double => Double,
    is_from_node: () => Double,
    send_message: (String, String, String, String) => Double,
    t_replicate: () => Double,
    t_replicate_mode: Double => Double
  ): Typeofdmq = {
    val __obj = js.Dynamic.literal(bcast_message = js.Any.fromFunction3(bcast_message), handle_message = js.Any.fromFunction0(handle_message), handle_message_rc = js.Any.fromFunction1(handle_message_rc), is_from_node = js.Any.fromFunction0(is_from_node), send_message = js.Any.fromFunction4(send_message), t_replicate = js.Any.fromFunction0(t_replicate), t_replicate_mode = js.Any.fromFunction1(t_replicate_mode))
    __obj.asInstanceOf[Typeofdmq]
  }
  
  @scala.inline
  implicit class TypeofdmqOps[Self <: Typeofdmq] (val x: Self) extends AnyVal {
    
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
    def setBcast_message(value: (String, String, String) => Double): Self = this.set("bcast_message", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHandle_message(value: () => Double): Self = this.set("handle_message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandle_message_rc(value: Double => Double): Self = this.set("handle_message_rc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIs_from_node(value: () => Double): Self = this.set("is_from_node", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSend_message(value: (String, String, String, String) => Double): Self = this.set("send_message", js.Any.fromFunction4(value))
    
    @scala.inline
    def setT_replicate(value: () => Double): Self = this.set("t_replicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setT_replicate_mode(value: Double => Double): Self = this.set("t_replicate_mode", js.Any.fromFunction1(value))
  }
}
