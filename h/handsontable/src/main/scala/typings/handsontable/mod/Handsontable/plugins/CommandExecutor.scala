package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandExecutor extends js.Object {
  var commands: js.Object = js.native
  var commonCallback: js.Function0[Unit] | Unit = js.native
  var hot: Core = js.native
  def execute(commandName: String, params: js.Any*): Unit = js.native
  def registerCommand(name: String, commandDescriptor: js.Object): Unit = js.native
  def setCommonCallback(callback: js.Function0[Unit]): Unit = js.native
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
  @scala.inline
  implicit class CommandExecutorOps[Self <: CommandExecutor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommands(value: js.Object): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommonCallbackFunction0(value: () => Unit): Self = this.set("commonCallback", js.Any.fromFunction0(value))
    @scala.inline
    def setCommonCallback(value: js.Function0[Unit] | Unit): Self = this.set("commonCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecute(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("execute", js.Any.fromFunction2(value))
    @scala.inline
    def setHot(value: Core): Self = this.set("hot", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisterCommand(value: (String, js.Object) => Unit): Self = this.set("registerCommand", js.Any.fromFunction2(value))
    @scala.inline
    def setSetCommonCallback(value: js.Function0[Unit] => Unit): Self = this.set("setCommonCallback", js.Any.fromFunction1(value))
  }
  
}

