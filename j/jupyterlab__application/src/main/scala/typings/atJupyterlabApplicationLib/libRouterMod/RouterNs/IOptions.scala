package typings
package atJupyterlabApplicationLib.libRouterMod.RouterNs

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
  var base: java.lang.String
  /**
    * The command registry used by the router.
    */
  var commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
}

object IOptions {
  @scala.inline
  def apply(base: java.lang.String, commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry): IOptions = {
    val __obj = js.Dynamic.literal(base = base, commands = commands)
  
    __obj.asInstanceOf[IOptions]
  }
}

