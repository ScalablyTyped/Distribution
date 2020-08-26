package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPollItemsRequest extends js.Object {
  /**
    * Name of connector making this call. &lt;br /&gt;Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.native
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.native
  /**
    * Maximum number of items to return. &lt;br /&gt;The maximum and the
    * default value is 1000
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Queue name to fetch items from.  If unspecified, PollItems will fetch
    * from &#39;default&#39; queue. The maximum length is 100 characters.
    */
  var queue: js.UndefOr[String] = js.native
  /**
    * Limit the items polled to the ones with these statuses.
    */
  var statusCodes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPollItemsRequest {
  @scala.inline
  def apply(): SchemaPollItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollItemsRequest]
  }
  @scala.inline
  implicit class SchemaPollItemsRequestOps[Self <: SchemaPollItemsRequest] (val x: Self) extends AnyVal {
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
    def setConnectorName(value: String): Self = this.set("connectorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorName: Self = this.set("connectorName", js.undefined)
    @scala.inline
    def setDebugOptions(value: SchemaDebugOptions): Self = this.set("debugOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugOptions: Self = this.set("debugOptions", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    @scala.inline
    def setStatusCodesVarargs(value: String*): Self = this.set("statusCodes", js.Array(value :_*))
    @scala.inline
    def setStatusCodes(value: js.Array[String]): Self = this.set("statusCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCodes: Self = this.set("statusCodes", js.undefined)
  }
  
}

