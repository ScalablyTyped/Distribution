package typings.jupyterlabSettingeditor.anon

import typings.luminoCommands.mod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
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

object Registry {
  @scala.inline
  def apply(registry: CommandRegistry, revert: String, save: String): Registry = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registry]
  }
}

