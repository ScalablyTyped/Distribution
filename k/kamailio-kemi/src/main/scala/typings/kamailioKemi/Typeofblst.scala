package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofblst extends js.Object {
  def blst_add(t: Double): Double
  def blst_add_default(): Double
  def blst_add_retry_after(t_min: Double, t_max: Double): Double
  def blst_clear_ignore(mask: Double): Double
  def blst_clear_ignore_all(): Double
  def blst_del(): Double
  def blst_is_blacklisted(): Double
  def blst_rpl_clear_ignore(mask: Double): Double
  def blst_rpl_clear_ignore_all(): Double
  def blst_rpl_set_ignore(mask: Double): Double
  def blst_rpl_set_ignore_all(): Double
  def blst_set_ignore(mask: Double): Double
  def blst_set_ignore_all(): Double
}

object Typeofblst {
  @scala.inline
  def apply(
    blst_add: Double => Double,
    blst_add_default: () => Double,
    blst_add_retry_after: (Double, Double) => Double,
    blst_clear_ignore: Double => Double,
    blst_clear_ignore_all: () => Double,
    blst_del: () => Double,
    blst_is_blacklisted: () => Double,
    blst_rpl_clear_ignore: Double => Double,
    blst_rpl_clear_ignore_all: () => Double,
    blst_rpl_set_ignore: Double => Double,
    blst_rpl_set_ignore_all: () => Double,
    blst_set_ignore: Double => Double,
    blst_set_ignore_all: () => Double
  ): Typeofblst = {
    val __obj = js.Dynamic.literal(blst_add = js.Any.fromFunction1(blst_add), blst_add_default = js.Any.fromFunction0(blst_add_default), blst_add_retry_after = js.Any.fromFunction2(blst_add_retry_after), blst_clear_ignore = js.Any.fromFunction1(blst_clear_ignore), blst_clear_ignore_all = js.Any.fromFunction0(blst_clear_ignore_all), blst_del = js.Any.fromFunction0(blst_del), blst_is_blacklisted = js.Any.fromFunction0(blst_is_blacklisted), blst_rpl_clear_ignore = js.Any.fromFunction1(blst_rpl_clear_ignore), blst_rpl_clear_ignore_all = js.Any.fromFunction0(blst_rpl_clear_ignore_all), blst_rpl_set_ignore = js.Any.fromFunction1(blst_rpl_set_ignore), blst_rpl_set_ignore_all = js.Any.fromFunction0(blst_rpl_set_ignore_all), blst_set_ignore = js.Any.fromFunction1(blst_set_ignore), blst_set_ignore_all = js.Any.fromFunction0(blst_set_ignore_all))
  
    __obj.asInstanceOf[Typeofblst]
  }
}

