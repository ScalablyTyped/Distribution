package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandExecutor extends StObject {
  
  var commands: js.Object = js.native
  
  var commonCallback: js.Function0[Unit] | Unit = js.native
  
  def execute(commandName: String, params: js.Any*): Unit = js.native
  
  var hot: Core = js.native
  
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
  implicit class CommandExecutorMutableBuilder[Self <: CommandExecutor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: js.Object): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonCallback(value: js.Function0[Unit] | Unit): Self = StObject.set(x, "commonCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonCallbackFunction0(value: () => Unit): Self = StObject.set(x, "commonCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecute(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHot(value: Core): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterCommand(value: (String, js.Object) => Unit): Self = StObject.set(x, "registerCommand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetCommonCallback(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "setCommonCallback", js.Any.fromFunction1(value))
  }
}
