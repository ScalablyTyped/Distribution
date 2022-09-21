package typings.html2canvas

import typings.html2canvas.cssMod.CSSParsedCounterDeclaration
import typings.html2canvas.listStyleTypeMod.LIST_STYLE_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object counterMod {
  
  @JSImport("html2canvas/dist/types/css/types/functions/counter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/css/types/functions/counter", "CounterState")
  @js.native
  open class CounterState () extends StObject {
    
    /* private */ val counters: Any = js.native
    
    def getCounterValue(name: String): Double = js.native
    
    def getCounterValues(name: String): js.Array[Double] = js.native
    
    def parse(style: CSSParsedCounterDeclaration): js.Array[String] = js.native
    
    def pop(counters: js.Array[String]): Unit = js.native
  }
  
  inline def createCounterText(value: Double, `type`: LIST_STYLE_TYPE, appendSuffix: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createCounterText")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], appendSuffix.asInstanceOf[js.Any])).asInstanceOf[String]
}
