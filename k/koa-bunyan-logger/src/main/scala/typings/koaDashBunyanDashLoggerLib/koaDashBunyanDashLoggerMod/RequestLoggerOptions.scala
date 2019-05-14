package typings
package koaDashBunyanDashLoggerLib.koaDashBunyanDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLoggerOptions extends js.Object {
  var durationField: js.UndefOr[java.lang.String] = js.undefined
  var formatRequestMessage: js.UndefOr[js.Function1[/* requestData */ RequestData, java.lang.String]] = js.undefined
  var formatResponseMessage: js.UndefOr[js.Function1[/* responseData */ ResponseData, java.lang.String]] = js.undefined
  var ignorePath: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var levelFn: js.UndefOr[
    js.Function2[/* status */ scala.Double, /* err */ stdLib.Error, java.lang.String]
  ] = js.undefined
  var updateLogFields: js.UndefOr[js.Function1[/* data */ RequestData, RequestData]] = js.undefined
  var updateRequestLogFields: js.UndefOr[js.Function1[/* requestData */ RequestData, RequestData]] = js.undefined
  var updateResponseLogFields: js.UndefOr[js.Function1[/* responseData */ ResponseData, ResponseData]] = js.undefined
}

object RequestLoggerOptions {
  @scala.inline
  def apply(
    durationField: java.lang.String = null,
    formatRequestMessage: /* requestData */ RequestData => java.lang.String = null,
    formatResponseMessage: /* responseData */ ResponseData => java.lang.String = null,
    ignorePath: js.Array[java.lang.String] = null,
    levelFn: (/* status */ scala.Double, /* err */ stdLib.Error) => java.lang.String = null,
    updateLogFields: /* data */ RequestData => RequestData = null,
    updateRequestLogFields: /* requestData */ RequestData => RequestData = null,
    updateResponseLogFields: /* responseData */ ResponseData => ResponseData = null
  ): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (durationField != null) __obj.updateDynamic("durationField")(durationField)
    if (formatRequestMessage != null) __obj.updateDynamic("formatRequestMessage")(js.Any.fromFunction1(formatRequestMessage))
    if (formatResponseMessage != null) __obj.updateDynamic("formatResponseMessage")(js.Any.fromFunction1(formatResponseMessage))
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath)
    if (levelFn != null) __obj.updateDynamic("levelFn")(js.Any.fromFunction2(levelFn))
    if (updateLogFields != null) __obj.updateDynamic("updateLogFields")(js.Any.fromFunction1(updateLogFields))
    if (updateRequestLogFields != null) __obj.updateDynamic("updateRequestLogFields")(js.Any.fromFunction1(updateRequestLogFields))
    if (updateResponseLogFields != null) __obj.updateDynamic("updateResponseLogFields")(js.Any.fromFunction1(updateResponseLogFields))
    __obj.asInstanceOf[RequestLoggerOptions]
  }
}

