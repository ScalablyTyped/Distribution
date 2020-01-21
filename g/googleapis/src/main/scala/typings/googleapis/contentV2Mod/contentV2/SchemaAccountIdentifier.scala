package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountIdentifier extends js.Object {
  /**
    * The aggregator ID, set for aggregators and subaccounts (in that case, it
    * represents the aggregator of the subaccount).
    */
  var aggregatorId: js.UndefOr[String] = js.native
  /**
    * The merchant account ID, set for individual accounts and subaccounts.
    */
  var merchantId: js.UndefOr[String] = js.native
}

object SchemaAccountIdentifier {
  @scala.inline
  def apply(aggregatorId: String = null, merchantId: String = null): SchemaAccountIdentifier = {
    val __obj = js.Dynamic.literal()
    if (aggregatorId != null) __obj.updateDynamic("aggregatorId")(aggregatorId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountIdentifier]
  }
}

