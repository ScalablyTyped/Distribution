package typings.guacamoleClient.onScreenKeyboardMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client/lib/OnScreenKeyboard", "OnScreenKeyboard")
@js.native
class OnScreenKeyboard protected () extends js.Object {
  def this(layout: Layout) = this()
  
  /**
    * Returns the element containing the entire on-screen keyboard.
    * @returns The element containing the entire on-screen keyboard.
    */
  def getElement(): HTMLElement = js.native
  
  /**
    * Map of all key names to their corresponding set of keys. Each key name
    * may correspond to multiple keys due to the effect of modifiers.
    */
  var keys: Record[String, js.Array[Key]] = js.native
  
  /**
    * The keyboard layout provided at time of construction.
    */
  var layout: Layout = js.native
  
  /**
    * Fired whenever the user presses a key on this Guacamole.OnScreenKeyboard.
    *
    * @event
    * @param keysym The keysym of the key being pressed.
    */
  var onkeydown: Null | (js.Function1[/* keysym */ Double, Unit]) = js.native
  
  /**
    * Fired whenever the user releases a key on this Guacamole.OnScreenKeyboard.
    * @event
    * @param keysym The keysym of the key being released.
    */
  var onkeyup: Null | (js.Function1[/* keysym */ Double, Unit]) = js.native
  
  /**
    * Resizes all elements within this Guacamole.OnScreenKeyboard such that
    * the width is close to but does not exceed the specified width. The
    * height of the keyboard is determined based on the width.
    * @param width The width to resize this Guacamole.OnScreenKeyboard to, in pixels.
    */
  def resize(width: Double): Unit = js.native
  
  /**
    * The number of mousemove events to require before re-enabling mouse
    * event handling after receiving a touch event.
    */
  var touchMouseThreshold: Double = js.native
}
@JSImport("guacamole-client/lib/OnScreenKeyboard", "OnScreenKeyboard")
@js.native
object OnScreenKeyboard extends js.Object {
  
  type Key = Instantiable2[
    /* template */ typings.guacamoleClient.onScreenKeyboardMod.Key, 
    /* name */ js.UndefOr[String], 
    typings.guacamoleClient.onScreenKeyboardMod.Key
  ]
  
  type Layout = Instantiable1[
    /* template */ typings.guacamoleClient.onScreenKeyboardMod.Layout, 
    typings.guacamoleClient.onScreenKeyboardMod.Layout
  ]
}
