package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.mod.dia.CellView.Options
import typings.jointjs.mod.dia.ElementView.InteractivityOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.ElementView")
@js.native
class ElementView () extends CellViewGeneric[Element] {
  def this(opt: Options[Element]) = this()
  
  /* protected */ def addLinkFromMagnet(magnet: SVGElement, x: Double, y: Double): LinkView = js.native
  
  /* protected */ def drag(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragLinkStart(evt: Event, magnet: SVGElement, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragMagnet(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragMagnetEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragMagnetStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  def findPortNode(portId: String): SVGElement = js.native
  def findPortNode(portId: String, selector: String): SVGElement = js.native
  def findPortNode(portId: Double): SVGElement = js.native
  def findPortNode(portId: Double, selector: String): SVGElement = js.native
  
  def getDelegatedView(): ElementView | Null = js.native
  
  /* protected */ def renderJSONMarkup(markup: MarkupJSON): Unit = js.native
  
  /* protected */ def renderMarkup(): Unit = js.native
  
  /* protected */ def renderStringMarkup(markup: String): Unit = js.native
  
  def setInteractivity(value: Boolean): Unit = js.native
  def setInteractivity(value: InteractivityOptions): Unit = js.native
  
  def update(): Unit = js.native
  def update(element: Unit, renderingOnlyAttrs: StringDictionary[js.Any]): Unit = js.native
  def update(element: Element): Unit = js.native
  def update(element: Element, renderingOnlyAttrs: StringDictionary[js.Any]): Unit = js.native
}
object ElementView {
  
  trait InteractivityOptions extends StObject {
    
    var addLinkFromMagnet: js.UndefOr[Boolean] = js.undefined
    
    var elementMove: js.UndefOr[Boolean] = js.undefined
  }
  object InteractivityOptions {
    
    inline def apply(): InteractivityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractivityOptions]
    }
    
    extension [Self <: InteractivityOptions](x: Self) {
      
      inline def setAddLinkFromMagnet(value: Boolean): Self = StObject.set(x, "addLinkFromMagnet", value.asInstanceOf[js.Any])
      
      inline def setAddLinkFromMagnetUndefined: Self = StObject.set(x, "addLinkFromMagnet", js.undefined)
      
      inline def setElementMove(value: Boolean): Self = StObject.set(x, "elementMove", value.asInstanceOf[js.Any])
      
      inline def setElementMoveUndefined: Self = StObject.set(x, "elementMove", js.undefined)
    }
  }
}
