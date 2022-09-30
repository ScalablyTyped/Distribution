package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.loggingMod.LogEntry
import typings.matrixAppserviceBridge.loggingMod.LogEntryPart
import typings.matrixAppserviceBridge.loggingMod.LoggerMetadata
import typings.matrixAppserviceBridge.loggingMod.LoggingOpts
import typings.matrixAppserviceBridge.loggingMod.LoggingOptsFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "Logger")
@js.native
open class Logger protected ()
  extends typings.matrixAppserviceBridge.loggingMod.Logger {
  def this(module: String) = this()
  def this(module: String, additionalMeta: LoggerMetadata) = this()
  def this(
    module: String,
    additionalMeta: Unit,
    logger: typings.matrixAppserviceBridge.loggingMod.GlobalLogger
  ) = this()
  def this(
    module: String,
    additionalMeta: LoggerMetadata,
    logger: typings.matrixAppserviceBridge.loggingMod.GlobalLogger
  ) = this()
}
/* static members */
object Logger {
  
  @JSImport("matrix-appservice-bridge", "Logger")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Configure the root logger instance.
    * @param cfg The configuration parameters
    */
  inline def configure(cfg: LoggingOpts): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(cfg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure(cfg: LoggingOptsFile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(cfg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def formatLogEntryPartArray(data: LogEntryPart*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLogEntryPartArray")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def messageFormatter(info: LogEntry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("messageFormatter")(info.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("matrix-appservice-bridge", "Logger.root")
  @js.native
  val root: typings.matrixAppserviceBridge.loggingMod.GlobalLogger = js.native
}
