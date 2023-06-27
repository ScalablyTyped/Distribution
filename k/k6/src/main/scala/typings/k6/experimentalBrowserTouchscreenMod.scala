package typings.k6

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalBrowserTouchscreenMod {
  
  @JSImport("k6/experimental/browser/touchscreen", "Touchscreen")
  @js.native
  open class Touchscreen () extends StObject {
    
    /**
      * Taps on the specified position (`x`,`y`), which internally dispatches a `touchstart` and `touchend` event.
      * @param x The x position.
      * @param y The y position.
      */
    def tap(x: Double, y: Double): Unit = js.native
  }
}
