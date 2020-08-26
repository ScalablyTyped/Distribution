package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdialog extends js.Object {
  def dlg_bye(side: String): Double = js.native
  def dlg_db_load_callid(callid: String): Double = js.native
  def dlg_db_load_extra(): Double = js.native
  def dlg_get(sc: String, sf: String, st: String): Double = js.native
  def dlg_isflagset(`val`: Double): Double = js.native
  def dlg_manage(): Double = js.native
  def dlg_resetflag(`val`: Double): Double = js.native
  def dlg_set_property(pval: String): Double = js.native
  def dlg_set_timeout(to: Double): Double = js.native
  def dlg_set_timeout_id(to: Double, he: Double, hi: Double): Double = js.native
  def dlg_setflag(`val`: Double): Double = js.native
  def get_profile_size(sprofile: String, svalue: String, spv: String): Double = js.native
  def get_profile_size_static(sprofile: String, spv: String): Double = js.native
  def is_in_profile(sprofile: String, svalue: String): Double = js.native
  def is_in_profile_static(sprofile: String): Double = js.native
  def is_known_dlg(): Double = js.native
  def set_dlg_profile(sprofile: String, svalue: String): Double = js.native
  def set_dlg_profile_static(sprofile: String): Double = js.native
  def unset_dlg_profile(sprofile: String, svalue: String): Double = js.native
  def unset_dlg_profile_static(sprofile: String): Double = js.native
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
  @scala.inline
  implicit class TypeofdialogOps[Self <: Typeofdialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDlg_bye(value: String => Double): Self = this.set("dlg_bye", js.Any.fromFunction1(value))
    @scala.inline
    def setDlg_db_load_callid(value: String => Double): Self = this.set("dlg_db_load_callid", js.Any.fromFunction1(value))
    @scala.inline
    def setDlg_db_load_extra(value: () => Double): Self = this.set("dlg_db_load_extra", js.Any.fromFunction0(value))
    @scala.inline
    def setDlg_get(value: (String, String, String) => Double): Self = this.set("dlg_get", js.Any.fromFunction3(value))
    @scala.inline
    def setDlg_isflagset(value: Double => Double): Self = this.set("dlg_isflagset", js.Any.fromFunction1(value))
    @scala.inline
    def setDlg_manage(value: () => Double): Self = this.set("dlg_manage", js.Any.fromFunction0(value))
    @scala.inline
    def setDlg_resetflag(value: Double => Double): Self = this.set("dlg_resetflag", js.Any.fromFunction1(value))
    @scala.inline
    def setDlg_set_property(value: String => Double): Self = this.set("dlg_set_property", js.Any.fromFunction1(value))
    @scala.inline
    def setDlg_set_timeout(value: Double => Double): Self = this.set("dlg_set_timeout", js.Any.fromFunction1(value))
    @scala.inline
    def setDlg_set_timeout_id(value: (Double, Double, Double) => Double): Self = this.set("dlg_set_timeout_id", js.Any.fromFunction3(value))
    @scala.inline
    def setDlg_setflag(value: Double => Double): Self = this.set("dlg_setflag", js.Any.fromFunction1(value))
    @scala.inline
    def setGet_profile_size(value: (String, String, String) => Double): Self = this.set("get_profile_size", js.Any.fromFunction3(value))
    @scala.inline
    def setGet_profile_size_static(value: (String, String) => Double): Self = this.set("get_profile_size_static", js.Any.fromFunction2(value))
    @scala.inline
    def setIs_in_profile(value: (String, String) => Double): Self = this.set("is_in_profile", js.Any.fromFunction2(value))
    @scala.inline
    def setIs_in_profile_static(value: String => Double): Self = this.set("is_in_profile_static", js.Any.fromFunction1(value))
    @scala.inline
    def setIs_known_dlg(value: () => Double): Self = this.set("is_known_dlg", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_dlg_profile(value: (String, String) => Double): Self = this.set("set_dlg_profile", js.Any.fromFunction2(value))
    @scala.inline
    def setSet_dlg_profile_static(value: String => Double): Self = this.set("set_dlg_profile_static", js.Any.fromFunction1(value))
    @scala.inline
    def setUnset_dlg_profile(value: (String, String) => Double): Self = this.set("unset_dlg_profile", js.Any.fromFunction2(value))
    @scala.inline
    def setUnset_dlg_profile_static(value: String => Double): Self = this.set("unset_dlg_profile_static", js.Any.fromFunction1(value))
  }
  
}

