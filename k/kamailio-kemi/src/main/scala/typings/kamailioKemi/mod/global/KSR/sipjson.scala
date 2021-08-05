package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sipjson {
  
  @JSGlobal("KSR.sipjson")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sjSerialize(smode: String, pvn: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sj_serialize")(smode.asInstanceOf[js.Any], pvn.asInstanceOf[js.Any])).asInstanceOf[Double]
}
