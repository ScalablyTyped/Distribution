package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pv {
  
  // Return the value of pseudo-variable `pvname`.
  // The returned value can be string or integer
  @JSGlobal("KSR.pv.get")
  @js.native
  def get(pvname: String): String | Double | Null = js.native
  
  // Same as get(), but returns empty string on null
  @JSGlobal("KSR.pv.gete")
  @js.native
  def gete(pvname: String): String | Double = js.native
  
  // Same as get(), but returns `vn` on null
  @JSGlobal("KSR.pv.getvn")
  @js.native
  def getvn(pvname: String, vn: Double): String | Double = js.native
  
  // Return the value of pseudo-variable pvname if it is different than $null or
  // the parameter vs if the variable is having the $null value.
  @JSGlobal("KSR.pv.getvs")
  @js.native
  def getvs(pvname: String, vn: Double): String | Double = js.native
  
  // Return the value of pseudo-variable pvname if it is different than $null or the string <<null>> if the
  // variable is having the $null value. This should be used instead of KSR.pv.get(...) in the scripting
  // languages that throw and error when attempting to print a NULL (or NIL) value.
  @JSGlobal("KSR.pv.getw")
  @js.native
  def getw(pvname: String): String | Double = js.native
  
  // Return true if pseudo-variable pvname is $null.
  @JSGlobal("KSR.pv.is_null")
  @js.native
  def isNull(pvname: String): Boolean = js.native
  
  // Set the value of pseudo-variable pvname to integer value provided by parameter val.
  @JSGlobal("KSR.pv.seti")
  @js.native
  def seti(pvname: String, `val`: Double): Unit = js.native
  
  // Set the value of pseudo-variable pvname to string value provided by parameter val.
  @JSGlobal("KSR.pv.sets")
  @js.native
  def sets(pvname: String, `val`: String): Unit = js.native
  
  // Set the value of pseudo-variable pvname to $null.
  @JSGlobal("KSR.pv.unset")
  @js.native
  def unset(pvname: String): Unit = js.native
}
