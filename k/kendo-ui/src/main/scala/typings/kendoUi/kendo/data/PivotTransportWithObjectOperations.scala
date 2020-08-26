package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotTransportWithObjectOperations extends PivotTransport {
  var connection: PivotTransportConnection = js.native
  @JSName("discover")
  var discover_PivotTransportWithObjectOperations: js.UndefOr[PivotTransportDiscover] = js.native
  @JSName("read")
  var read_PivotTransportWithObjectOperations: js.UndefOr[DataSourceTransportRead] = js.native
}

object PivotTransportWithObjectOperations {
  @scala.inline
  def apply(connection: PivotTransportConnection): PivotTransportWithObjectOperations = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTransportWithObjectOperations]
  }
  @scala.inline
  implicit class PivotTransportWithObjectOperationsOps[Self <: PivotTransportWithObjectOperations] (val x: Self) extends AnyVal {
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
    def setConnection(value: PivotTransportConnection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscover(value: PivotTransportDiscover): Self = this.set("discover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscover: Self = this.set("discover", js.undefined)
    @scala.inline
    def setRead(value: DataSourceTransportRead): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
  }
  
}

