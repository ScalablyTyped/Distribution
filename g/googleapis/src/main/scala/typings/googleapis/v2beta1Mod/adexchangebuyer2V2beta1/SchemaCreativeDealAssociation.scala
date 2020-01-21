package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The association between a creative and a deal.
  */
@js.native
trait SchemaCreativeDealAssociation extends js.Object {
  /**
    * The account the creative belongs to.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The ID of the creative associated with the deal.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * The externalDealId for the deal associated with the creative.
    */
  var dealsId: js.UndefOr[String] = js.native
}

object SchemaCreativeDealAssociation {
  @scala.inline
  def apply(accountId: String = null, creativeId: String = null, dealsId: String = null): SchemaCreativeDealAssociation = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (dealsId != null) __obj.updateDynamic("dealsId")(dealsId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeDealAssociation]
  }
}

