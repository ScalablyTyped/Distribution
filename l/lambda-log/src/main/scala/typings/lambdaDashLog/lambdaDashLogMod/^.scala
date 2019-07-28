package typings.lambdaDashLog.lambdaDashLogMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val options: LambdaLogOptions = js.native
  def assert(test: js.Any, msg: String): LogMessage = js.native
  def assert(test: js.Any, msg: String, meta: js.Object): LogMessage = js.native
  def assert(test: js.Any, msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
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

