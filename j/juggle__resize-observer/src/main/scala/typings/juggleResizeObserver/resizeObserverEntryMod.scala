package typings.juggleResizeObserver

import typings.juggleResizeObserver.domrectreadonlyMod.DOMRectReadOnly
import typings.juggleResizeObserver.resizeObserverSizeMod.ResizeObserverSize
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeObserverEntryMod {
  
  @JSImport("@juggle/resize-observer/lib/ResizeObserverEntry", "ResizeObserverEntry")
  @js.native
  open class ResizeObserverEntry protected () extends StObject {
    def this(target: Element) = this()
    
    var borderBoxSize: js.Array[ResizeObserverSize] = js.native
    
    var contentBoxSize: js.Array[ResizeObserverSize] = js.native
    
    var contentRect: DOMRectReadOnly = js.native
    
    var devicePixelContentBoxSize: js.Array[ResizeObserverSize] = js.native
    
    var target: Element = js.native
  }
}
