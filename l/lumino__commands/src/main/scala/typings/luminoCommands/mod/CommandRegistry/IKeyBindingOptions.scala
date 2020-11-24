package typings.luminoCommands.mod.CommandRegistry

import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for creating a key binding.
  */
@js.native
trait IKeyBindingOptions extends js.Object {
  
  /**
    * The arguments for the command, if necessary.
    *
    * The default value is an empty object.
    */
  var args: js.UndefOr[ReadonlyPartialJSONObject] = js.native
  
  /**
    * The id of the command to execute when the binding is matched.
    */
  var command: String = js.native
  
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
  var keys: js.Array[String] = js.native
  
  /**
    * The key sequence to use when running on Linux.
    *
    * If provided, this will override `keys` on Linux platforms.
    */
  var linuxKeys: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The key sequence to use when running on Mac.
    *
    * If provided, this will override `keys` on Mac platforms.
    */
  var macKeys: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The CSS selector for the key binding.
    *
    * The key binding will only be invoked when the selector matches a
    * node on the propagation path of the keydown event. This allows
    * the key binding to be restricted to user-defined contexts.
    *
    * The selector must not contain commas.
    */
  var selector: String = js.native
  
  /**
    * The key sequence to use when running on Windows.
    *
    * If provided, this will override `keys` on Windows platforms.
    */
  var winKeys: js.UndefOr[js.Array[String]] = js.native
}
object IKeyBindingOptions {
  
  @scala.inline
  def apply(command: String, keys: js.Array[String], selector: String): IKeyBindingOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyBindingOptions]
  }
  
  @scala.inline
  implicit class IKeyBindingOptionsOps[Self <: IKeyBindingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: ReadonlyPartialJSONObject): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setLinuxKeysVarargs(value: String*): Self = this.set("linuxKeys", js.Array(value :_*))
    
    @scala.inline
    def setLinuxKeys(value: js.Array[String]): Self = this.set("linuxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinuxKeys: Self = this.set("linuxKeys", js.undefined)
    
    @scala.inline
    def setMacKeysVarargs(value: String*): Self = this.set("macKeys", js.Array(value :_*))
    
    @scala.inline
    def setMacKeys(value: js.Array[String]): Self = this.set("macKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacKeys: Self = this.set("macKeys", js.undefined)
    
    @scala.inline
    def setWinKeysVarargs(value: String*): Self = this.set("winKeys", js.Array(value :_*))
    
    @scala.inline
    def setWinKeys(value: js.Array[String]): Self = this.set("winKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWinKeys: Self = this.set("winKeys", js.undefined)
  }
}
