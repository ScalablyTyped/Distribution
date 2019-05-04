package typings
package atJupyterlabApputilsLib.libCommandlinkerMod.CommandLinkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a command linker.
  */
trait IOptions extends js.Object {
  /**
    * The command registry instance that all linked commands will use.
    */
  var commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
}

object IOptions {
  @scala.inline
  def apply(commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands)
  
    __obj.asInstanceOf[IOptions]
  }
}

