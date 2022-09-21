package typings.html2canvas

import typings.html2canvas.contextMod.Context
import typings.html2canvas.imageMod.CSSRadialGradientImage
import typings.html2canvas.parserMod.CSSValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixRadialGradientMod {
  
  @JSImport("html2canvas/dist/types/css/types/functions/-prefix-radial-gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prefixRadialGradient(context: Context, tokens: js.Array[CSSValue]): CSSRadialGradientImage = (^.asInstanceOf[js.Dynamic].applyDynamic("prefixRadialGradient")(context.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[CSSRadialGradientImage]
}
