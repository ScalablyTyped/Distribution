package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var debug: js.UndefOr[LogFn] = js.undefined
  var deprecate: js.UndefOr[js.Function2[/* method */ String, /* alternative */ String, Unit]] = js.undefined
  var error: js.UndefOr[LogFn] = js.undefined
  var warn: js.UndefOr[LogFn] = js.undefined
}

object Logger {
  @scala.inline
  def apply(
    debug: LogFn = null,
    deprecate: (/* method */ String, /* alternative */ String) => Unit = null,
    error: LogFn = null,
    warn: LogFn = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (deprecate != null) __obj.updateDynamic("deprecate")(js.Any.fromFunction2(deprecate))
    if (error != null) __obj.updateDynamic("error")(error)
    if (warn != null) __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Logger]
  }
}

