package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pv {
  
  @JSGlobal("KSR.pv")
  @js.native
  val ^ : js.Any = js.native
  
  // Return the value of pseudo-variable `pvname`.
  // The returned value can be string or integer
  inline def get(pvname: String): String | Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(pvname.asInstanceOf[js.Any]).asInstanceOf[String | Double | Null]
  
  // Same as get(), but returns empty string on null
  inline def gete(pvname: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("gete")(pvname.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  // Same as get(), but returns `vn` on null
  inline def getvn(pvname: String, vn: Double): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getvn")(pvname.asInstanceOf[js.Any], vn.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  // Return the value of pseudo-variable pvname if it is different than $null or
  // the parameter vs if the variable is having the $null value.
  inline def getvs(pvname: String, vn: Double): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getvs")(pvname.asInstanceOf[js.Any], vn.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  // Return the value of pseudo-variable pvname if it is different than $null or the string <<null>> if the
  // variable is having the $null value. This should be used instead of KSR.pv.get(...) in the scripting
  // languages that throw and error when attempting to print a NULL (or NIL) value.
  inline def getw(pvname: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getw")(pvname.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  // Return true if pseudo-variable pvname is $null.
  inline def isNull(pvname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_null")(pvname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  // Set the value of pseudo-variable pvname to integer value provided by parameter val.
  inline def seti(pvname: String, `val`: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("seti")(pvname.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // Set the value of pseudo-variable pvname to string value provided by parameter val.
  inline def sets(pvname: String, `val`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sets")(pvname.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // Set the value of pseudo-variable pvname to $null.
  inline def unset(pvname: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unset")(pvname.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
