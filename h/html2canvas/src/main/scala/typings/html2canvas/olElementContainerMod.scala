package typings.html2canvas

import typings.html2canvas.contextMod.Context
import typings.html2canvas.elementContainerMod.ElementContainer
import typings.std.HTMLOListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object olElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/elements/ol-element-container", "OLElementContainer")
  @js.native
  open class OLElementContainer protected () extends ElementContainer {
    def this(context: Context, element: HTMLOListElement) = this()
    
    val reversed: Boolean = js.native
    
    val start: Double = js.native
  }
}
