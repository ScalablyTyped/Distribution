package typings.guacamoleCommonJs.mod

import typings.std.HTMLDocument
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-common-js", "Mouse")
@js.native
open class Mouse protected ()
  extends typings.guacamoleCommonJs.libMouseMod.Mouse {
  /**
    * @param element The Element to use to provide mouse events.
    */
  def this(element: HTMLDocument) = this()
  def this(element: HTMLElement) = this()
}
object Mouse {
  
  @JSImport("guacamole-common-js", "Mouse.GuacTouchDevice")
  @js.native
  open class GuacTouchDevice protected ()
    extends typings.guacamoleCommonJs.libMouseMod.Mouse.GuacTouchDevice {
    /**
      * @param element The Element to use to provide touch events.
      */
    def this(element: HTMLElement) = this()
  }
  
  @JSImport("guacamole-common-js", "Mouse.State")
  @js.native
  open class State protected ()
    extends typings.guacamoleCommonJs.libMouseMod.Mouse.State {
    /**
      * @param x The X position of the mouse pointer in pixels.
      * @param y The Y position of the mouse pointer in pixels.
      * @param left Whether the left mouse button is pressed.
      * @param middle Whether the middle mouse button is pressed.
      * @param right Whether the right mouse button is pressed.
      * @param up Whether the up mouse button is pressed (the fourth button, usually part of a scroll wheel).
      * @param down Whether the down mouse button is pressed (the fifth button, usually part of a scroll wheel).
      */
    def this(x: Double, y: Double, left: Boolean, middle: Boolean, right: Boolean, up: Boolean, down: Boolean) = this()
  }
  
  @JSImport("guacamole-common-js", "Mouse.Touchpad")
  @js.native
  open class Touchpad protected ()
    extends typings.guacamoleCommonJs.libMouseMod.Mouse.Touchpad {
    /**
      * @param element The Element to use to provide touch events.
      */
    def this(element: HTMLElement) = this()
  }
  
  @JSImport("guacamole-common-js", "Mouse.Touchscreen")
  @js.native
  open class Touchscreen protected ()
    extends typings.guacamoleCommonJs.libMouseMod.Mouse.Touchscreen {
    /**
      * @param element The Element to use to provide touch events.
      */
    def this(element: HTMLElement) = this()
  }
}
