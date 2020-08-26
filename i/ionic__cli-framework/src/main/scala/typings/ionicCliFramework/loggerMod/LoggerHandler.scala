package typings.ionicCliFramework.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerHandler extends js.Object {
  var formatter: js.UndefOr[LoggerFormatter] = js.native
  def handle(record: LogRecord): Unit = js.native
}

object LoggerHandler {
  @scala.inline
  def apply(handle: LogRecord => Unit): LoggerHandler = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[LoggerHandler]
  }
  @scala.inline
  implicit class LoggerHandlerOps[Self <: LoggerHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandle(value: LogRecord => Unit): Self = this.set("handle", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatter(value: /* record */ LogRecord => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
  }
  
}

