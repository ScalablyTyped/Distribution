package typings.jupyterlabLauncher.mod.ILauncher

import typings.jupyterlabLauncher.mod.LauncherModel
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create a Launcher.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The callback used when an item is launched.
    */
  def callback(widget: Widget): Unit = js.native
  
  /**
    * The command registry used by the launcher.
    */
  var commands: CommandRegistry = js.native
  
  /**
    * The cwd of the launcher.
    */
  var cwd: String = js.native
  
  /**
    * The model of the launcher.
    */
  var model: LauncherModel = js.native
}
object IOptions {
  
  @scala.inline
  def apply(callback: Widget => Unit, commands: CommandRegistry, cwd: String, model: LauncherModel): IOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), commands = commands.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: Widget => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommands(value: CommandRegistry): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: LauncherModel): Self = this.set("model", value.asInstanceOf[js.Any])
  }
}
