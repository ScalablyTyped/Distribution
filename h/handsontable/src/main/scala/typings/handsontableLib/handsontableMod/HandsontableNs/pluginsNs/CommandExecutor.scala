package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandExecutor extends js.Object {
  var commands: js.Object
  var commonCallback: js.Function0[scala.Unit] | scala.Unit
  var hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core
  def execute(commandName: java.lang.String, params: js.Any*): scala.Unit
  def registerCommand(name: java.lang.String, commandDescriptor: js.Object): scala.Unit
  def setCommonCallback(callback: js.Function0[scala.Unit]): scala.Unit
}

object CommandExecutor {
  @scala.inline
  def apply(
    commands: js.Object,
    commonCallback: js.Function0[scala.Unit] | scala.Unit,
    execute: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    hot: handsontableLib.handsontableMod.underscoreHandsontableNs.Core,
    registerCommand: js.Function2[java.lang.String, js.Object, scala.Unit],
    setCommonCallback: js.Function1[js.Function0[scala.Unit], scala.Unit]
  ): CommandExecutor = {
    val __obj = js.Dynamic.literal(commands = commands, commonCallback = commonCallback.asInstanceOf[js.Any], execute = execute, hot = hot, registerCommand = registerCommand, setCommonCallback = setCommonCallback)
  
    __obj.asInstanceOf[CommandExecutor]
  }
}

