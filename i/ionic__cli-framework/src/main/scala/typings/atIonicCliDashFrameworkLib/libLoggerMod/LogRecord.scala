package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogRecord extends js.Object {
  var format: js.UndefOr[scala.Boolean] = js.undefined
  var level: js.UndefOr[LoggerLevelWeight] = js.undefined
  var logger: Logger
  var msg: java.lang.String
}

