package typings.atJupyterlabLogconsoleDashExtension.libStatusMod.LogConsoleStatus

import typings.atJupyterlabLogconsole.libTokensMod.ILoggerRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a new LogConsoleStatus item
  */
trait IOptions extends js.Object {
  /**
    * The logger registry providing the logs.
    */
  var loggerRegistry: ILoggerRegistry
  /**
    * A click handler for the item. By default
    * Log Console panel is launched.
    */
  def handleClick(): Unit
}

object IOptions {
  @scala.inline
  def apply(handleClick: () => Unit, loggerRegistry: ILoggerRegistry): IOptions = {
    val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction0(handleClick), loggerRegistry = loggerRegistry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

