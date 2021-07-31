package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mtree {
  
  @JSGlobal("KSR.mtree")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mtMatch(tname: String, tomatch: String, mval: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mt_match")(tname.asInstanceOf[js.Any], tomatch.asInstanceOf[js.Any], mval.asInstanceOf[js.Any])).asInstanceOf[Double]
}
