package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwebsocket extends js.Object {
  def close(): Double = js.native
  def close_conid(status: Double, reason: String, con: Double): Double = js.native
  def close_reason(status: Double, reason: String): Double = js.native
  def handle_handshake(): Double = js.native
}

object Typeofwebsocket {
  @scala.inline
  def apply(
    close: () => Double,
    close_conid: (Double, String, Double) => Double,
    close_reason: (Double, String) => Double,
    handle_handshake: () => Double
  ): Typeofwebsocket = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), close_conid = js.Any.fromFunction3(close_conid), close_reason = js.Any.fromFunction2(close_reason), handle_handshake = js.Any.fromFunction0(handle_handshake))
    __obj.asInstanceOf[Typeofwebsocket]
  }
  @scala.inline
  implicit class TypeofwebsocketOps[Self <: Typeofwebsocket] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Double): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setClose_conid(value: (Double, String, Double) => Double): Self = this.set("close_conid", js.Any.fromFunction3(value))
    @scala.inline
    def setClose_reason(value: (Double, String) => Double): Self = this.set("close_reason", js.Any.fromFunction2(value))
    @scala.inline
    def setHandle_handshake(value: () => Double): Self = this.set("handle_handshake", js.Any.fromFunction0(value))
  }
  
}

