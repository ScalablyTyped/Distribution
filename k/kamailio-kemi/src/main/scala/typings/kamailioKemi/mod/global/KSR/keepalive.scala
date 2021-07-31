package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keepalive {
  
  @JSGlobal("KSR.keepalive")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isAlive(dest: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_alive")(dest.asInstanceOf[js.Any]).asInstanceOf[Double]
}
