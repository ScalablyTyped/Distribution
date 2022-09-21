package typings.juggleResizeObserver

import typings.juggleResizeObserver.resizeObserverCallbackMod.ResizeObserverCallback
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@juggle/resize-observer", "ResizeObserver")
  @js.native
  open class ResizeObserver protected ()
    extends typings.juggleResizeObserver.resizeObserverMod.ResizeObserver {
    def this(callback: ResizeObserverCallback) = this()
  }
  object ResizeObserver {
    
    @JSImport("@juggle/resize-observer", "ResizeObserver")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
  }
  
  @JSImport("@juggle/resize-observer", "ResizeObserverEntry")
  @js.native
  open class ResizeObserverEntry protected ()
    extends typings.juggleResizeObserver.resizeObserverEntryMod.ResizeObserverEntry {
    def this(target: Element) = this()
  }
  
  @JSImport("@juggle/resize-observer", "ResizeObserverSize")
  @js.native
  open class ResizeObserverSize protected ()
    extends typings.juggleResizeObserver.resizeObserverSizeMod.ResizeObserverSize {
    def this(inlineSize: Double, blockSize: Double) = this()
  }
}
