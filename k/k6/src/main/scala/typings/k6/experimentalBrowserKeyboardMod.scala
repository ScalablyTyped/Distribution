package typings.k6

import typings.k6.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalBrowserKeyboardMod {
  
  @JSImport("k6/experimental/browser/keyboard", "Keyboard")
  @js.native
  open class Keyboard () extends StObject {
    
    /**
      * Sends a key down message to a session target.
      * A superset of the key values can be found [here](https://developer.mozilla.org/en-US/docs/Web/API/UI_Events/Keyboard_event_key_values).
      * @param key Name of key to press, such as `ArrowLeft`.
      */
    def down(key: String): Unit = js.native
    
    /**
      * Dispatches an `input` event with the given `text`.
      * This method does not emit `keyDown`, `keyUp` or `keyPress` events.
      * @param text Event text.
      */
    def insertText(text: String): Unit = js.native
    
    /**
      * Sends a key press message to a session target.
      * A press message consists of successive key down and up messages.
      * @param key Sequence of keys to press.
      * @param options Specifies the typing options.
      */
    def press(key: String): Unit = js.native
    def press(key: String, options: Delay): Unit = js.native
    
    /**
      * Type sends a `press` message to a session target for each character in text.
      * It sends an insertText message if a character is not among
      * valid characters in the keyboard's layout.
      * Modifier keys `Shift`, `Control`, `Alt`, `Meta` are _not_ respected.
      * @param text A text to type into a focused element.
      * @param options Specifies the typing options.
      */
    def `type`(text: String): Unit = js.native
    def `type`(text: String, options: Delay): Unit = js.native
    
    /**
      * Sends a key up message to a session target.
      * A superset of the key values can be found [here](https://developer.mozilla.org/en-US/docs/Web/API/UI_Events/Keyboard_event_key_values).
      * @param key Name of key to release, such as `ArrowLeft`.
      */
    def up(key: String): Unit = js.native
  }
}
