package typings.html2canvas

import typings.html2canvas.contextMod.Context
import typings.html2canvas.imageMod.CSSLinearGradientImage
import typings.html2canvas.imageMod.CSSRadialGradientImage
import typings.html2canvas.parserMod.CSSValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webkitGradientMod {
  
  @JSImport("html2canvas/dist/types/css/types/functions/-webkit-gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def webkitGradient(context: Context, tokens: js.Array[CSSValue]): CSSLinearGradientImage | CSSRadialGradientImage = (^.asInstanceOf[js.Dynamic].applyDynamic("webkitGradient")(context.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[CSSLinearGradientImage | CSSRadialGradientImage]
}
