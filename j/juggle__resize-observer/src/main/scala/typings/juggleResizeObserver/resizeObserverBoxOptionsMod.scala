package typings.juggleResizeObserver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeObserverBoxOptionsMod {
  
  @js.native
  sealed trait ResizeObserverBoxOptions extends StObject
  @JSImport("@juggle/resize-observer/lib/ResizeObserverBoxOptions", "ResizeObserverBoxOptions")
  @js.native
  object ResizeObserverBoxOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ResizeObserverBoxOptions & String] = js.native
    
    @js.native
    sealed trait BORDER_BOX
      extends StObject
         with ResizeObserverBoxOptions
    /* "border-box" */ val BORDER_BOX: typings.juggleResizeObserver.resizeObserverBoxOptionsMod.ResizeObserverBoxOptions.BORDER_BOX & String = js.native
    
    @js.native
    sealed trait CONTENT_BOX
      extends StObject
         with ResizeObserverBoxOptions
    /* "content-box" */ val CONTENT_BOX: typings.juggleResizeObserver.resizeObserverBoxOptionsMod.ResizeObserverBoxOptions.CONTENT_BOX & String = js.native
    
    @js.native
    sealed trait DEVICE_PIXEL_CONTENT_BOX
      extends StObject
         with ResizeObserverBoxOptions
    /* "device-pixel-content-box" */ val DEVICE_PIXEL_CONTENT_BOX: typings.juggleResizeObserver.resizeObserverBoxOptionsMod.ResizeObserverBoxOptions.DEVICE_PIXEL_CONTENT_BOX & String = js.native
  }
}
