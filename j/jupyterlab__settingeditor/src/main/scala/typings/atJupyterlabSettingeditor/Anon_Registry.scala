package typings.atJupyterlabSettingeditor

import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Registry extends js.Object {
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

object Anon_Registry {
  @scala.inline
  def apply(registry: CommandRegistry, revert: String, save: String): Anon_Registry = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Registry]
  }
}

