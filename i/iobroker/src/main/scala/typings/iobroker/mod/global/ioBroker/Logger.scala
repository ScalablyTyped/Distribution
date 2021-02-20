package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends StObject {
  
  /** log message with debug level */
  def debug(message: String): Unit = js.native
  
  /** log message with error severity */
  def error(message: String): Unit = js.native
  
  /** log message with info level (default output level for all adapters) */
  def info(message: String): Unit = js.native
  
  /** Verbosity of the log output */
  var level: LogLevel = js.native
  
  /** log message with silly level */
  def silly(message: String): Unit = js.native
  
  /** log message with warning severity */
  def warn(message: String): Unit = js.native
}
object Logger {
  
  @scala.inline
  def apply(
    debug: String => Unit,
    error: String => Unit,
    info: String => Unit,
    level: LogLevel,
    silly: String => Unit,
    warn: String => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), level = level.asInstanceOf[js.Any], silly = js.Any.fromFunction1(silly), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: String => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilly(value: String => Unit): Self = StObject.set(x, "silly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
