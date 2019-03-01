package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportWithFunctionOperations extends DataSourceTransport {
  @JSName("create")
  var create_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]] = js.undefined
  @JSName("destroy")
  var destroy_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]] = js.undefined
  @JSName("read")
  var read_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportReadOptions, scala.Unit]] = js.undefined
  @JSName("update")
  var update_DataSourceTransportWithFunctionOperations: js.UndefOr[js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]] = js.undefined
}

object DataSourceTransportWithFunctionOperations {
  @scala.inline
  def apply(
    create: js.Function1[/* options */ DataSourceTransportOptions, scala.Unit] = null,
    destroy: js.Function1[/* options */ DataSourceTransportOptions, scala.Unit] = null,
    parameterMap: js.Function2[/* data */ DataSourceTransportParameterMapData, /* type */ java.lang.String, _] = null,
    push: js.Function = null,
    read: js.Function1[/* options */ DataSourceTransportReadOptions, scala.Unit] = null,
    signalr: DataSourceTransportSignalr | (js.Function1[/* options */ DataSourceTransportOptions, scala.Unit]) = null,
    submit: js.Function = null,
    update: js.Function1[/* options */ DataSourceTransportOptions, scala.Unit] = null
  ): DataSourceTransportWithFunctionOperations = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (parameterMap != null) __obj.updateDynamic("parameterMap")(parameterMap)
    if (push != null) __obj.updateDynamic("push")(push)
    if (read != null) __obj.updateDynamic("read")(read)
    if (signalr != null) __obj.updateDynamic("signalr")(signalr.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[DataSourceTransportWithFunctionOperations]
  }
}

