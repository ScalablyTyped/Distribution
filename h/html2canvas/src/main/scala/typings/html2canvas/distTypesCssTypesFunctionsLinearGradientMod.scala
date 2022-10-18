package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesCssSyntaxParserMod.CSSValue
import typings.html2canvas.distTypesCssTypesImageMod.CSSLinearGradientImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssTypesFunctionsLinearGradientMod {
  
  @JSImport("html2canvas/dist/types/css/types/functions/linear-gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linearGradient(context: Context, tokens: js.Array[CSSValue]): CSSLinearGradientImage = (^.asInstanceOf[js.Dynamic].applyDynamic("linearGradient")(context.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[CSSLinearGradientImage]
}
