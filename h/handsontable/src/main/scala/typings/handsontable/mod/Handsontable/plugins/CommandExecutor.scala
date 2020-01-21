package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandExecutor extends js.Object {
  var commands: js.Object
  var commonCallback: js.Function0[Unit] | Unit
  var hot: Core
  def execute(commandName: String, params: js.Any*): Unit
  def registerCommand(name: String, commandDescriptor: js.Object): Unit
  def setCommonCallback(callback: js.Function0[Unit]): Unit
}

object CommandExecutor {
  @scala.inline
  def apply(
    commands: js.Object,
    commonCallback: js.Function0[Unit] | Unit,
    execute: (String, /* repeated */ js.Any) => Unit,
    hot: Core,
    registerCommand: (String, js.Object) => Unit,
    setCommonCallback: js.Function0[Unit] => Unit
  ): CommandExecutor = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], commonCallback = commonCallback.asInstanceOf[js.Any], execute = js.Any.fromFunction2(execute), hot = hot.asInstanceOf[js.Any], registerCommand = js.Any.fromFunction2(registerCommand), setCommonCallback = js.Any.fromFunction1(setCommonCallback))
  
    __obj.asInstanceOf[CommandExecutor]
  }
}

