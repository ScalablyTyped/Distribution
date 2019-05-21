package typings
package lambdaDashLogLib.lambdaDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val options: LambdaLogOptions = js.native
  def assert(test: js.Any, msg: java.lang.String): LogMessage = js.native
  def assert(test: js.Any, msg: java.lang.String, meta: js.Object): LogMessage = js.native
  def assert(test: js.Any, msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): LogMessage = js.native
  def debug(msg: java.lang.String): LogMessage = js.native
  def debug(msg: java.lang.String, meta: js.Object): LogMessage = js.native
  def debug(msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): LogMessage = js.native
  def error(msg: java.lang.String): LogMessage = js.native
  def error(msg: java.lang.String, meta: js.Object): LogMessage = js.native
  def error(msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): LogMessage = js.native
  def error(msg: stdLib.Error): LogMessage = js.native
  def error(msg: stdLib.Error, meta: js.Object): LogMessage = js.native
  def error(msg: stdLib.Error, meta: js.Object, tags: js.Array[java.lang.String]): LogMessage = js.native
  def info(msg: java.lang.String): LogMessage = js.native
  def info(msg: java.lang.String, meta: js.Object): LogMessage = js.native
  def info(msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): LogMessage = js.native
  def log(level: java.lang.String, msg: java.lang.String): LogMessage = js.native
  def log(level: java.lang.String, msg: java.lang.String, meta: js.Object): LogMessage = js.native
  def log(level: java.lang.String, msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): LogMessage = js.native
  def warn(msg: java.lang.String): LogMessage = js.native
  def warn(msg: java.lang.String, meta: js.Object): LogMessage = js.native
  def warn(msg: java.lang.String, meta: js.Object, tags: js.Array[java.lang.String]): LogMessage = js.native
}

