package typings.jupyterlabApplication.routerMod.Router

import typings.phosphorCommands.mod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for instantiating a JupyterLab URL router.
  */
trait IOptions extends js.Object {
  /**
    * The fully qualified base URL for the router.
    */
  var base: String
  /**
    * The command registry used by the router.
    */
  var commands: CommandRegistry
}

object IOptions {
  @scala.inline
  def apply(base: String, commands: CommandRegistry): IOptions = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

