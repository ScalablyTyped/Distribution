package typings
package log4javascriptLib.log4javascriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4javascript", "JsonLayout")
@js.native
class JsonLayout () extends Layout {
  /**
  	 * Constructor
  	 * @param readable Whether or not to format each log message with line breaks and tabs. If not specified, defaults to false.
  	 * @param combineMessages Whether or not to format multiple log messages as a combined single message property composed of
  	 * each individual message separated by line breaks or to format multiple messages as an array. If not specified, defaults to true.
  	 */
  def this(readable: scala.Boolean) = this()
  /**
  	 * Constructor
  	 * @param readable Whether or not to format each log message with line breaks and tabs. If not specified, defaults to false.
  	 * @param combineMessages Whether or not to format multiple log messages as a combined single message property composed of
  	 * each individual message separated by line breaks or to format multiple messages as an array. If not specified, defaults to true.
  	 */
  def this(readable: scala.Boolean, combineMessages: scala.Boolean) = this()
  /**
  	 * Returns whether or not to each log message is formatted with line breaks and tabs.
  	 */
  def isReadable(): scala.Boolean = js.native
}

