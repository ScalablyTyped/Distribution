package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appLua {
  
  @JSGlobal("KSR.app_lua")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dofile(script: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dofile")(script.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def dostring(script: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dostring")(script.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def run(func: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(func.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def runP1(func: String, p1: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("run_p1")(func.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def runP2(func: String, p1: String, p2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("run_p2")(func.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def runP3(func: String, p1: String, p2: String, p3: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("run_p3")(func.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def runstring(script: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("runstring")(script.asInstanceOf[js.Any]).asInstanceOf[Double]
}
