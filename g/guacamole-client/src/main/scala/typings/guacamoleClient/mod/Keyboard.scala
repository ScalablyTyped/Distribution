package typings.guacamoleClient.mod

import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "Keyboard")
@js.native
class Keyboard protected ()
  extends typings.guacamoleClient.keyboardMod.Keyboard {
  /**
    * @param element
    * The Element to use to provide keyboard events. If omitted, at least one
    * Element must be manually provided through the listenTo() function for
    * the Guacamole.Keyboard instance to have any effect.
    */
  def this(element: HTMLDocument) = this()
  def this(element: HTMLElement) = this()
}

@JSImport("guacamole-client", "Keyboard")
@js.native
object Keyboard extends js.Object {
  @js.native
  class ModifierState ()
    extends typings.guacamoleClient.keyboardMod.Keyboard.ModifierState
  
  /* static members */
  @js.native
  object ModifierState extends js.Object {
    /**
      * Returns the modifier state applicable to the keyboard event given.
      * @param event The keyboard event to read.
      * @returns The current state of keyboard modifiers.
      */
    def fromKeyboardEvent(event: KeyboardEvent): typings.guacamoleClient.keyboardMod.Keyboard.ModifierState = js.native
  }
  
}

