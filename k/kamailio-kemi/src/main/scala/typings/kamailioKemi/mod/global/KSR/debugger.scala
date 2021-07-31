package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Special declaration of debugger and enum to avoid using reserved words
object debugger {
  
  @JSGlobal("KSR._debugger")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dbgPvDump(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dbg_pv_dump")().asInstanceOf[Double]
  
  @scala.inline
  def dbgPvDumpEx(mask: Double, level: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dbg_pv_dump_ex")(mask.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Double]
}
