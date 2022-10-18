package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.std.ClientRect
import typings.std.DOMRectList
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssLayoutBoundsMod {
  
  @JSImport("html2canvas/dist/types/css/layout/bounds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/css/layout/bounds", "Bounds")
  @js.native
  open class Bounds protected () extends StObject {
    def this(left: Double, top: Double, width: Double, height: Double) = this()
    
    def add(x: Double, y: Double, w: Double, h: Double): Bounds = js.native
    
    val height: Double = js.native
    
    val left: Double = js.native
    
    val top: Double = js.native
    
    val width: Double = js.native
  }
  /* static members */
  object Bounds {
    
    @JSImport("html2canvas/dist/types/css/layout/bounds", "Bounds")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("html2canvas/dist/types/css/layout/bounds", "Bounds.EMPTY")
    @js.native
    def EMPTY: Bounds = js.native
    inline def EMPTY_=(x: Bounds): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
    
    inline def fromClientRect(context: Context, clientRect: ClientRect): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("fromClientRect")(context.asInstanceOf[js.Any], clientRect.asInstanceOf[js.Any])).asInstanceOf[Bounds]
    
    inline def fromDOMRectList(context: Context, domRectList: DOMRectList): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDOMRectList")(context.asInstanceOf[js.Any], domRectList.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  }
  
  inline def parseBounds(context: Context, node: Element): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBounds")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  
  inline def parseDocumentSize(document: Document): Bounds = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDocumentSize")(document.asInstanceOf[js.Any]).asInstanceOf[Bounds]
}
