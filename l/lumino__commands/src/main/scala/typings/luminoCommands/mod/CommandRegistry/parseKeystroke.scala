package typings.luminoCommands.mod.CommandRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/commands", "CommandRegistry.parseKeystroke")
@js.native
object parseKeystroke extends js.Object {
  
  /**
    * Parse a keystroke into its constituent components.
    *
    * @param keystroke - The keystroke of interest.
    *
    * @returns The parsed components of the keystroke.
    *
    * #### Notes
    * The keystroke should be of the form:
    *   `[<modifier 1> [<modifier 2> [<modifier N> ]]]<primary key>`
    *
    * The supported modifiers are: `Accel`, `Alt`, `Cmd`, `Ctrl`, and
    * `Shift`. The `Accel` modifier is translated to `Cmd` on Mac and
    * `Ctrl` on all other platforms.
    *
    * The parsing is tolerant and will not throw exceptions. Notably:
    *   - Duplicate modifiers are ignored.
    *   - Extra primary keys are ignored.
    *   - The order of modifiers and primary key is irrelevant.
    *   - The keystroke parts should be separated by whitespace.
    *   - The keystroke is case sensitive.
    */
  def apply(keystroke: String): IKeystrokeParts = js.native
}
