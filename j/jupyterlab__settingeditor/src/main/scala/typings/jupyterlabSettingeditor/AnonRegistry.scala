package typings.jupyterlabSettingeditor

import typings.luminoCommands.mod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegistry extends js.Object {
  /**
    * The command registry.
    */
  var registry: CommandRegistry
  /**
    * The revert command ID.
    */
  var revert: String
  /**
    * The save command ID.
    */
  var save: String
}

object AnonRegistry {
  @scala.inline
  def apply(registry: CommandRegistry, revert: String, save: String): AnonRegistry = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRegistry]
  }
}

