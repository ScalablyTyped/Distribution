package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransport extends js.Object {
  var create: js.UndefOr[
    DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit])
  ] = js.undefined
  var destroy: js.UndefOr[
    DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit])
  ] = js.undefined
  var parameterMap: js.UndefOr[
    js.Function2[/* data */ DataSourceTransportParameterMapData, /* type */ java.lang.String, _]
  ] = js.undefined
  var push: js.UndefOr[js.Function] = js.undefined
  var read: js.UndefOr[
    DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit])
  ] = js.undefined
  var signalr: js.UndefOr[
    DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit])
  ] = js.undefined
  var submit: js.UndefOr[js.Function] = js.undefined
  var update: js.UndefOr[
    DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit])
  ] = js.undefined
}

