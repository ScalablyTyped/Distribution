package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsca extends js.Object {
  def call_info_update(update_mask: Double, uri_to: String, uri_from: String): Double
  def call_info_update_default(): Double
  def call_info_update_mask(umask: Double): Double
  def call_info_update_turi(umask: Double, sto: String): Double
  def handle_subscribe(): Double
}

object Typeofsca {
  @scala.inline
  def apply(
    call_info_update: (Double, String, String) => Double,
    call_info_update_default: () => Double,
    call_info_update_mask: Double => Double,
    call_info_update_turi: (Double, String) => Double,
    handle_subscribe: () => Double
  ): Typeofsca = {
    val __obj = js.Dynamic.literal(call_info_update = js.Any.fromFunction3(call_info_update), call_info_update_default = js.Any.fromFunction0(call_info_update_default), call_info_update_mask = js.Any.fromFunction1(call_info_update_mask), call_info_update_turi = js.Any.fromFunction2(call_info_update_turi), handle_subscribe = js.Any.fromFunction0(handle_subscribe))
  
    __obj.asInstanceOf[Typeofsca]
  }
}

