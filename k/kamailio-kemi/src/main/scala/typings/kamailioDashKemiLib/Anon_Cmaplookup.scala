package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cmaplookup extends js.Object {
  def cmap_lookup(): scala.Double
  def cmap_save(): scala.Double
  def is_reply(): scala.Double
  def is_request(): scala.Double
  def relay(): scala.Double
  def relay_flags(rtflags: scala.Double): scala.Double
  def reply(rcode: java.lang.String, rtext: java.lang.String, rhdrs: java.lang.String): scala.Double
  def reply_flags(rtflags: scala.Double): scala.Double
  def set_dst(rtaddr: java.lang.String, rfsock: java.lang.String): scala.Double
}

object Anon_Cmaplookup {
  @scala.inline
  def apply(
    cmap_lookup: () => scala.Double,
    cmap_save: () => scala.Double,
    is_reply: () => scala.Double,
    is_request: () => scala.Double,
    relay: () => scala.Double,
    relay_flags: scala.Double => scala.Double,
    reply: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    reply_flags: scala.Double => scala.Double,
    set_dst: (java.lang.String, java.lang.String) => scala.Double
  ): Anon_Cmaplookup = {
    val __obj = js.Dynamic.literal(cmap_lookup = js.Any.fromFunction0(cmap_lookup), cmap_save = js.Any.fromFunction0(cmap_save), is_reply = js.Any.fromFunction0(is_reply), is_request = js.Any.fromFunction0(is_request), relay = js.Any.fromFunction0(relay), relay_flags = js.Any.fromFunction1(relay_flags), reply = js.Any.fromFunction3(reply), reply_flags = js.Any.fromFunction1(reply_flags), set_dst = js.Any.fromFunction2(set_dst))
  
    __obj.asInstanceOf[Anon_Cmaplookup]
  }
}

