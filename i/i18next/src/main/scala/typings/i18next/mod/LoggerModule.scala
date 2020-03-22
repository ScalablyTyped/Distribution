package typings.i18next.mod

import typings.i18next.i18nextStrings.logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerModule extends Module {
  @JSName("type")
  var type_LoggerModule: logger
  def error(args: js.Any*): Unit
  def log(args: js.Any*): Unit
  def warn(args: js.Any*): Unit
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
}

