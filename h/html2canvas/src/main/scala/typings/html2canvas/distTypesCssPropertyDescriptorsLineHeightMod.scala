package typings.html2canvas

import typings.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyTokenValueDescriptor
import typings.html2canvas.distTypesCssSyntaxParserMod.CSSValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssPropertyDescriptorsLineHeightMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/line-height", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeLineHeight(token: CSSValue, fontSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeLineHeight")(token.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/line-height", "lineHeight")
  @js.native
  val lineHeight: IPropertyTokenValueDescriptor = js.native
}
