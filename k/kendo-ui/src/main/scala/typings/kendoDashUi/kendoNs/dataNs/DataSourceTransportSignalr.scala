package typings.kendoDashUi.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceTransportSignalr extends js.Object {
  var client: js.UndefOr[DataSourceTransportSignalrClient] = js.undefined
  var hub: js.UndefOr[js.Any] = js.undefined
  var promise: js.UndefOr[js.Any] = js.undefined
  var server: js.UndefOr[DataSourceTransportSignalrServer] = js.undefined
}

object DataSourceTransportSignalr {
  @scala.inline
  def apply(
    client: DataSourceTransportSignalrClient = null,
    hub: js.Any = null,
    promise: js.Any = null,
    server: DataSourceTransportSignalrServer = null
  ): DataSourceTransportSignalr = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (hub != null) __obj.updateDynamic("hub")(hub)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[DataSourceTransportSignalr]
  }
}

