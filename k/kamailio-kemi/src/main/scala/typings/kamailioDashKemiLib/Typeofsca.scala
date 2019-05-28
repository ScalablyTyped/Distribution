package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsca extends js.Object {
  def call_info_update(update_mask: scala.Double, uri_to: java.lang.String, uri_from: java.lang.String): scala.Double
  def call_info_update_default(): scala.Double
  def call_info_update_mask(umask: scala.Double): scala.Double
  def call_info_update_turi(umask: scala.Double, sto: java.lang.String): scala.Double
  def handle_subscribe(): scala.Double
}

object Typeofsca {
  @scala.inline
  def apply(
    call_info_update: (scala.Double, java.lang.String, java.lang.String) => scala.Double,
    call_info_update_default: () => scala.Double,
    call_info_update_mask: scala.Double => scala.Double,
    call_info_update_turi: (scala.Double, java.lang.String) => scala.Double,
    handle_subscribe: () => scala.Double
  ): Typeofsca = {
    val __obj = js.Dynamic.literal(call_info_update = js.Any.fromFunction3(call_info_update), call_info_update_default = js.Any.fromFunction0(call_info_update_default), call_info_update_mask = js.Any.fromFunction1(call_info_update_mask), call_info_update_turi = js.Any.fromFunction2(call_info_update_turi), handle_subscribe = js.Any.fromFunction0(handle_subscribe))
  
    __obj.asInstanceOf[Typeofsca]
  }
}

