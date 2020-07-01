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
  def apply(
    connectorName: String = null,
    debugOptions: SchemaDebugOptions = null,
    limit: js.UndefOr[Double] = js.undefined,
    queue: String = null,
    statusCodes: js.Array[String] = null
  ): SchemaPollItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (connectorName != null) __obj.updateDynamic("connectorName")(connectorName.asInstanceOf[js.Any])
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (statusCodes != null) __obj.updateDynamic("statusCodes")(statusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPollItemsRequest]
  }
}

