package typings.log4javascript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("log4javascript", "Appender")
@js.native
class Appender () extends js.Object {
  
  /**
  	 * Appender-specific method to append a log message. Every appender object should implement this method.
  	 */
  def append(loggingEvent: LoggingEvent): Unit = js.native
  
  /**
  	 * Checks the logging event's level is at least as severe as the appender's threshold and calls the appender's append method if so.
  	 * This method should not in general be used directly or overridden.
  	 */
  def doAppend(loggingEvent: LoggingEvent): Unit = js.native
  
  /**
  	 * Returns the appender's layout.
  	 */
  def getLayout(): Layout = js.native
  
  /**
  	 * Returns the appender's threshold.
  	 */
  def getThreshold(): Level = js.native
  
  /**
  	 * Sets the appender's layout.
  	 */
  def setLayout(layout: Layout): Unit = js.native
  
  /**
  	 * Sets the appender's threshold. Log messages of level less severe than this threshold will not be logged.
  	 */
  def setThreshold(level: Level): Unit = js.native
}
