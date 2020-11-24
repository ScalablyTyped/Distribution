package typings.guacamoleClient

import typings.guacamoleClient.mouseMod.Mouse.State
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client/lib/Mouse", JSImport.Namespace)
@js.native
object mouseMod extends js.Object {
  
  @js.native
  class Mouse protected () extends js.Object {
    /**
      * @param element The Element to use to provide mouse events.
      */
    def this(element: HTMLDocument) = this()
    def this(element: HTMLElement) = this()
    
    /**
      * The current mouse state. The properties of this state are updated when
      * mouse events fire. This state object is also passed in as a parameter to
      * the handler of any mouse events.
      */
    var currentState: State = js.native
    
    /**
      * Fired whenever the user presses a mouse button down over the element
      * associated with this Guacamole.Mouse.
      *
      * @event
      * @param state The current mouse state.
      */
    var onmousedown: Null | (js.Function1[/* state */ State, Unit]) = js.native
    
    /**
      * Fired whenever the user moves the mouse over the element associated with
      * this Guacamole.Mouse.
      *
      * @event
      * @param state The current mouse state.
      */
    var onmousemove: Null | (js.Function1[/* state */ State, Unit]) = js.native
    
    /**
      * Fired whenever the mouse leaves the boundaries of the element associated
      * with this Guacamole.Mouse.
      *
      * @event
      */
    var onmouseout: Null | js.Function0[Unit] = js.native
    
    /**
      * Fired whenever the user releases a mouse button down over the element
      * associated with this Guacamole.Mouse.
      *
      * @event
      * @param state The current mouse state.
      */
    var onmouseup: Null | (js.Function1[/* state */ State, Unit]) = js.native
  }
  @js.native
  object Mouse extends js.Object {
    
    @js.native
    class GuacTouchDevice protected () extends js.Object {
      /**
        * @param element The Element to use to provide touch events.
        */
      def this(element: HTMLElement) = this()
      
      /**
        * The maximum number of pixels to allow a touch to move for the gesture to
        * be considered a click.
        */
      var clickMoveThreshold: Double = js.native
      
      /**
        * The maximum number of milliseconds to wait for a touch to end for the
        * gesture to be considered a click.
        */
      var clickTimingThreshold: Double = js.native
      
      /**
        * The current mouse state. The properties of this state are updated when
        * mouse events fire. This state object is also passed in as a parameter to
        * the handler of any mouse events.
        */
      var currentState: State = js.native
      
      /**
        * Fired whenever a mouse button is effectively pressed. This can happen
        * as part of a "click" gesture initiated by the user by tapping one
        * or more fingers over the touchpad element, as part of a "scroll"
        * gesture initiated by dragging two fingers up or down, etc.
        * @event
        * @param state The current mouse state.
        */
      var onmousedown: Null | (js.Function1[/* state */ State, Unit]) = js.native
      
      /**
        * Fired whenever the user moves the mouse by dragging their finger over
        * the touchpad element.
        * @event
        * @param state The current mouse state.
        */
      var onmousemove: Null | (js.Function1[/* state */ State, Unit]) = js.native
      
      /**
        * Fired whenever a mouse button is effectively released. This can happen
        * as part of a "click" gesture initiated by the user by tapping one
        * or more fingers over the touchpad element, as part of a "scroll"
        * gesture initiated by dragging two fingers up or down, etc.
        * @event
        * @param state The current mouse state.
        */
      var onmouseup: Null | (js.Function1[/* state */ State, Unit]) = js.native
      
      /**
        * The distance a two-finger touch must move per scrollwheel event, in
        * pixels.
        */
      var scrollThreshold: Double = js.native
    }
    
    @js.native
    class State protected () extends js.Object {
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
      
      /**
        * Whether the down mouse button is currently pressed. This is the fifth
        * mouse button, associated with downward scrolling of the mouse scroll
        * wheel.
        */
      var down: Boolean = js.native
      
      def fromClientPosition(element: HTMLDocument, clientX: Double, clientY: Double): State = js.native
      /**
        * Updates the position represented within this state object by the given
        * element and clientX/clientY coordinates (commonly available within event
        * objects). Position is translated from clientX/clientY (relative to
        * viewport) to element-relative coordinates.
        *
        * @param element The element the coordinates should be relative to.
        * @param clientX The X coordinate to translate, viewport-relative.
        * @param clientY The Y coordinate to translate, viewport-relative.
        */
      def fromClientPosition(element: HTMLElement, clientX: Double, clientY: Double): State = js.native
      
      /**
        * Whether the left mouse button is currently pressed.
        */
      var left: Boolean = js.native
      
      /**
        * Whether the middle mouse button is currently pressed.
        */
      var middle: Boolean = js.native
      
      /**
        * Whether the right mouse button is currently pressed.
        */
      var right: Boolean = js.native
      
      /**
        * Whether the up mouse button is currently pressed. This is the fourth
        * mouse button, associated with upward scrolling of the mouse scroll
        * wheel.
        */
      var up: Boolean = js.native
      
      /**
        * The current X position of the mouse pointer.
        */
      var x: Double = js.native
      
      /**
        * The current Y position of the mouse pointer.
        */
      var y: Double = js.native
    }
    
    @js.native
    class Touchpad () extends GuacTouchDevice
    
    @js.native
    class Touchscreen () extends GuacTouchDevice {
      
      /**
        * The amount of time a press must be held for long press to be
        * detected.
        */
      var longPressThreshold: Double = js.native
    }
  }
}
