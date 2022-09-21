package typings.gridstack

import typings.gridstack.es5DdDraggableMod.DDDraggable
import typings.gridstack.es5DdDraggableMod.DDDraggableOpt
import typings.gridstack.es5DdDroppableMod.DDDroppable
import typings.gridstack.es5DdDroppableMod.DDDroppableOpt
import typings.gridstack.es5DdResizableMod.DDResizable
import typings.gridstack.es5DdResizableMod.DDResizableOpt
import typings.gridstack.typesMod.GridItemHTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es5DdElementMod {
  
  @JSImport("gridstack/dist/es5/dd-element", "DDElement")
  @js.native
  open class DDElement protected () extends StObject {
    def this(el: DDElementHost) = this()
    
    def cleanDraggable(): DDElement = js.native
    
    def cleanDroppable(): DDElement = js.native
    
    def cleanResizable(): DDElement = js.native
    
    var ddDraggable: js.UndefOr[DDDraggable] = js.native
    
    var ddDroppable: js.UndefOr[DDDroppable] = js.native
    
    var ddResizable: js.UndefOr[DDResizable] = js.native
    
    var el: DDElementHost = js.native
    
    def off(eventName: String): DDElement = js.native
    
    def on(eventName: String, callback: js.Function1[/* event */ MouseEvent, Unit]): DDElement = js.native
    
    def setupDraggable(opts: DDDraggableOpt): DDElement = js.native
    
    def setupDroppable(opts: DDDroppableOpt): DDElement = js.native
    
    def setupResizable(opts: DDResizableOpt): DDElement = js.native
  }
  /* static members */
  object DDElement {
    
    @JSImport("gridstack/dist/es5/dd-element", "DDElement")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(el: DDElementHost): DDElement = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(el.asInstanceOf[js.Any]).asInstanceOf[DDElement]
  }
  
  @js.native
  trait DDElementHost
    extends StObject
       with GridItemHTMLElement {
    
    var ddElement: js.UndefOr[DDElement] = js.native
  }
}
