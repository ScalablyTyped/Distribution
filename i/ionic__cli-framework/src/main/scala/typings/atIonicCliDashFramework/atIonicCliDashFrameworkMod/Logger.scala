package typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod

import typings.atIonicCliDashFramework.libLoggerMod.LoggerHandler
import typings.atIonicCliDashFramework.libLoggerMod.LoggerOptions
import typings.std.ReadonlySet
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "Logger")
@js.native
class Logger ()
  extends typings.atIonicCliDashFramework.libMod.Logger {
  def this(hasLevelHandlers: LoggerOptions) = this()
}

/* static members */
@JSImport("@ionic/cli-framework", "Logger")
@js.native
object Logger extends js.Object {
  def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
}

