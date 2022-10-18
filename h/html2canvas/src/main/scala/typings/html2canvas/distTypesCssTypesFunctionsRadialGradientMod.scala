package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesCssSyntaxParserMod.CSSValue
import typings.html2canvas.distTypesCssTypesImageMod.CSSRadialGradientImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssTypesFunctionsRadialGradientMod {
  
  @JSImport("html2canvas/dist/types/css/types/functions/radial-gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/css/types/functions/radial-gradient", "CIRCLE")
  @js.native
  val CIRCLE: /* "circle" */ String = js.native
  
  @JSImport("html2canvas/dist/types/css/types/functions/radial-gradient", "CLOSEST_CORNER")
  @js.native
  val CLOSEST_CORNER: /* "closest-corner" */ String = js.native
  
  @JSImport("html2canvas/dist/types/css/types/functions/radial-gradient", "CLOSEST_SIDE")
  @js.native
  val CLOSEST_SIDE: /* "closest-side" */ String = js.native
  
  @JSImport("html2canvas/dist/types/css/types/functions/radial-gradient", "CONTAIN")
  @js.native
  val CONTAIN: /* "contain" */ String = js.native
  
  @JSImport("html2canvas/dist/types/css/types/functions/radial-gradient", "COVER")
  @js.native
  val COVER: /* "cover" */ String = js.native
  
  @JSImport("html2canvas/dist/types/css/types/functions/radial-gradient", "ELLIPSE")
  @js.native
  val ELLIPSE: /* "ellipse" */ String = js.native
  
  @JSImport("html2canvas/dist/types/css/types/functions/radial-gradient", "FARTHEST_CORNER")
  @js.native
  val FARTHEST_CORNER: /* "farthest-corner" */ String = js.native
  
  @JSImport("html2canvas/dist/types/css/types/functions/radial-gradient", "FARTHEST_SIDE")
  @js.native
  val FARTHEST_SIDE: /* "farthest-side" */ String = js.native
  
  inline def radialGradient(context: Context, tokens: js.Array[CSSValue]): CSSRadialGradientImage = (^.asInstanceOf[js.Dynamic].applyDynamic("radialGradient")(context.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[CSSRadialGradientImage]
}
