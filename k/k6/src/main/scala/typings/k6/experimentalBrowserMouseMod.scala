package typings.k6

import typings.k6.anon.Steps
import typings.k6.experimentalBrowserMod.MouseClickOptions
import typings.k6.experimentalBrowserMod.MouseDownUpOptions
import typings.k6.experimentalBrowserMod.MouseMultiClickOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalBrowserMouseMod {
  
  @JSImport("k6/experimental/browser/mouse", "Mouse")
  @js.native
  open class Mouse () extends StObject {
    
    /**
      * Shortcut for `mouse.move(x, y)`, `mouse.down()`, `mouse.up()`.
      * @param x The x position.
      * @param y The y position.
      * @param options The click options.
      */
    def click(x: Double, y: Double): Unit = js.native
    def click(x: Double, y: Double, options: MouseMultiClickOptions): Unit = js.native
    
    /**
      * Shortcut for `mouse.move(x, y)`, `mouse.down()`, `mouse.up()`, `mouse.down()`,
      * `mouse.up()`.
      * @param x The x position.
      * @param y The y position.
      * @param options The click options.
      */
    def dblclick(x: Double, y: Double): Unit = js.native
    def dblclick(x: Double, y: Double, options: MouseClickOptions): Unit = js.native
    
    /**
      * Dispatches a `mousedown` event.
      * @param options The mouse down options.
      */
    def down(): Unit = js.native
    def down(options: MouseDownUpOptions): Unit = js.native
    
    /**
      * Dispatches a `mousemove` event.
      * @param x The x position.
      * @param y The y position.
      * @param options The mouse move options.
      */
    def move(x: Double, y: Double): Unit = js.native
    def move(x: Double, y: Double, options: Steps): Unit = js.native
    
    /**
      * Dispatches a `mouseup` event.
      * @param options The mouse up options.
      */
    def up(): Unit = js.native
    def up(options: MouseDownUpOptions): Unit = js.native
  }
}
