package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdmq extends js.Object {
  def bcast_message(peer_str: String, body_str: String, ct_str: String): Double
  def handle_message(): Double
  def handle_message_rc(returnval: Double): Double
  def is_from_node(): Double
  def send_message(peer_str: String, to_str: String, body_str: String, ct_str: String): Double
  def t_replicate(): Double
  def t_replicate_mode(mode: Double): Double
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
}

