package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceTransportSignalr extends js.Object {
  var client: js.UndefOr[DataSourceTransportSignalrClient] = js.native
  var hub: js.UndefOr[js.Any] = js.native
  var promise: js.UndefOr[js.Any] = js.native
  var server: js.UndefOr[DataSourceTransportSignalrServer] = js.native
}

object DataSourceTransportSignalr {
  @scala.inline
  def apply(): DataSourceTransportSignalr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportSignalr]
  }
  @scala.inline
  implicit class DataSourceTransportSignalrOps[Self <: DataSourceTransportSignalr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient(value: DataSourceTransportSignalrClient): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setHub(value: js.Any): Self = this.set("hub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHub: Self = this.set("hub", js.undefined)
    @scala.inline
    def setPromise(value: js.Any): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    @scala.inline
    def setServer(value: DataSourceTransportSignalrServer): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
  
}

