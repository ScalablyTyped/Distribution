package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialplan {
  
  @JSGlobal("KSR.dialplan")
  @js.native
  val ^ : js.Any = js.native
  
  inline def dpMatch(dpid: Double, src: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dp_match")(dpid.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def dpReplace(dpid: Double, src: String, dst: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dp_replace")(dpid.asInstanceOf[js.Any], src.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Double]
}
