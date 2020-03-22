package typings.luminoCommands.mod.CommandRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/commands", "CommandRegistry.normalizeKeystroke")
@js.native
object normalizeKeystroke extends js.Object {
  /**
    * Normalize a keystroke into a canonical representation.
    *
    * @param keystroke - The keystroke of interest.
    *
    * @returns The normalized representation of the keystroke.
    *
    * #### Notes
    * This normalizes the keystroke by removing duplicate modifiers and
    * extra primary keys, and assembling the parts in a canonical order.
    *
    * The `Cmd` modifier is ignored on non-Mac platforms.
    */
  def apply(keystroke: String): String = js.native
}

