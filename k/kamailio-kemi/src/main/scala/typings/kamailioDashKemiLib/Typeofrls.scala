package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofrls extends js.Object {
  def handle_notify(): scala.Double
  def handle_subscribe(): scala.Double
  def handle_subscribe_uri(wuri: java.lang.String): scala.Double
  def update_subs(uri: java.lang.String, event: java.lang.String): scala.Double
}

object Typeofrls {
  @scala.inline
  def apply(
    handle_notify: () => scala.Double,
    handle_subscribe: () => scala.Double,
    handle_subscribe_uri: java.lang.String => scala.Double,
    update_subs: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofrls = {
    val __obj = js.Dynamic.literal(handle_notify = js.Any.fromFunction0(handle_notify), handle_subscribe = js.Any.fromFunction0(handle_subscribe), handle_subscribe_uri = js.Any.fromFunction1(handle_subscribe_uri), update_subs = js.Any.fromFunction2(update_subs))
  
    __obj.asInstanceOf[Typeofrls]
  }
}

