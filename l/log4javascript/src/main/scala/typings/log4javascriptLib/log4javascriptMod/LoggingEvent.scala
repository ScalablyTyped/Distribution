package typings
package log4javascriptLib.log4javascriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4javascript", "LoggingEvent")
@js.native
class LoggingEvent protected () extends js.Object {
  def this(logger: Logger, timeStamp: stdLib.Date, level: Level, messages: js.Array[java.lang.String]) = this()
  def this(logger: Logger, timeStamp: stdLib.Date, level: Level, messages: js.Array[java.lang.String], exception: stdLib.Error) = this()
  var exception: stdLib.Error = js.native
  var level: Level = js.native
  var logger: Logger = js.native
  var messages: js.Array[_] = js.native
  var milliseconds: scala.Double = js.native
  var timeStamp: stdLib.Date = js.native
  var timeStampInMilliseconds: scala.Double = js.native
  var timeStampInSeconds: scala.Double = js.native
  def getCombinedMessages(): java.lang.String = js.native
  def getThrowableStrRep(): java.lang.String = js.native
}

