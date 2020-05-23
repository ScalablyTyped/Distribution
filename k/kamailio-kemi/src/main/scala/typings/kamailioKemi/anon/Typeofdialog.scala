package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdialog extends js.Object {
  def dlg_bye(side: String): Double
  def dlg_db_load_callid(callid: String): Double
  def dlg_db_load_extra(): Double
  def dlg_get(sc: String, sf: String, st: String): Double
  def dlg_isflagset(`val`: Double): Double
  def dlg_manage(): Double
  def dlg_resetflag(`val`: Double): Double
  def dlg_set_property(pval: String): Double
  def dlg_set_timeout(to: Double): Double
  def dlg_set_timeout_id(to: Double, he: Double, hi: Double): Double
  def dlg_setflag(`val`: Double): Double
  def get_profile_size(sprofile: String, svalue: String, spv: String): Double
  def get_profile_size_static(sprofile: String, spv: String): Double
  def is_in_profile(sprofile: String, svalue: String): Double
  def is_in_profile_static(sprofile: String): Double
  def is_known_dlg(): Double
  def set_dlg_profile(sprofile: String, svalue: String): Double
  def set_dlg_profile_static(sprofile: String): Double
  def unset_dlg_profile(sprofile: String, svalue: String): Double
  def unset_dlg_profile_static(sprofile: String): Double
}

object Typeofdialog {
  @scala.inline
  def apply(
    dlg_bye: String => Double,
    dlg_db_load_callid: String => Double,
    dlg_db_load_extra: () => Double,
    dlg_get: (String, String, String) => Double,
    dlg_isflagset: Double => Double,
    dlg_manage: () => Double,
    dlg_resetflag: Double => Double,
    dlg_set_property: String => Double,
    dlg_set_timeout: Double => Double,
    dlg_set_timeout_id: (Double, Double, Double) => Double,
    dlg_setflag: Double => Double,
    get_profile_size: (String, String, String) => Double,
    get_profile_size_static: (String, String) => Double,
    is_in_profile: (String, String) => Double,
    is_in_profile_static: String => Double,
    is_known_dlg: () => Double,
    set_dlg_profile: (String, String) => Double,
    set_dlg_profile_static: String => Double,
    unset_dlg_profile: (String, String) => Double,
    unset_dlg_profile_static: String => Double
  ): Typeofdialog = {
    val __obj = js.Dynamic.literal(dlg_bye = js.Any.fromFunction1(dlg_bye), dlg_db_load_callid = js.Any.fromFunction1(dlg_db_load_callid), dlg_db_load_extra = js.Any.fromFunction0(dlg_db_load_extra), dlg_get = js.Any.fromFunction3(dlg_get), dlg_isflagset = js.Any.fromFunction1(dlg_isflagset), dlg_manage = js.Any.fromFunction0(dlg_manage), dlg_resetflag = js.Any.fromFunction1(dlg_resetflag), dlg_set_property = js.Any.fromFunction1(dlg_set_property), dlg_set_timeout = js.Any.fromFunction1(dlg_set_timeout), dlg_set_timeout_id = js.Any.fromFunction3(dlg_set_timeout_id), dlg_setflag = js.Any.fromFunction1(dlg_setflag), get_profile_size = js.Any.fromFunction3(get_profile_size), get_profile_size_static = js.Any.fromFunction2(get_profile_size_static), is_in_profile = js.Any.fromFunction2(is_in_profile), is_in_profile_static = js.Any.fromFunction1(is_in_profile_static), is_known_dlg = js.Any.fromFunction0(is_known_dlg), set_dlg_profile = js.Any.fromFunction2(set_dlg_profile), set_dlg_profile_static = js.Any.fromFunction1(set_dlg_profile_static), unset_dlg_profile = js.Any.fromFunction2(unset_dlg_profile), unset_dlg_profile_static = js.Any.fromFunction1(unset_dlg_profile_static))
    __obj.asInstanceOf[Typeofdialog]
  }
}

