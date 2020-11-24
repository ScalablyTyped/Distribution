package typings.log4javascript.mod

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("log4javascript", "LoggingEvent")
@js.native
class LoggingEvent protected () extends js.Object {
  def this(logger: Logger, timeStamp: Date, level: Level, messages: js.Array[String]) = this()
  def this(logger: Logger, timeStamp: Date, level: Level, messages: js.Array[String], exception: Error) = this()
  
  var exception: Error = js.native
  
  def getCombinedMessages(): String = js.native
  
  def getThrowableStrRep(): String = js.native
  
  var level: Level = js.native
  
  var logger: Logger = js.native
  
  var messages: js.Array[_] = js.native
  
  var milliseconds: Double = js.native
  
  var timeStamp: Date = js.native
  
  var timeStampInMilliseconds: Double = js.native
  
  var timeStampInSeconds: Double = js.native
}
