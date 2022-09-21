package typings.html2canvas

import typings.html2canvas.contextMod.Context
import typings.html2canvas.elementContainerMod.ElementContainer
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/elements/select-element-container", "SelectElementContainer")
  @js.native
  open class SelectElementContainer protected () extends ElementContainer {
    def this(context: Context, element: HTMLSelectElement) = this()
    
    val value: String = js.native
  }
}
