package typings.atIonicCliDashFramework.libLoggerMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  val handlers: js.UndefOr[Set[LoggerHandler]] = js.undefined
  val level: js.UndefOr[LoggerLevelWeight] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(handlers: Set[LoggerHandler] = null, level: Int | Double = null): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

