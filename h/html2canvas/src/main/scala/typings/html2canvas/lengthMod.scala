package typings.html2canvas

import typings.html2canvas.html2canvasNumbers.`16`
import typings.html2canvas.html2canvasNumbers.`17`
import typings.html2canvas.parserMod.CSSValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lengthMod {
  
  @JSImport("html2canvas/dist/types/css/types/length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLength(token: CSSValue): /* is html2canvas.html2canvas/dist/types/css/types/length.Length */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(token.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/css/types/length.Length */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.tokenizerMod.DimensionToken
    - typings.html2canvas.tokenizerMod.NumberValueToken
  */
  trait Length extends StObject
  object Length {
    
    inline def DimensionToken(flags: Double, number: Double, unit: String): typings.html2canvas.tokenizerMod.DimensionToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(15)
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.DimensionToken]
    }
    
    inline def NumberValueToken(flags: Double, number: Double, `type`: `16` | `17`): typings.html2canvas.tokenizerMod.NumberValueToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.html2canvas.tokenizerMod.NumberValueToken]
    }
  }
}
