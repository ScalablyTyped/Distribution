package typings.koaBunyanLogger.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLoggerOptions extends js.Object {
  var durationField: js.UndefOr[String] = js.undefined
  var formatRequestMessage: js.UndefOr[js.Function1[/* requestData */ RequestData, String]] = js.undefined
  var formatResponseMessage: js.UndefOr[js.Function1[/* responseData */ ResponseData, String]] = js.undefined
  var ignorePath: js.UndefOr[js.Array[String]] = js.undefined
  var levelFn: js.UndefOr[js.Function2[/* status */ Double, /* err */ Error, String]] = js.undefined
  var updateLogFields: js.UndefOr[js.Function1[/* data */ RequestData, RequestData]] = js.undefined
  var updateRequestLogFields: js.UndefOr[js.Function1[/* requestData */ RequestData, RequestData]] = js.undefined
  var updateResponseLogFields: js.UndefOr[js.Function1[/* responseData */ ResponseData, ResponseData]] = js.undefined
}

object RequestLoggerOptions {
  @scala.inline
  def apply(
    durationField: String = null,
    formatRequestMessage: /* requestData */ RequestData => String = null,
    formatResponseMessage: /* responseData */ ResponseData => String = null,
    ignorePath: js.Array[String] = null,
    levelFn: (/* status */ Double, /* err */ Error) => String = null,
    updateLogFields: /* data */ RequestData => RequestData = null,
    updateRequestLogFields: /* requestData */ RequestData => RequestData = null,
    updateResponseLogFields: /* responseData */ ResponseData => ResponseData = null
  ): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (durationField != null) __obj.updateDynamic("durationField")(durationField.asInstanceOf[js.Any])
    if (formatRequestMessage != null) __obj.updateDynamic("formatRequestMessage")(js.Any.fromFunction1(formatRequestMessage))
    if (formatResponseMessage != null) __obj.updateDynamic("formatResponseMessage")(js.Any.fromFunction1(formatResponseMessage))
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    if (levelFn != null) __obj.updateDynamic("levelFn")(js.Any.fromFunction2(levelFn))
    if (updateLogFields != null) __obj.updateDynamic("updateLogFields")(js.Any.fromFunction1(updateLogFields))
    if (updateRequestLogFields != null) __obj.updateDynamic("updateRequestLogFields")(js.Any.fromFunction1(updateRequestLogFields))
    if (updateResponseLogFields != null) __obj.updateDynamic("updateResponseLogFields")(js.Any.fromFunction1(updateResponseLogFields))
    __obj.asInstanceOf[RequestLoggerOptions]
  }
}

