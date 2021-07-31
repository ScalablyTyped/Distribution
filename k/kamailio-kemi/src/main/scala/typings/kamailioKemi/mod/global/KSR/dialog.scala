package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialog {
  
  @JSGlobal("KSR.dialog")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dlgBye(side: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dlg_bye")(side.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def dlgDbLoadCallid(callid: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dlg_db_load_callid")(callid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def dlgDbLoadExtra(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dlg_db_load_extra")().asInstanceOf[Double]
  
  @scala.inline
  def dlgGet(sc: String, sf: String, st: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dlg_get")(sc.asInstanceOf[js.Any], sf.asInstanceOf[js.Any], st.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dlgIsflagset(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dlg_isflagset")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def dlgManage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dlg_manage")().asInstanceOf[Double]
  
  @scala.inline
  def dlgResetflag(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dlg_resetflag")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def dlgSetProperty(pval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dlg_set_property")(pval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def dlgSetTimeout(to: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dlg_set_timeout")(to.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def dlgSetTimeoutId(to: Double, he: Double, hi: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dlg_set_timeout_id")(to.asInstanceOf[js.Any], he.asInstanceOf[js.Any], hi.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def dlgSetflag(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dlg_setflag")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getProfileSize(sprofile: String, svalue: String, spv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get_profile_size")(sprofile.asInstanceOf[js.Any], svalue.asInstanceOf[js.Any], spv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getProfileSizeStatic(sprofile: String, spv: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get_profile_size_static")(sprofile.asInstanceOf[js.Any], spv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isInProfile(sprofile: String, svalue: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("is_in_profile")(sprofile.asInstanceOf[js.Any], svalue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isInProfileStatic(sprofile: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_in_profile_static")(sprofile.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isKnownDlg(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_known_dlg")().asInstanceOf[Double]
  
  @scala.inline
  def setDlgProfile(sprofile: String, svalue: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set_dlg_profile")(sprofile.asInstanceOf[js.Any], svalue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setDlgProfileStatic(sprofile: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_dlg_profile_static")(sprofile.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def unsetDlgProfile(sprofile: String, svalue: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unset_dlg_profile")(sprofile.asInstanceOf[js.Any], svalue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def unsetDlgProfileStatic(sprofile: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unset_dlg_profile_static")(sprofile.asInstanceOf[js.Any]).asInstanceOf[Double]
}
