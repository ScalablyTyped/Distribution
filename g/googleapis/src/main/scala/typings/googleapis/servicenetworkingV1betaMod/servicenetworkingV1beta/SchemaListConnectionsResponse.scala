package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListConnectionsResponse is the response to list peering states for the
  * given service and consumer project.
  */
@js.native
trait SchemaListConnectionsResponse extends js.Object {
  /**
    * The list of Connections.
    */
  var connections: js.UndefOr[js.Array[SchemaConnection]] = js.native
}

object SchemaListConnectionsResponse {
  @scala.inline
  def apply(connections: js.Array[SchemaConnection] = null): SchemaListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListConnectionsResponse]
  }
}

