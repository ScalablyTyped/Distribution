package typings.guacamoleClient.mod

import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "Keyboard")
@js.native
/**
  * @param element
  * The Element to use to provide keyboard events. If omitted, at least one
  * Element must be manually provided through the listenTo() function for
  * the Guacamole.Keyboard instance to have any effect.
  */
open class Keyboard ()
  extends typings.guacamoleClient.libKeyboardMod.Keyboard {
  def this(element: HTMLDocument) = this()
  def this(element: HTMLElement) = this()
}
object Keyboard {
  
  @JSImport("guacamole-client", "Keyboard.ModifierState")
  @js.native
  open class ModifierState ()
    extends typings.guacamoleClient.libKeyboardMod.Keyboard.ModifierState
  /* static members */
  object ModifierState {
    
    @JSImport("guacamole-client", "Keyboard.ModifierState")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the modifier state applicable to the keyboard event given.
      * @param event The keyboard event to read.
      * @returns The current state of keyboard modifiers.
      */
    inline def fromKeyboardEvent(event: KeyboardEvent): typings.guacamoleClient.libKeyboardMod.Keyboard.ModifierState = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeyboardEvent")(event.asInstanceOf[js.Any]).asInstanceOf[typings.guacamoleClient.libKeyboardMod.Keyboard.ModifierState]
  }
}
