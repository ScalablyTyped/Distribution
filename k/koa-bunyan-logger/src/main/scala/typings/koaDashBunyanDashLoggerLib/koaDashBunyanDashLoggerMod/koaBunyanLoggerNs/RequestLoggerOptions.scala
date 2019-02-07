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

