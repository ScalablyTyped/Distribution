package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerHandler extends js.Object {
  var formatter: js.UndefOr[LoggerFormatter] = js.undefined
  def handle(record: LogRecord): scala.Unit
}

