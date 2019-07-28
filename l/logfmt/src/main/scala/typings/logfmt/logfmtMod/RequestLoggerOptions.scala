package typings.logfmt.logfmtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLoggerOptions extends js.Object {
  var elapsed: js.UndefOr[String] = js.undefined
  var immediate: js.UndefOr[Boolean] = js.undefined
}

object RequestLoggerOptions {
  @scala.inline
  def apply(elapsed: String = null, immediate: js.UndefOr[Boolean] = js.undefined): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    __obj.asInstanceOf[RequestLoggerOptions]
  }
}

