package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesCssLayoutTextMod.TextBounds
import typings.html2canvas.distTypesCssMod.CSSParsedDeclaration
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomTextContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/text-container", "TextContainer")
  @js.native
  open class TextContainer protected () extends StObject {
    def this(context: Context, node: Text, styles: CSSParsedDeclaration) = this()
    
    var text: String = js.native
    
    var textBounds: js.Array[TextBounds] = js.native
  }
}
