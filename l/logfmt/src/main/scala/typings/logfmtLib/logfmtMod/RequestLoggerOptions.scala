package typings
package logfmtLib.logfmtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLoggerOptions extends js.Object {
  var elapsed: js.UndefOr[java.lang.String] = js.undefined
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
}

object RequestLoggerOptions {
  @scala.inline
  def apply(elapsed: java.lang.String = null, immediate: js.UndefOr[scala.Boolean] = js.undefined): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    __obj.asInstanceOf[RequestLoggerOptions]
  }
}

