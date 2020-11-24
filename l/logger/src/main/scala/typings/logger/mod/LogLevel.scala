package typings.logger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.logger.loggerStrings.fatal
  - typings.logger.loggerStrings.error
  - typings.logger.loggerStrings.warn
  - typings.logger.loggerStrings.info
  - typings.logger.loggerStrings.debug
*/
trait LogLevel extends js.Object
object LogLevel {
  
  @scala.inline
  def debug: typings.logger.loggerStrings.debug = "debug".asInstanceOf[typings.logger.loggerStrings.debug]
  
  @scala.inline
  def error: typings.logger.loggerStrings.error = "error".asInstanceOf[typings.logger.loggerStrings.error]
  
  @scala.inline
  def fatal: typings.logger.loggerStrings.fatal = "fatal".asInstanceOf[typings.logger.loggerStrings.fatal]
  
  @scala.inline
  def info: typings.logger.loggerStrings.info = "info".asInstanceOf[typings.logger.loggerStrings.info]
  
  @scala.inline
  def warn: typings.logger.loggerStrings.warn = "warn".asInstanceOf[typings.logger.loggerStrings.warn]
}
