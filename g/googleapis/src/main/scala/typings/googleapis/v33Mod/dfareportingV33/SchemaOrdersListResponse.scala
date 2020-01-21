package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Order List Response
  */
@js.native
trait SchemaOrdersListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#ordersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Order collection.
    */
  var orders: js.UndefOr[js.Array[SchemaOrder]] = js.native
}

object SchemaOrdersListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, orders: js.Array[SchemaOrder] = null): SchemaOrdersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (orders != null) __obj.updateDynamic("orders")(orders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersListResponse]
  }
}

