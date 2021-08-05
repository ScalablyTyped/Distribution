package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdt {
  
  @JSGlobal("KSR.pdt")
  @js.native
  val ^ : js.Any = js.native
  
  inline def pdTranslate(sd: String, md: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pd_translate")(sd.asInstanceOf[js.Any], md.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def pprefix2domain(m: Double, s: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pprefix2domain")(m.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Double]
}
