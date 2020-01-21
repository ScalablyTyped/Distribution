package typings.lambdaLog.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", "error")
@js.native
object error extends js.Object {
  def apply(msg: String): LogMessage = js.native
  def apply(msg: String, meta: js.Object): LogMessage = js.native
  def apply(msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
  def apply(msg: Error): LogMessage = js.native
  def apply(msg: Error, meta: js.Object): LogMessage = js.native
  def apply(msg: Error, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
}

