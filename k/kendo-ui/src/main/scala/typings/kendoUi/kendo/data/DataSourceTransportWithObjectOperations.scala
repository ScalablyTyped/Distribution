package typings.kendoUi.kendo.data

import typings.kendoUi.kendoUiStrings.create
import typings.kendoUi.kendoUiStrings.destroy
import typings.kendoUi.kendoUiStrings.read
import typings.kendoUi.kendoUiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportWithObjectOperations extends DataSourceTransport {
  @JSName("create")
  var create_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportCreate] = js.undefined
  @JSName("destroy")
  var destroy_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportDestroy] = js.undefined
  @JSName("read")
  var read_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportRead] = js.undefined
  @JSName("update")
  var update_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportUpdate] = js.undefined
}

object DataSourceTransportWithObjectOperations {
  @scala.inline
  def apply(
    create: DataSourceTransportCreate = null,
    destroy: DataSourceTransportDestroy = null,
    parameterMap: (/* data */ DataSourceTransportParameterMapData, /* type */ create | destroy | read | update) => _ = null,
    push: js.Function = null,
    read: DataSourceTransportRead = null,
    signalr: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, Unit]) = null,
    submit: js.Function = null,
    update: DataSourceTransportUpdate = null
  ): DataSourceTransportWithObjectOperations = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (parameterMap != null) __obj.updateDynamic("parameterMap")(js.Any.fromFunction2(parameterMap))
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (signalr != null) __obj.updateDynamic("signalr")(signalr.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceTransportWithObjectOperations]
  }
}

