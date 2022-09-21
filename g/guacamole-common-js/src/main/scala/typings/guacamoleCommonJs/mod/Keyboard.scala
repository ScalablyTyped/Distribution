package typings.guacamoleCommonJs.mod

import typings.std.HTMLDocument
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-common-js", "Keyboard")
@js.native
/**
  * @param element
  * The Element to use to provide keyboard events. If omitted, at least one
  * Element must be manually provided through the listenTo() function for
  * the Guacamole.Keyboard instance to have any effect.
  */
open class Keyboard ()
  extends typings.guacamoleCommonJs.keyboardMod.Keyboard {
  def this(element: HTMLDocument) = this()
  def this(element: HTMLElement) = this()
}
object Keyboard {
  
  @JSImport("guacamole-common-js", "Keyboard.ModifierState")
  @js.native
  open class ModifierState ()
    extends typings.guacamoleCommonJs.keyboardMod.Keyboard.ModifierState
  /* static members */
  object ModifierState {
    
    @JSImport("guacamole-common-js", "Keyboard.ModifierState")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the modifier state applicable to the keyboard event given.
      * @param event The keyboard event to read.
      * @returns The current state of keyboard modifiers.
      */
    inline def fromKeyboardEvent(event: KeyboardEvent): typings.guacamoleCommonJs.keyboardMod.Keyboard.ModifierState = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeyboardEvent")(event.asInstanceOf[js.Any]).asInstanceOf[typings.guacamoleCommonJs.keyboardMod.Keyboard.ModifierState]
  }
}
