package typings.ionicCliFramework.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerHandler extends js.Object {
  var formatter: js.UndefOr[LoggerFormatter] = js.undefined
  def handle(record: LogRecord): Unit
}

object LoggerHandler {
  @scala.inline
  def apply(handle: LogRecord => Unit, formatter: /* record */ LogRecord => String = null): LoggerHandler = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    __obj.asInstanceOf[LoggerHandler]
  }
}

