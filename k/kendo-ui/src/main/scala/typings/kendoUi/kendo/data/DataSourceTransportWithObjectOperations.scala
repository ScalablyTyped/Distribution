package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceTransportWithObjectOperations extends DataSourceTransport {
  @JSName("create")
  var create_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportCreate] = js.native
  @JSName("destroy")
  var destroy_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportDestroy] = js.native
  @JSName("read")
  var read_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportRead] = js.native
  @JSName("update")
  var update_DataSourceTransportWithObjectOperations: js.UndefOr[DataSourceTransportUpdate] = js.native
}

object DataSourceTransportWithObjectOperations {
  @scala.inline
  def apply(): DataSourceTransportWithObjectOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceTransportWithObjectOperations]
  }
  @scala.inline
  implicit class DataSourceTransportWithObjectOperationsOps[Self <: DataSourceTransportWithObjectOperations] (val x: Self) extends AnyVal {
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
    def setCreate(value: DataSourceTransportCreate): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDestroy(value: DataSourceTransportDestroy): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setRead(value: DataSourceTransportRead): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setUpdate(value: DataSourceTransportUpdate): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

