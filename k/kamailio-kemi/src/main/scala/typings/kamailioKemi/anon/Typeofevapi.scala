package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofevapi extends js.Object {
  def async_relay(sdata: String): Double
  def close(): Double
  def relay(sdata: String): Double
  def relay_multicast(sdata: String, stag: String): Double
  def relay_unicast(sdata: String, stag: String): Double
  def set_tag(stag: String): Double
}

object Typeofevapi {
  @scala.inline
  def apply(
    async_relay: String => Double,
    close: () => Double,
    relay: String => Double,
    relay_multicast: (String, String) => Double,
    relay_unicast: (String, String) => Double,
    set_tag: String => Double
  ): Typeofevapi = {
    val __obj = js.Dynamic.literal(async_relay = js.Any.fromFunction1(async_relay), close = js.Any.fromFunction0(close), relay = js.Any.fromFunction1(relay), relay_multicast = js.Any.fromFunction2(relay_multicast), relay_unicast = js.Any.fromFunction2(relay_unicast), set_tag = js.Any.fromFunction1(set_tag))
    __obj.asInstanceOf[Typeofevapi]
  }
}

