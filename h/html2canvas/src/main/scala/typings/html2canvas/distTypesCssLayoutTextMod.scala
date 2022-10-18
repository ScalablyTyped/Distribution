package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesCssLayoutBoundsMod.Bounds
import typings.html2canvas.distTypesCssMod.CSSParsedDeclaration
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssLayoutTextMod {
  
  @JSImport("html2canvas/dist/types/css/layout/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/css/layout/text", "TextBounds")
  @js.native
  open class TextBounds protected () extends StObject {
    def this(text: String, bounds: Bounds) = this()
    
    val bounds: Bounds = js.native
    
    val text: String = js.native
  }
  
  inline def parseTextBounds(context: Context, value: String, styles: CSSParsedDeclaration, node: Text): js.Array[TextBounds] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTextBounds")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[TextBounds]]
  
  inline def segmentGraphemes(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("segmentGraphemes")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
