package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanity {
  
  @JSGlobal("KSR.sanity")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sanityCheck(mflags: Double, uflags: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sanity_check")(mflags.asInstanceOf[js.Any], uflags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sanityCheckDefaults(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sanity_check_defaults")().asInstanceOf[Double]
  
  inline def sanityReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sanity_reply")().asInstanceOf[Double]
}
