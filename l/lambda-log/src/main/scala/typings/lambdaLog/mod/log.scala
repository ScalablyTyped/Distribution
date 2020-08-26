package typings.lambdaLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-log", "log")
@js.native
object log extends js.Object {
  def apply(level: String, msg: String): LogMessage = js.native
  def apply(level: String, msg: String, meta: js.UndefOr[scala.Nothing], tags: js.Array[String]): LogMessage = js.native
  def apply(level: String, msg: String, meta: js.Object): LogMessage = js.native
  def apply(level: String, msg: String, meta: js.Object, tags: js.Array[String]): LogMessage = js.native
}

