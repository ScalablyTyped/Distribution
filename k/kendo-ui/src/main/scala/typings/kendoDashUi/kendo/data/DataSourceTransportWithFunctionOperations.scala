package typings.kendoDashUi.kendo.data

import typings.kendoDashUi.kendoDashUiStrings.create
import typings.kendoDashUi.kendoDashUiStrings.destroy
import typings.kendoDashUi.kendoDashUiStrings.read
import typings.kendoDashUi.kendoDashUiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportWithFunctionOperations extends DataSourceTransport {
  @JSName("create")
  var create_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
  @JSName("destroy")
  var destroy_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
  @JSName("read")
  var read_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportReadOptions, Unit]] = js.undefined
  @JSName("update")
  var update_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, Unit]] = js.undefined
}

object DataSourceTransportWithFunctionOperations {
  @scala.inline
  def apply(
    create: /* options */ DataSourceTransportOptions => Unit = null,
    destroy: /* options */ DataSourceTransportOptions => Unit = null,
    parameterMap: (/* data */ DataSourceTransportParameterMapData, /* type */ create | destroy | read | update) => _ = null,
    push: js.Function = null,
    read: /* options */ DataSourceTransportReadOptions => Unit = null,
    signalr: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    submit: js.Function = null,
    update: /* options */ DataSourceTransportOptions => Unit = null
  ): DataSourceTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (parameterMap != null) __obj.updateDynamic("parameterMap")(js.Any.fromFunction2(parameterMap))
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction1(read))
    if (signalr != null) __obj.updateDynamic("signalr")(signalr.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[DataSourceTransportWithFunctionOperations]
  }
}

