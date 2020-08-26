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
  def apply(): SchemaOrdersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersListResponse]
  }
  @scala.inline
  implicit class SchemaOrdersListResponseOps[Self <: SchemaOrdersListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setOrdersVarargs(value: SchemaOrder*): Self = this.set("orders", js.Array(value :_*))
    @scala.inline
    def setOrders(value: js.Array[SchemaOrder]): Self = this.set("orders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrders: Self = this.set("orders", js.undefined)
  }
  
}

