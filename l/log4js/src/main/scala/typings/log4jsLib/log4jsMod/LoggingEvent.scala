package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingEvent extends js.Object {
  var categoryName: java.lang.String
  var cluster: js.UndefOr[log4jsLib.Anon_WorkerId] = js.undefined
  var context: js.Any
  	// level of message
  var data: js.Array[_]
  	// name of category
  var level: Level
  var pid: scala.Double
  	// objects to log
  var startTime: stdLib.Date
}

