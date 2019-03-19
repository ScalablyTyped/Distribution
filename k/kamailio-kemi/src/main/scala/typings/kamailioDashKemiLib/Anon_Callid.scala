package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callid extends js.Object {
  def dlg_bye(side: java.lang.String): scala.Double
  def dlg_db_load_callid(callid: java.lang.String): scala.Double
  def dlg_db_load_extra(): scala.Double
  def dlg_get(sc: java.lang.String, sf: java.lang.String, st: java.lang.String): scala.Double
  def dlg_isflagset(`val`: scala.Double): scala.Double
  def dlg_manage(): scala.Double
  def dlg_resetflag(`val`: scala.Double): scala.Double
  def dlg_set_property(pval: java.lang.String): scala.Double
  def dlg_set_timeout(to: scala.Double): scala.Double
  def dlg_set_timeout_id(to: scala.Double, he: scala.Double, hi: scala.Double): scala.Double
  def dlg_setflag(`val`: scala.Double): scala.Double
  def get_profile_size(sprofile: java.lang.String, svalue: java.lang.String, spv: java.lang.String): scala.Double
  def get_profile_size_static(sprofile: java.lang.String, spv: java.lang.String): scala.Double
  def is_in_profile(sprofile: java.lang.String, svalue: java.lang.String): scala.Double
  def is_in_profile_static(sprofile: java.lang.String): scala.Double
  def is_known_dlg(): scala.Double
  def set_dlg_profile(sprofile: java.lang.String, svalue: java.lang.String): scala.Double
  def set_dlg_profile_static(sprofile: java.lang.String): scala.Double
  def unset_dlg_profile(sprofile: java.lang.String, svalue: java.lang.String): scala.Double
  def unset_dlg_profile_static(sprofile: java.lang.String): scala.Double
}

object Anon_Callid {
  @scala.inline
  def apply(
    dlg_bye: java.lang.String => scala.Double,
    dlg_db_load_callid: java.lang.String => scala.Double,
    dlg_db_load_extra: () => scala.Double,
    dlg_get: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    dlg_isflagset: scala.Double => scala.Double,
    dlg_manage: () => scala.Double,
    dlg_resetflag: scala.Double => scala.Double,
    dlg_set_property: java.lang.String => scala.Double,
    dlg_set_timeout: scala.Double => scala.Double,
    dlg_set_timeout_id: (scala.Double, scala.Double, scala.Double) => scala.Double,
    dlg_setflag: scala.Double => scala.Double,
    get_profile_size: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    get_profile_size_static: (java.lang.String, java.lang.String) => scala.Double,
    is_in_profile: (java.lang.String, java.lang.String) => scala.Double,
    is_in_profile_static: java.lang.String => scala.Double,
    is_known_dlg: () => scala.Double,
    set_dlg_profile: (java.lang.String, java.lang.String) => scala.Double,
    set_dlg_profile_static: java.lang.String => scala.Double,
    unset_dlg_profile: (java.lang.String, java.lang.String) => scala.Double,
    unset_dlg_profile_static: java.lang.String => scala.Double
  ): Anon_Callid = {
    val __obj = js.Dynamic.literal(dlg_bye = js.Any.fromFunction1(dlg_bye), dlg_db_load_callid = js.Any.fromFunction1(dlg_db_load_callid), dlg_db_load_extra = js.Any.fromFunction0(dlg_db_load_extra), dlg_get = js.Any.fromFunction3(dlg_get), dlg_isflagset = js.Any.fromFunction1(dlg_isflagset), dlg_manage = js.Any.fromFunction0(dlg_manage), dlg_resetflag = js.Any.fromFunction1(dlg_resetflag), dlg_set_property = js.Any.fromFunction1(dlg_set_property), dlg_set_timeout = js.Any.fromFunction1(dlg_set_timeout), dlg_set_timeout_id = js.Any.fromFunction3(dlg_set_timeout_id), dlg_setflag = js.Any.fromFunction1(dlg_setflag), get_profile_size = js.Any.fromFunction3(get_profile_size), get_profile_size_static = js.Any.fromFunction2(get_profile_size_static), is_in_profile = js.Any.fromFunction2(is_in_profile), is_in_profile_static = js.Any.fromFunction1(is_in_profile_static), is_known_dlg = js.Any.fromFunction0(is_known_dlg), set_dlg_profile = js.Any.fromFunction2(set_dlg_profile), set_dlg_profile_static = js.Any.fromFunction1(set_dlg_profile_static), unset_dlg_profile = js.Any.fromFunction2(unset_dlg_profile), unset_dlg_profile_static = js.Any.fromFunction1(unset_dlg_profile_static))
  
    __obj.asInstanceOf[Anon_Callid]
  }
}

