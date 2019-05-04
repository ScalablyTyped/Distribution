package typings
package atJupyterlabApputilsLib.libToolbarMod.CommandToolbarButtonComponentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for CommandToolbarButtonComponent props.
  */
trait IProps extends js.Object {
  var commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry
  var id: java.lang.String
}

object IProps {
  @scala.inline
  def apply(commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry, id: java.lang.String): IProps = {
    val __obj = js.Dynamic.literal(commands = commands, id = id)
  
    __obj.asInstanceOf[IProps]
  }
}

