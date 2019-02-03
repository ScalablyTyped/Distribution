package typings
package lambdaDashLogLib.lambdaDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", "LogMessage")
@js.native
class LogMessage protected () extends js.Object {
  def this(logRecordOptions: LogRecordOptions, opts: LambdaLogOptions) = this()
  var level: java.lang.String = js.native
  var log: LogRecord = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var msg: java.lang.String = js.native
  var `throw`: js.UndefOr[scala.Nothing] = js.native
  var value: LogRecord = js.native
  def toJSON(): java.lang.String = js.native
  def toJSON(format: scala.Double): java.lang.String = js.native
}

/* static members */
@JSImport("lambda-log", "LogMessage")
@js.native
object LogMessage extends js.Object {
  def isError(`val`: js.Any): scala.Boolean = js.native
}

