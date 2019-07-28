package typings.logger.loggerMod

import typings.logger.loggerStrings.debug
import typings.logger.loggerStrings.error
import typings.logger.loggerStrings.fatal
import typings.logger.loggerStrings.info
import typings.logger.loggerStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logger", "Logger")
@js.native
object LoggerNs extends js.Object {
  val levels: js.Tuple5[fatal, error, warn, info, debug] = js.native
}

