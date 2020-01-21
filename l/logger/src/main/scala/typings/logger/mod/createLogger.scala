package typings.logger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logger", "createLogger")
@js.native
object createLogger extends js.Object {
  def apply(): Logger = js.native
  def apply(logFilePath: String): Logger = js.native
}

