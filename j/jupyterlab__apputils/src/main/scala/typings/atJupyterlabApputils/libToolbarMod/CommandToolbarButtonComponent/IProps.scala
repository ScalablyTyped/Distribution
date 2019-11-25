package typings.atJupyterlabApputils.libToolbarMod.CommandToolbarButtonComponent

import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for CommandToolbarButtonComponent props.
  */
trait IProps extends js.Object {
  var args: js.UndefOr[ReadonlyJSONObject] = js.undefined
  var commands: CommandRegistry
  var id: String
}

object IProps {
  @scala.inline
  def apply(commands: CommandRegistry, id: String, args: ReadonlyJSONObject = null): IProps = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

