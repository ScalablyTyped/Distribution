package typings.html2canvas

import typings.html2canvas.contextMod.Context
import typings.html2canvas.elementContainerMod.ElementContainer
import typings.html2canvas.replacedElementsMod.ReplacedElementContainer
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/replaced-elements/svg-element-container", "SVGElementContainer")
  @js.native
  open class SVGElementContainer protected ()
    extends ElementContainer
       with ReplacedElementContainer {
    def this(context: Context, img: SVGSVGElement) = this()
    
    var intrinsicHeight: Double = js.native
    
    var intrinsicWidth: Double = js.native
    
    var svg: String = js.native
  }
}
