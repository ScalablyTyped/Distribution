package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransport extends js.Object {
  var create: js.UndefOr[
    java.lang.String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit])
  ] = js.undefined
  var destroy: js.UndefOr[
    java.lang.String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit])
  ] = js.undefined
  var parameterMap: js.UndefOr[
    js.Function2[/* data */ DataSourceTransportParameterMapData, /* type */ java.lang.String, _]
  ] = js.undefined
  var push: js.UndefOr[js.Function] = js.undefined
  var read: js.UndefOr[
    java.lang.String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit])
  ] = js.undefined
  var signalr: js.UndefOr[
    DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit])
  ] = js.undefined
  var submit: js.UndefOr[js.Function] = js.undefined
  var update: js.UndefOr[
    java.lang.String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit])
  ] = js.undefined
}

object DataSourceTransport {
  @scala.inline
  def apply(
    create: java.lang.String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]) = null,
    destroy: java.lang.String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]) = null,
    parameterMap: js.Function2[/* data */ DataSourceTransportParameterMapData, /* type */ java.lang.String, _] = null,
    push: js.Function = null,
    read: java.lang.String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]) = null,
    signalr: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]) = null,
    submit: js.Function = null,
    update: java.lang.String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]) = null
  ): DataSourceTransport = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (parameterMap != null) __obj.updateDynamic("parameterMap")(parameterMap)
    if (push != null) __obj.updateDynamic("push")(push)
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (signalr != null) __obj.updateDynamic("signalr")(signalr.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit)
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransport]
  }
}

