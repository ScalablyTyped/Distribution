package typings
package atIonicCliDashFrameworkLib.atIonicCliDashFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "Logger")
@js.native
class Logger ()
  extends atIonicCliDashFrameworkLib.libMod.Logger {
  def this(hasLevelHandlers: atIonicCliDashFrameworkLib.libLoggerMod.LoggerOptions) = this()
}

/* static members */
@JSImport("@ionic/cli-framework", "Logger")
@js.native
object Logger extends js.Object {
  def cloneHandlers(handlers: nodeLib.ReadonlySet[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler]): nodeLib.Set[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler] = js.native
}

