package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appPython {
  
  @JSGlobal("KSR.app_python")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def exec(method: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(method.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def execP1(method: String, p1: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("exec_p1")(method.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[Double]
}
