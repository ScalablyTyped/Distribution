package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwebsocket extends js.Object {
  def close(): Double
  def close_conid(status: Double, reason: String, con: Double): Double
  def close_reason(status: Double, reason: String): Double
  def handle_handshake(): Double
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
}

