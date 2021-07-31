package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object async {
  
  @JSGlobal("KSR.async")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def route(rn: String, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("route")(rn.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def taskRoute(rn: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("task_route")(rn.asInstanceOf[js.Any]).asInstanceOf[Double]
}
