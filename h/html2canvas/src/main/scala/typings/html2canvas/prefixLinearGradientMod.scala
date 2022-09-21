package typings.html2canvas

import typings.html2canvas.contextMod.Context
import typings.html2canvas.imageMod.CSSLinearGradientImage
import typings.html2canvas.parserMod.CSSValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixLinearGradientMod {
  
  @JSImport("html2canvas/dist/types/css/types/functions/-prefix-linear-gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prefixLinearGradient(context: Context, tokens: js.Array[CSSValue]): CSSLinearGradientImage = (^.asInstanceOf[js.Dynamic].applyDynamic("prefixLinearGradient")(context.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[CSSLinearGradientImage]
}
