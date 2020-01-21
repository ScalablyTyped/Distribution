package typings.lambdaLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", "LogMessage")
@js.native
class LogMessage protected () extends js.Object {
  def this(logRecordOptions: LogRecordOptions, opts: LambdaLogOptions) = this()
  var level: String = js.native
  var log: LogRecord = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var msg: String = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var `throw`: js.UndefOr[scala.Nothing] = js.native
  var value: LogRecord = js.native
  def toJSON(): String = js.native
  def toJSON(format: Boolean): String = js.native
}

/* static members */
@JSImport("lambda-log", "LogMessage")
@js.native
object LogMessage extends js.Object {
  def isError(`val`: js.Any): Boolean = js.native
}

