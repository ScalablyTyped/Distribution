package typings.kamailioDashKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrls extends js.Object {
  def handle_notify(): Double
  def handle_subscribe(): Double
  def handle_subscribe_uri(wuri: String): Double
  def update_subs(uri: String, event: String): Double
}

object Typeofrls {
  @scala.inline
  def apply(
    handle_notify: () => Double,
    handle_subscribe: () => Double,
    handle_subscribe_uri: String => Double,
    update_subs: (String, String) => Double
  ): Typeofrls = {
    val __obj = js.Dynamic.literal(handle_notify = js.Any.fromFunction0(handle_notify), handle_subscribe = js.Any.fromFunction0(handle_subscribe), handle_subscribe_uri = js.Any.fromFunction1(handle_subscribe_uri), update_subs = js.Any.fromFunction2(update_subs))
  
    __obj.asInstanceOf[Typeofrls]
  }
}

