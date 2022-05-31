package typings.iframeResizer

import typings.iframeResizer.mod.IFrameComponent
import typings.iframeResizer.mod.IFrameOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object iframeResizer {
    
    // leave this declaration outside the namespace so the 'require'd import is still callable
    inline def apply(options: IFrameOptions, target: String): js.Array[IFrameComponent] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[IFrameComponent]]
    inline def apply(options: IFrameOptions, target: HTMLElement): js.Array[IFrameComponent] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[IFrameComponent]]
    
    @JSGlobal("iframeResizer")
    @js.native
    val ^ : js.Any = js.native
    inline def iframeResizer(options: IFrameOptions, target: String): js.Array[IFrameComponent] = (^.asInstanceOf[js.Dynamic].applyDynamic("iframeResizer")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[IFrameComponent]]
    inline def iframeResizer(options: IFrameOptions, target: HTMLElement): js.Array[IFrameComponent] = (^.asInstanceOf[js.Dynamic].applyDynamic("iframeResizer")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[IFrameComponent]]
  }
}
