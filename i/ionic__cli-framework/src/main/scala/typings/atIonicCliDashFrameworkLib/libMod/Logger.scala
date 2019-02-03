package typings
package atIonicCliDashFrameworkLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
class Logger ()
  extends atIonicCliDashFrameworkLib.libLoggerMod.Logger {
  def this(hasLevelHandlers: atIonicCliDashFrameworkLib.libLoggerMod.LoggerOptions) = this()
}

/* static members */
@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
object Logger extends js.Object {
  def cloneHandlers(handlers: nodeLib.ReadonlySet[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler]): nodeLib.Set[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler] = js.native
}

