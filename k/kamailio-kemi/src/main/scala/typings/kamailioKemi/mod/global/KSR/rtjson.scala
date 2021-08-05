package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rtjson {
  
  @JSGlobal("KSR.rtjson")
  @js.native
  val ^ : js.Any = js.native
  
  inline def initRoutes(rdoc: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("init_routes")(rdoc.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nextRoute(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("next_route")().asInstanceOf[Double]
  
  inline def pushRoutes(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("push_routes")().asInstanceOf[Double]
  
  inline def updateBranch(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("update_branch")().asInstanceOf[Double]
}
