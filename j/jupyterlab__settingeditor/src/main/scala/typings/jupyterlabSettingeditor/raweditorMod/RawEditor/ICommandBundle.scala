package typings.jupyterlabSettingeditor.raweditorMod.RawEditor

import typings.luminoCommands.mod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The toolbar commands and registry for the setting editor toolbar.
  */
trait ICommandBundle extends js.Object {
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

object ICommandBundle {
  @scala.inline
  def apply(registry: CommandRegistry, revert: String, save: String): ICommandBundle = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICommandBundle]
  }
}

