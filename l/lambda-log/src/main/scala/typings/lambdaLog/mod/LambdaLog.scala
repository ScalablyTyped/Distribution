package typings.lambdaLog.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.Console_
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", "LambdaLog")
@js.native
class LambdaLog ()
  extends EventEmitter
     with /* key */ StringDictionary[js.Any] {
  def this(options: LambdaLogOptions) = this()
  def this(options: LambdaLogOptions, levels: js.Any) = this()
  var LambdaLog: typings.lambdaLog.mod.LambdaLog = js.native
  var _levels: js.Any = js.native
  var _logLevels: js.Any = js.native
  var console: Console_ = js.native
  var options: LambdaLogOptions = js.native
  def assert(test: js.Any, msg: String): Boolean | LogMessage = js.native
  def assert(test: js.Any, msg: String, meta: js.Object): Boolean | LogMessage = js.native
  def assert(test: js.Any, msg: String, meta: js.Object, tags: js.Array[String]): Boolean | LogMessage = js.native
  def debug(msg: String): LogMessage = js.native
  def debug(msg: String, meta: js.Object): LogMessage = js.native
  def debug(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  def error(msg: String): LogMessage = js.native
  def error(msg: String, meta: js.Object): LogMessage = js.native
  def error(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  def error(msg: Error): LogMessage = js.native
  def error(msg: Error, meta: js.Object): LogMessage = js.native
  def error(msg: Error, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  def info(msg: String): LogMessage = js.native
  def info(msg: String, meta: js.Object): LogMessage = js.native
  def info(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  def log(level: String, msg: String): LogMessage = js.native
  def log(level: String, msg: String, meta: js.Object): LogMessage = js.native
  def log(level: String, msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  def warn(msg: String): LogMessage = js.native
  def warn(msg: String, meta: js.Object): LogMessage = js.native
  def warn(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
}

