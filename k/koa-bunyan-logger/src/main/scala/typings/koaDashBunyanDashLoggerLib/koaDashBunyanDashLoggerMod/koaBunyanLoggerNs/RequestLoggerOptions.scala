package typings
package koaDashBunyanDashLoggerLib.koaDashBunyanDashLoggerMod.koaBunyanLoggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLoggerOptions extends js.Object {
  var durationField: js.UndefOr[java.lang.String] = js.undefined
  var formatRequestMessage: js.UndefOr[js.Function1[/* requestData */ RequestData, java.lang.String]] = js.undefined
  var formatResponseMessage: js.UndefOr[js.Function1[/* responseData */ ResponseData, java.lang.String]] = js.undefined
  var levelFn: js.UndefOr[
    js.Function2[/* status */ scala.Double, /* err */ nodeLib.Error, java.lang.String]
  ] = js.undefined
  var updateLogFields: js.UndefOr[js.Function1[/* data */ RequestData, RequestData]] = js.undefined
  var updateRequestLogFields: js.UndefOr[js.Function1[/* requestData */ RequestData, RequestData]] = js.undefined
  var updateResponseLogFields: js.UndefOr[js.Function1[/* responseData */ ResponseData, ResponseData]] = js.undefined
}

object RequestLoggerOptions {
  @scala.inline
  def apply(
    durationField: java.lang.String = null,
    formatRequestMessage: js.Function1[/* requestData */ RequestData, java.lang.String] = null,
    formatResponseMessage: js.Function1[/* responseData */ ResponseData, java.lang.String] = null,
    levelFn: js.Function2[/* status */ scala.Double, /* err */ nodeLib.Error, java.lang.String] = null,
    updateLogFields: js.Function1[/* data */ RequestData, RequestData] = null,
    updateRequestLogFields: js.Function1[/* requestData */ RequestData, RequestData] = null,
    updateResponseLogFields: js.Function1[/* responseData */ ResponseData, ResponseData] = null
  ): RequestLoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (durationField != null) __obj.updateDynamic("durationField")(durationField)
    if (formatRequestMessage != null) __obj.updateDynamic("formatRequestMessage")(formatRequestMessage)
    if (formatResponseMessage != null) __obj.updateDynamic("formatResponseMessage")(formatResponseMessage)
    if (levelFn != null) __obj.updateDynamic("levelFn")(levelFn)
    if (updateLogFields != null) __obj.updateDynamic("updateLogFields")(updateLogFields)
    if (updateRequestLogFields != null) __obj.updateDynamic("updateRequestLogFields")(updateRequestLogFields)
    if (updateResponseLogFields != null) __obj.updateDynamic("updateResponseLogFields")(updateResponseLogFields)
    __obj.asInstanceOf[RequestLoggerOptions]
  }
}

