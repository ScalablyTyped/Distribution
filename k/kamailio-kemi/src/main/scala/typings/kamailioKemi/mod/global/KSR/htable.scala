package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htable {
  
  @JSGlobal("KSR.htable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def shtHasName(sname: String, sop: String, sval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_has_name")(sname.asInstanceOf[js.Any], sop.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtHasStrValue(sname: String, sop: String, sval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_has_str_value")(sname.asInstanceOf[js.Any], sop.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtIteratorEnd(iname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sht_iterator_end")(iname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def shtIteratorNext(iname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sht_iterator_next")(iname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def shtIteratorStart(iname: String, hname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_iterator_start")(iname.asInstanceOf[js.Any], hname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtLock(htname: String, skey: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_lock")(htname.asInstanceOf[js.Any], skey.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtReset(hname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sht_reset")(hname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def shtRm(hname: String, iname: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_rm")(hname.asInstanceOf[js.Any], iname.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtRmName(sname: String, sop: String, sval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_rm_name")(sname.asInstanceOf[js.Any], sop.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtRmNameRe(htname: String, rexp: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_rm_name_re")(htname.asInstanceOf[js.Any], rexp.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtRmValue(sname: String, sop: String, sval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_rm_value")(sname.asInstanceOf[js.Any], sop.asInstanceOf[js.Any], sval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtRmValueRe(htname: String, rexp: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_rm_value_re")(htname.asInstanceOf[js.Any], rexp.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtSetex(htname: String, itname: String, itval: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_setex")(htname.asInstanceOf[js.Any], itname.asInstanceOf[js.Any], itval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtSeti(htname: String, itname: String, itval: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_seti")(htname.asInstanceOf[js.Any], itname.asInstanceOf[js.Any], itval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtSets(htname: String, itname: String, itval: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_sets")(htname.asInstanceOf[js.Any], itname.asInstanceOf[js.Any], itval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtSetxi(htname: String, itname: String, itval: Double, exval: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_setxi")(htname.asInstanceOf[js.Any], itname.asInstanceOf[js.Any], itval.asInstanceOf[js.Any], exval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtSetxs(htname: String, itname: String, itval: String, exval: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_setxs")(htname.asInstanceOf[js.Any], itname.asInstanceOf[js.Any], itval.asInstanceOf[js.Any], exval.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shtUnlock(htname: String, skey: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sht_unlock")(htname.asInstanceOf[js.Any], skey.asInstanceOf[js.Any])).asInstanceOf[Double]
}
