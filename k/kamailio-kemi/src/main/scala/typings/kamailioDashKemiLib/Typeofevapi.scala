package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofevapi extends js.Object {
  def async_relay(sdata: java.lang.String): scala.Double
  def close(): scala.Double
  def relay(sdata: java.lang.String): scala.Double
  def relay_multicast(sdata: java.lang.String, stag: java.lang.String): scala.Double
  def relay_unicast(sdata: java.lang.String, stag: java.lang.String): scala.Double
  def set_tag(stag: java.lang.String): scala.Double
}

object Typeofevapi {
  @scala.inline
  def apply(
    async_relay: java.lang.String => scala.Double,
    close: () => scala.Double,
    relay: java.lang.String => scala.Double,
    relay_multicast: (java.lang.String, java.lang.String) => scala.Double,
    relay_unicast: (java.lang.String, java.lang.String) => scala.Double,
    set_tag: java.lang.String => scala.Double
  ): Typeofevapi = {
    val __obj = js.Dynamic.literal(async_relay = js.Any.fromFunction1(async_relay), close = js.Any.fromFunction0(close), relay = js.Any.fromFunction1(relay), relay_multicast = js.Any.fromFunction2(relay_multicast), relay_unicast = js.Any.fromFunction2(relay_unicast), set_tag = js.Any.fromFunction1(set_tag))
  
    __obj.asInstanceOf[Typeofevapi]
  }
}

