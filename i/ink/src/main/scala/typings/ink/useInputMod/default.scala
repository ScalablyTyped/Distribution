package typings.ink.useInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink/build/hooks/use-input", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * This hook is used for handling user input.
    * It's a more convienient alternative to using `StdinContext` and listening to `data` events.
    * The callback you pass to `useInput` is called for each character when user enters any input.
    * However, if user pastes text and it's more than one character, the callback will be called only once and the whole string will be passed as `input`.
    *
    * ```
    * import {useInput} from 'ink';
    *
    * const UserInput = () => {
    *   useInput((input, key) => {
    *     if (input === 'q') {
    *       // Exit program
    *     }
    *
    *     if (key.leftArrow) {
    *       // Left arrow key pressed
    *     }
    *   });
    *
    *   return …
    * };
    * ```
    */
  def apply(inputHandler: Handler): Unit = js.native
  def apply(inputHandler: Handler, options: Options): Unit = js.native
}

