package typings.juggleResizeObserver

import typings.juggleResizeObserver.juggleResizeObserverStrings.`border-box`
import typings.juggleResizeObserver.juggleResizeObserverStrings.`content-box`
import typings.juggleResizeObserver.juggleResizeObserverStrings.`device-pixel-content-box`
import typings.juggleResizeObserver.resizeObserverBoxOptionsMod.ResizeObserverBoxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeObserverOptionsMod {
  
  trait ResizeObserverOptions extends StObject {
    
    var box: js.UndefOr[
        `content-box` | `border-box` | `device-pixel-content-box` | ResizeObserverBoxOptions
      ] = js.undefined
  }
  object ResizeObserverOptions {
    
    inline def apply(): ResizeObserverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeObserverOptions]
    }
    
    extension [Self <: ResizeObserverOptions](x: Self) {
      
      inline def setBox(value: `content-box` | `border-box` | `device-pixel-content-box` | ResizeObserverBoxOptions): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
    }
  }
}
