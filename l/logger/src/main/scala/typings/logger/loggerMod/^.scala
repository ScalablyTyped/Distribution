package typings.logger.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logger", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createLogger(): Logger = js.native
  def createLogger(logFilePath: String): Logger = js.native
}

