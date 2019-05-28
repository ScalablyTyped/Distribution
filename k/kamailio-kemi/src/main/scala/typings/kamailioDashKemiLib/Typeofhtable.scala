package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhtable extends js.Object {
  def sht_has_name(sname: java.lang.String, sop: java.lang.String, sval: java.lang.String): scala.Double
  def sht_has_str_value(sname: java.lang.String, sop: java.lang.String, sval: java.lang.String): scala.Double
  def sht_iterator_end(iname: java.lang.String): scala.Double
  def sht_iterator_next(iname: java.lang.String): scala.Double
  def sht_iterator_start(iname: java.lang.String, hname: java.lang.String): scala.Double
  def sht_lock(htname: java.lang.String, skey: java.lang.String): scala.Double
  def sht_reset(hname: java.lang.String): scala.Double
  def sht_rm(hname: java.lang.String, iname: java.lang.String): scala.Double
  def sht_rm_name(sname: java.lang.String, sop: java.lang.String, sval: java.lang.String): scala.Double
  def sht_rm_name_re(htname: java.lang.String, rexp: java.lang.String): scala.Double
  def sht_rm_value(sname: java.lang.String, sop: java.lang.String, sval: java.lang.String): scala.Double
  def sht_rm_value_re(htname: java.lang.String, rexp: java.lang.String): scala.Double
  def sht_setex(htname: java.lang.String, itname: java.lang.String, itval: scala.Double): scala.Double
  def sht_seti(htname: java.lang.String, itname: java.lang.String, itval: scala.Double): scala.Double
  def sht_sets(htname: java.lang.String, itname: java.lang.String, itval: java.lang.String): scala.Double
  def sht_setxi(htname: java.lang.String, itname: java.lang.String, itval: scala.Double, exval: scala.Double): scala.Double
  def sht_setxs(htname: java.lang.String, itname: java.lang.String, itval: java.lang.String, exval: scala.Double): scala.Double
  def sht_unlock(htname: java.lang.String, skey: java.lang.String): scala.Double
}

object Typeofhtable {
  @scala.inline
  def apply(
    sht_has_name: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    sht_has_str_value: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    sht_iterator_end: java.lang.String => scala.Double,
    sht_iterator_next: java.lang.String => scala.Double,
    sht_iterator_start: (java.lang.String, java.lang.String) => scala.Double,
    sht_lock: (java.lang.String, java.lang.String) => scala.Double,
    sht_reset: java.lang.String => scala.Double,
    sht_rm: (java.lang.String, java.lang.String) => scala.Double,
    sht_rm_name: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    sht_rm_name_re: (java.lang.String, java.lang.String) => scala.Double,
    sht_rm_value: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    sht_rm_value_re: (java.lang.String, java.lang.String) => scala.Double,
    sht_setex: (java.lang.String, java.lang.String, scala.Double) => scala.Double,
    sht_seti: (java.lang.String, java.lang.String, scala.Double) => scala.Double,
    sht_sets: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    sht_setxi: (java.lang.String, java.lang.String, scala.Double, scala.Double) => scala.Double,
    sht_setxs: (java.lang.String, java.lang.String, java.lang.String, scala.Double) => scala.Double,
    sht_unlock: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofhtable = {
    val __obj = js.Dynamic.literal(sht_has_name = js.Any.fromFunction3(sht_has_name), sht_has_str_value = js.Any.fromFunction3(sht_has_str_value), sht_iterator_end = js.Any.fromFunction1(sht_iterator_end), sht_iterator_next = js.Any.fromFunction1(sht_iterator_next), sht_iterator_start = js.Any.fromFunction2(sht_iterator_start), sht_lock = js.Any.fromFunction2(sht_lock), sht_reset = js.Any.fromFunction1(sht_reset), sht_rm = js.Any.fromFunction2(sht_rm), sht_rm_name = js.Any.fromFunction3(sht_rm_name), sht_rm_name_re = js.Any.fromFunction2(sht_rm_name_re), sht_rm_value = js.Any.fromFunction3(sht_rm_value), sht_rm_value_re = js.Any.fromFunction2(sht_rm_value_re), sht_setex = js.Any.fromFunction3(sht_setex), sht_seti = js.Any.fromFunction3(sht_seti), sht_sets = js.Any.fromFunction3(sht_sets), sht_setxi = js.Any.fromFunction4(sht_setxi), sht_setxs = js.Any.fromFunction4(sht_setxs), sht_unlock = js.Any.fromFunction2(sht_unlock))
  
    __obj.asInstanceOf[Typeofhtable]
  }
}

