package typings.kendoDashUi.kendo.data

import typings.kendoDashUi.kendoDashUiStrings.create
import typings.kendoDashUi.kendoDashUiStrings.destroy
import typings.kendoDashUi.kendoDashUiStrings.read
import typings.kendoDashUi.kendoDashUiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransport extends js.Object {
  var create: js.UndefOr[
    String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  var destroy: js.UndefOr[
    String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  var parameterMap: js.UndefOr[
    js.Function2[
      /* data */ DataSourceTransportParameterMapData, 
      /* type */ create | destroy | read | update, 
      _
    ]
  ] = js.undefined
  var push: js.UndefOr[js.Function] = js.undefined
  var read: js.UndefOr[
    String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  var signalr: js.UndefOr[
    DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
  var submit: js.UndefOr[js.Function] = js.undefined
  var update: js.UndefOr[
    String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit])
  ] = js.undefined
}

object DataSourceTransport {
  @scala.inline
  def apply(
    create: String | DataSourceTransportCreate | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    destroy: String | DataSourceTransportDestroy | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    parameterMap: (/* data */ DataSourceTransportParameterMapData, /* type */ create | destroy | read | update) => _ = null,
    push: js.Function = null,
    read: String | DataSourceTransportRead | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    signalr: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    submit: js.Function = null,
    update: String | DataSourceTransportUpdate | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null
  ): DataSourceTransport = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (parameterMap != null) __obj.updateDynamic("parameterMap")(js.Any.fromFunction2(parameterMap))
    if (push != null) __obj.updateDynamic("push")(push)
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (signalr != null) __obj.updateDynamic("signalr")(signalr.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit)
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransport]
  }
}

