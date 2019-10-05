package typings.kendoDashUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotTransportWithObjectOperations extends PivotTransport {
  var connection: PivotTransportConnection
  @JSName("discover")
  var discover_PivotTransportWithObjectOperations: js.UndefOr[PivotTransportDiscover] = js.undefined
  @JSName("read")
  var read_PivotTransportWithObjectOperations: js.UndefOr[DataSourceTransportRead] = js.undefined
}

object PivotTransportWithObjectOperations {
  @scala.inline
  def apply(
    connection: PivotTransportConnection,
    discover: PivotTransportDiscover = null,
    read: DataSourceTransportRead = null
  ): PivotTransportWithObjectOperations = {
    val __obj = js.Dynamic.literal(connection = connection)
    if (discover != null) __obj.updateDynamic("discover")(discover)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[PivotTransportWithObjectOperations]
  }
}

