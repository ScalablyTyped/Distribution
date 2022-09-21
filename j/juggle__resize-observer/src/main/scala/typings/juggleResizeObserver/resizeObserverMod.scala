package typings.juggleResizeObserver

import typings.juggleResizeObserver.resizeObserverCallbackMod.ResizeObserverCallback
import typings.juggleResizeObserver.resizeObserverOptionsMod.ResizeObserverOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeObserverMod {
  
  @JSImport("@juggle/resize-observer/lib/ResizeObserver", "ResizeObserver")
  @js.native
  open class ResizeObserver protected () extends StObject {
    def this(callback: ResizeObserverCallback) = this()
    
    def disconnect(): Unit = js.native
    
    def observe(target: Element): Unit = js.native
    def observe(target: Element, options: ResizeObserverOptions): Unit = js.native
    
    def unobserve(target: Element): Unit = js.native
  }
  object ResizeObserver {
    
    @JSImport("@juggle/resize-observer/lib/ResizeObserver", "ResizeObserver")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
  }
}
