package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdmq extends js.Object {
  def bcast_message(peer_str: java.lang.String, body_str: java.lang.String, ct_str: java.lang.String): scala.Double
  def handle_message(): scala.Double
  def handle_message_rc(returnval: scala.Double): scala.Double
  def is_from_node(): scala.Double
  def send_message(
    peer_str: java.lang.String,
    to_str: java.lang.String,
    body_str: java.lang.String,
    ct_str: java.lang.String
  ): scala.Double
  def t_replicate(): scala.Double
  def t_replicate_mode(mode: scala.Double): scala.Double
}

object Typeofdmq {
  @scala.inline
  def apply(
    bcast_message: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    handle_message: () => scala.Double,
    handle_message_rc: scala.Double => scala.Double,
    is_from_node: () => scala.Double,
    send_message: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    t_replicate: () => scala.Double,
    t_replicate_mode: scala.Double => scala.Double
  ): Typeofdmq = {
    val __obj = js.Dynamic.literal(bcast_message = js.Any.fromFunction3(bcast_message), handle_message = js.Any.fromFunction0(handle_message), handle_message_rc = js.Any.fromFunction1(handle_message_rc), is_from_node = js.Any.fromFunction0(is_from_node), send_message = js.Any.fromFunction4(send_message), t_replicate = js.Any.fromFunction0(t_replicate), t_replicate_mode = js.Any.fromFunction1(t_replicate_mode))
  
    __obj.asInstanceOf[Typeofdmq]
  }
}

