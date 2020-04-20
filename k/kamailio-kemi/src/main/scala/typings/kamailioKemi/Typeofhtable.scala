package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhtable extends js.Object {
  def sht_has_name(sname: String, sop: String, sval: String): Double
  def sht_has_str_value(sname: String, sop: String, sval: String): Double
  def sht_iterator_end(iname: String): Double
  def sht_iterator_next(iname: String): Double
  def sht_iterator_start(iname: String, hname: String): Double
  def sht_lock(htname: String, skey: String): Double
  def sht_reset(hname: String): Double
  def sht_rm(hname: String, iname: String): Double
  def sht_rm_name(sname: String, sop: String, sval: String): Double
  def sht_rm_name_re(htname: String, rexp: String): Double
  def sht_rm_value(sname: String, sop: String, sval: String): Double
  def sht_rm_value_re(htname: String, rexp: String): Double
  def sht_setex(htname: String, itname: String, itval: Double): Double
  def sht_seti(htname: String, itname: String, itval: Double): Double
  def sht_sets(htname: String, itname: String, itval: String): Double
  def sht_setxi(htname: String, itname: String, itval: Double, exval: Double): Double
  def sht_setxs(htname: String, itname: String, itval: String, exval: Double): Double
  def sht_unlock(htname: String, skey: String): Double
}

object Typeofhtable {
  @scala.inline
  def apply(
    sht_has_name: (String, String, String) => Double,
    sht_has_str_value: (String, String, String) => Double,
    sht_iterator_end: String => Double,
    sht_iterator_next: String => Double,
    sht_iterator_start: (String, String) => Double,
    sht_lock: (String, String) => Double,
    sht_reset: String => Double,
    sht_rm: (String, String) => Double,
    sht_rm_name: (String, String, String) => Double,
    sht_rm_name_re: (String, String) => Double,
    sht_rm_value: (String, String, String) => Double,
    sht_rm_value_re: (String, String) => Double,
    sht_setex: (String, String, Double) => Double,
    sht_seti: (String, String, Double) => Double,
    sht_sets: (String, String, String) => Double,
    sht_setxi: (String, String, Double, Double) => Double,
    sht_setxs: (String, String, String, Double) => Double,
    sht_unlock: (String, String) => Double
  ): Typeofhtable = {
    val __obj = js.Dynamic.literal(sht_has_name = js.Any.fromFunction3(sht_has_name), sht_has_str_value = js.Any.fromFunction3(sht_has_str_value), sht_iterator_end = js.Any.fromFunction1(sht_iterator_end), sht_iterator_next = js.Any.fromFunction1(sht_iterator_next), sht_iterator_start = js.Any.fromFunction2(sht_iterator_start), sht_lock = js.Any.fromFunction2(sht_lock), sht_reset = js.Any.fromFunction1(sht_reset), sht_rm = js.Any.fromFunction2(sht_rm), sht_rm_name = js.Any.fromFunction3(sht_rm_name), sht_rm_name_re = js.Any.fromFunction2(sht_rm_name_re), sht_rm_value = js.Any.fromFunction3(sht_rm_value), sht_rm_value_re = js.Any.fromFunction2(sht_rm_value_re), sht_setex = js.Any.fromFunction3(sht_setex), sht_seti = js.Any.fromFunction3(sht_seti), sht_sets = js.Any.fromFunction3(sht_sets), sht_setxi = js.Any.fromFunction4(sht_setxi), sht_setxs = js.Any.fromFunction4(sht_setxs), sht_unlock = js.Any.fromFunction2(sht_unlock))
    __obj.asInstanceOf[Typeofhtable]
  }
}

