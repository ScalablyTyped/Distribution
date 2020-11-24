package typings.log4javascript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("log4javascript", "Layout")
@js.native
class Layout () extends js.Object {
  
  /**
  	 * Returns whether the layout's output is suitable for batching. JsonLayout and XmlLayout are the only built-in layouts that
  	 * return true for this method.
  	 */
  def allowBatching(): Boolean = js.native
  
  /**
  	 * Formats the log message. You should override this method in your own layouts.
  	 */
  def format(loggingEvent: LoggingEvent): String = js.native
  
  def formatWithException(loggingEvent: LoggingEvent): String = js.native
  
  /**
  	 * Returns the content type of the output of the layout.
  	 */
  def getContentType(): String = js.native
  
  /**
  	 * Used internally by log4javascript in constructing formatted output for some layouts.
  	 */
  def getDataValues(loggingEvent: LoggingEvent): js.Array[_] = js.native
  
  /**
  	 * Returns whether the layout has any custom fields.
  	 */
  def hasCustomFields(): Boolean = js.native
  
  /**
  	 * Returns whether the layout ignores an error object in a logging event passed to its format method.
  	 */
  def ignoresThrowable(): Boolean = js.native
  
  /**
  	 * Some layouts (JsonLayout, HttpPostDataLayout, PatternLayout and XmlLayout) allow you to set custom fields (e.g. a session
  	 * id to send to the server) to the formatted output. Use this method to set a custom field. If there is already a custom
  	 * field with the specified name, its value will be updated with value.
  	 * @param name Name of the custom property you wish to be included in the formmtted output.
  	 * @param value Value of the custom property you wish to be included in the formatted output.
  	 */
  def setCustomField(name: String, value: String): String = js.native
  
  /**
  	 * This method is used to change the default keys used to create formatted name-value pairs for the properties of a log
  	 * message, for layouts that do this. These layouts are JsonLayout and HttpPostDataLayout.
  	 * @param loggerKey Parameter to use for the log message's logger name. Default is logger.
  	 * @param timeStampKey Parameter to use for the log message's timestamp. Default is timestamp.
  	 * @param levelKey Parameter to use for the log message's level. Default is level.
  	 * @param messageKey Parameter to use for the message itself. Default is message.
  	 * @param exceptionKey Parameter to use for the log message's error (exception). Default is exception.
  	 * @param urlKey Parameter to use for the current page URL. Default is url.
  	 */
  def setKeys(
    loggerKey: String,
    timeStampKey: String,
    levelKey: String,
    messageKey: String,
    exceptionKey: String,
    urlKey: String
  ): Unit = js.native
}
