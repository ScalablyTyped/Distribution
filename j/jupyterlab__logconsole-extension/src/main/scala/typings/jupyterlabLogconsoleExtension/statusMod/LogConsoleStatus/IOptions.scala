package typings.jupyterlabLogconsoleExtension.statusMod.LogConsoleStatus

import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for creating a new LogConsoleStatus item
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * A click handler for the item. By default
    * Log Console panel is launched.
    */
  def handleClick(): Unit = js.native
  
  /**
    * The logger registry providing the logs.
    */
  var loggerRegistry: ILoggerRegistry = js.native
}
object IOptions {
  
  @scala.inline
  def apply(handleClick: () => Unit, loggerRegistry: ILoggerRegistry): IOptions = {
    val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction0(handleClick), loggerRegistry = loggerRegistry.asInstanceOf[js.Any])
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
    def setHandleClick(value: () => Unit): Self = this.set("handleClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoggerRegistry(value: ILoggerRegistry): Self = this.set("loggerRegistry", value.asInstanceOf[js.Any])
  }
}
