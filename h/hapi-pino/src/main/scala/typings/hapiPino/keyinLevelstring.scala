package typings.hapiPino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in pino.pino.Level ]:? string} */
trait keyinLevelstring extends js.Object {
  var debug: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var fatal: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var trace: js.UndefOr[String] = js.undefined
  var warn: js.UndefOr[String] = js.undefined
}

object keyinLevelstring {
  @scala.inline
  def apply(
    debug: String = null,
    error: String = null,
    fatal: String = null,
    info: String = null,
    trace: String = null,
    warn: String = null
  ): keyinLevelstring = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fatal != null) __obj.updateDynamic("fatal")(fatal.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[keyinLevelstring]
  }
}

