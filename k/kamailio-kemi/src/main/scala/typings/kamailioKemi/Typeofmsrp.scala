package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmsrp extends js.Object {
  def cmap_lookup(): Double
  def cmap_save(): Double
  def is_reply(): Double
  def is_request(): Double
  def relay(): Double
  def relay_flags(rtflags: Double): Double
  def reply(rcode: String, rtext: String, rhdrs: String): Double
  def reply_flags(rtflags: Double): Double
  def set_dst(rtaddr: String, rfsock: String): Double
}

object Typeofmsrp {
  @scala.inline
  def apply(
    cmap_lookup: () => Double,
    cmap_save: () => Double,
    is_reply: () => Double,
    is_request: () => Double,
    relay: () => Double,
    relay_flags: Double => Double,
    reply: (String, String, String) => Double,
    reply_flags: Double => Double,
    set_dst: (String, String) => Double
  ): Typeofmsrp = {
    val __obj = js.Dynamic.literal(cmap_lookup = js.Any.fromFunction0(cmap_lookup), cmap_save = js.Any.fromFunction0(cmap_save), is_reply = js.Any.fromFunction0(is_reply), is_request = js.Any.fromFunction0(is_request), relay = js.Any.fromFunction0(relay), relay_flags = js.Any.fromFunction1(relay_flags), reply = js.Any.fromFunction3(reply), reply_flags = js.Any.fromFunction1(reply_flags), set_dst = js.Any.fromFunction2(set_dst))
    __obj.asInstanceOf[Typeofmsrp]
  }
}

