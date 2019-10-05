package typings.atJupyterlabApputils.libCommandlinkerMod.CommandLinker

import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
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
  var commands: CommandRegistry
}

object IOptions {
  @scala.inline
  def apply(commands: CommandRegistry): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands)
  
    __obj.asInstanceOf[IOptions]
  }
}

