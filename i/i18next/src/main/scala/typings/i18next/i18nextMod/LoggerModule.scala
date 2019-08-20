package typings.i18next.i18nextMod

import typings.i18next.i18nextStrings.logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Override the built-in console logger.
  * Do not need to be a prototype function.
  */
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
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LoggerModule]
  }
}

