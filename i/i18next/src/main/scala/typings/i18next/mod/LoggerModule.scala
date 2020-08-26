package typings.i18next.mod

import typings.i18next.i18nextStrings.logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerModule extends Module {
  @JSName("type")
  var type_LoggerModule: logger = js.native
  def error(args: js.Any*): Unit = js.native
  def log(args: js.Any*): Unit = js.native
  def warn(args: js.Any*): Unit = js.native
}

object LoggerModule {
  @scala.inline
  def apply(
    error: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit,
    `type`: logger,
    warn: /* repeated */ js.Any => Unit
  ): LoggerModule = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerModule]
  }
  @scala.inline
  implicit class LoggerModuleOps[Self <: LoggerModule] (val x: Self) extends AnyVal {
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
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: logger): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

