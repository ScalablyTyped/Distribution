package typings.googleapis.v13Mod.adexchangebuyerV13

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A direct deals feed lists Direct Deals the Ad Exchange buyer account has
  * access to. This includes direct deals set up for the buyer account as well
  * as its merged stream seats.
  */
@js.native
trait SchemaDirectDealsList extends js.Object {
  /**
    * A list of direct deals relevant for your account.
    */
  var directDeals: js.UndefOr[js.Array[SchemaDirectDeal]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDirectDealsList {
  @scala.inline
  def apply(directDeals: js.Array[SchemaDirectDeal] = null, kind: String = null): SchemaDirectDealsList = {
    val __obj = js.Dynamic.literal()
    if (directDeals != null) __obj.updateDynamic("directDeals")(directDeals.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDirectDealsList]
  }
}

