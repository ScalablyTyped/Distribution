package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object benchmark {
  
  @JSGlobal("KSR.benchmark")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bmLogTimer(tname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bm_log_timer")(tname.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def bmStartTimer(tname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bm_start_timer")(tname.asInstanceOf[js.Any]).asInstanceOf[Double]
}
