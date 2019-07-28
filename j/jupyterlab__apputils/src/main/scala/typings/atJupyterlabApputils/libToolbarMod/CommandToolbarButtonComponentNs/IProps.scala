package typings.atJupyterlabApputils.libToolbarMod.CommandToolbarButtonComponentNs

import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for CommandToolbarButtonComponent props.
  */
trait IProps extends js.Object {
  var commands: CommandRegistry
  var id: String
}

object IProps {
  @scala.inline
  def apply(commands: CommandRegistry, id: String): IProps = {
    val __obj = js.Dynamic.literal(commands = commands, id = id)
  
    __obj.asInstanceOf[IProps]
  }
}

