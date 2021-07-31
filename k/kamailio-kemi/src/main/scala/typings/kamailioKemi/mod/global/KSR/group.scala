package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object group {
  
  @JSGlobal("KSR.group")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isUserIn(uri: String, grp: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("is_user_in")(uri.asInstanceOf[js.Any], grp.asInstanceOf[js.Any])).asInstanceOf[Double]
}
