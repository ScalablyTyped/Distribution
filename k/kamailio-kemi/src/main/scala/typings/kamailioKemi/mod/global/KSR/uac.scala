package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uac {
  
  @JSGlobal("KSR.uac")
  @js.native
  val ^ : js.Any = js.native
  
  inline def uacAuth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uac_auth")().asInstanceOf[Double]
  
  inline def uacRegDisable(attr: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uac_reg_disable")(attr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def uacRegEnable(attr: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uac_reg_enable")(attr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def uacRegLookup(userid: String, sdst: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uac_reg_lookup")(userid.asInstanceOf[js.Any], sdst.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def uacRegRefresh(l_uuid: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uac_reg_refresh")(l_uuid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def uacRegRequestTo(userid: String, imode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uac_reg_request_to")(userid.asInstanceOf[js.Any], imode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def uacRegStatus(sruuid: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uac_reg_status")(sruuid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def uacReplaceFrom(pdsp: String, puri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uac_replace_from")(pdsp.asInstanceOf[js.Any], puri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def uacReplaceFromUri(puri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uac_replace_from_uri")(puri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def uacReplaceTo(pdsp: String, puri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uac_replace_to")(pdsp.asInstanceOf[js.Any], puri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def uacReplaceToUri(puri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uac_replace_to_uri")(puri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def uacReqSend(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uac_req_send")().asInstanceOf[Double]
  
  inline def uacRestoreFrom(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uac_restore_from")().asInstanceOf[Double]
  
  inline def uacRestoreTo(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uac_restore_to")().asInstanceOf[Double]
}
