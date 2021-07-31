package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxfwd {
  
  @JSGlobal("KSR.maxfwd")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isMaxfwdLt(limit: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_maxfwd_lt")(limit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def processMaxfwd(limit: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("process_maxfwd")(limit.asInstanceOf[js.Any]).asInstanceOf[Double]
}
