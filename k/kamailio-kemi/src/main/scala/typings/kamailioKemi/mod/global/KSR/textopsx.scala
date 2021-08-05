package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textopsx {
  
  @JSGlobal("KSR.textopsx")
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendHfValue(hexp: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("append_hf_value")(hexp.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def assignHfValue(hexp: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("assign_hf_value")(hexp.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def assignHfValue2(hexp: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("assign_hf_value2")(hexp.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def changeReplyStatus(code: Double, reason: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("change_reply_status")(code.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def excludeHfValue(hexp: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("exclude_hf_value")(hexp.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fnmatch(`val`: String, `match`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fnmatch")(`val`.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fnmatchEx(`val`: String, `match`: String, flags: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fnmatch_ex")(`val`.asInstanceOf[js.Any], `match`.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hfValueExists(hexp: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hf_value_exists")(hexp.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def includeHfValue(hexp: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("include_hf_value")(hexp.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def insertHfValue(hexp: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("insert_hf_value")(hexp.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def keepHf(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("keep_hf")().asInstanceOf[Double]
  
  inline def keepHfRe(sre: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("keep_hf_re")(sre.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def msgApplyChanges(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("msg_apply_changes")().asInstanceOf[Double]
  
  inline def msgSetBuffer(obuf: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("msg_set_buffer")(obuf.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeBody(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("remove_body")().asInstanceOf[Double]
  
  inline def removeHfValue(hexp: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("remove_hf_value")(hexp.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeHfValue2(hexp: String, `val`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("remove_hf_value2")(hexp.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Double]
}
