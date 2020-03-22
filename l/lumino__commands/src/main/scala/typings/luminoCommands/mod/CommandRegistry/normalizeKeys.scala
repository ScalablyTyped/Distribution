package typings.luminoCommands.mod.CommandRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/commands", "CommandRegistry.normalizeKeys")
@js.native
object normalizeKeys extends js.Object {
  /**
    * Get the platform-specific normalized keys for an options object.
    *
    * @param options - The options for the key binding.
    *
    * @returns Array of combined, normalized keys.
    */
  def apply(options: IKeyBindingOptions): js.Array[String] = js.native
}

