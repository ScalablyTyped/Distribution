package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for associating a deal and a creative.
  */
@js.native
trait SchemaAddDealAssociationRequest extends js.Object {
  /**
    * The association between a creative and a deal that should be added.
    */
  var association: js.UndefOr[SchemaCreativeDealAssociation] = js.native
}

object SchemaAddDealAssociationRequest {
  @scala.inline
  def apply(association: SchemaCreativeDealAssociation = null): SchemaAddDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (association != null) __obj.updateDynamic("association")(association.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddDealAssociationRequest]
  }
}

