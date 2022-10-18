package typings.jupyterlabCells

import typings.luminoWidgets.mod.Widget
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResizeHandleMod {
  
  @JSImport("@jupyterlab/cells/lib/resizeHandle", "ResizeHandle")
  @js.native
  open class ResizeHandle protected () extends Widget {
    def this(targetNode: HTMLElement) = this()
    
    /* private */ var _isActive: Any = js.native
    
    /* private */ var _isDragging: Any = js.native
    
    /* private */ var _protectedWidth: Any = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      */
    def handleEvent(event: Event): Unit = js.native
    
    /* protected */ var targetNode: HTMLElement = js.native
  }
}
