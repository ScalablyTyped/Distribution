package typings.khroma

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsLangMod {
  
  object default {
    
    @JSImport("khroma/dist/utils/lang", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def clamp(number: Double, lower: Double, upper: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(number.asInstanceOf[js.Any], lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def round(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
