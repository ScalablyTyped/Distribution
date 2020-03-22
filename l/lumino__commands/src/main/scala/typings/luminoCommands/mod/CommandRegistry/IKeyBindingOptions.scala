package typings.luminoCommands.mod.CommandRegistry

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a key binding.
  */
trait IKeyBindingOptions extends js.Object {
  /**
    * The arguments for the command, if necessary.
    *
    * The default value is an empty object.
    */
  var args: js.UndefOr[ReadonlyPartialJSONObject] = js.undefined
  /**
    * The id of the command to execute when the binding is matched.
    */
  var command: String
  /**
    * The default key sequence for the key binding.
    *
    * A key sequence is composed of one or more keystrokes, where each
    * keystroke is a combination of modifiers and a primary key.
    *
    * Most key sequences will contain a single keystroke. Key sequences
    * with multiple keystrokes are called "chords", and are useful for
    * implementing modal input (ala Vim).
    *
    * Each keystroke in the sequence should be of the form:
    *   `[<modifier 1> [<modifier 2> [<modifier N> ]]]<primary key>`
    *
    * The supported modifiers are: `Accel`, `Alt`, `Cmd`, `Ctrl`, and
    * `Shift`. The `Accel` modifier is translated to `Cmd` on Mac and
    * `Ctrl` on all other platforms. The `Cmd` modifier is ignored on
    * non-Mac platforms.
    *
    * Keystrokes are case sensitive.
    *
    * **Examples:** `['Accel C']`, `['Shift F11']`, `['D', 'D']`
    */
  var keys: js.Array[String]
  /**
    * The key sequence to use when running on Linux.
    *
    * If provided, this will override `keys` on Linux platforms.
    */
  var linuxKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The key sequence to use when running on Mac.
    *
    * If provided, this will override `keys` on Mac platforms.
    */
  var macKeys: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The CSS selector for the key binding.
    *
    * The key binding will only be invoked when the selector matches a
    * node on the propagation path of the keydown event. This allows
    * the key binding to be restricted to user-defined contexts.
    *
    * The selector must not contain commas.
    */
  var selector: String
  /**
    * The key sequence to use when running on Windows.
    *
    * If provided, this will override `keys` on Windows platforms.
    */
  var winKeys: js.UndefOr[js.Array[String]] = js.undefined
}

object IKeyBindingOptions {
  @scala.inline
  def apply(
    command: String,
    keys: js.Array[String],
    selector: String,
    args: ReadonlyPartialJSONObject = null,
    linuxKeys: js.Array[String] = null,
    macKeys: js.Array[String] = null,
    winKeys: js.Array[String] = null
  ): IKeyBindingOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (linuxKeys != null) __obj.updateDynamic("linuxKeys")(linuxKeys.asInstanceOf[js.Any])
    if (macKeys != null) __obj.updateDynamic("macKeys")(macKeys.asInstanceOf[js.Any])
    if (winKeys != null) __obj.updateDynamic("winKeys")(winKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyBindingOptions]
  }
}

