package typings.inversifyLoggerMiddleware.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerSettings extends js.Object {
  var request: js.UndefOr[RequestLoggerSettings] = js.undefined
  var time: js.UndefOr[Boolean] = js.undefined
}

object LoggerSettings {
  @scala.inline
  def apply(request: RequestLoggerSettings = null, time: js.UndefOr[Boolean] = js.undefined): LoggerSettings = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerSettings]
  }
}

