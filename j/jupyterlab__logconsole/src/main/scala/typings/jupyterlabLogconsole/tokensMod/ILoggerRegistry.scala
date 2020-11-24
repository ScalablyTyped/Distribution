package typings.jupyterlabLogconsole.tokensMod

import org.scalablytyped.runtime.TopLevel
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoggerRegistry extends IDisposable {
  
  /**
    * Get the logger for the specified source.
    *
    * @param source - The name of the log source.
    *
    * @returns The logger for the specified source.
    */
  def getLogger(source: String): ILogger = js.native
  
  /**
    * Get all loggers registered.
    *
    * @returns The array containing all registered loggers.
    */
  def getLoggers(): js.Array[ILogger] = js.native
  
  /**
    * A signal emitted when the logger registry changes.
    */
  val registryChanged: ISignal[this.type, ILoggerRegistryChange] = js.native
}
@JSImport("@jupyterlab/logconsole/lib/tokens", "ILoggerRegistry")
@js.native
object ILoggerRegistry extends TopLevel[Token[ILoggerRegistry]]
