package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for removing the association between a deal and a creative.
  */
@js.native
trait SchemaRemoveDealAssociationRequest extends js.Object {
  /**
    * The association between a creative and a deal that should be removed.
    */
  var association: js.UndefOr[SchemaCreativeDealAssociation] = js.native
}

object SchemaRemoveDealAssociationRequest {
  @scala.inline
  def apply(association: SchemaCreativeDealAssociation = null): SchemaRemoveDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (association != null) __obj.updateDynamic("association")(association.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRemoveDealAssociationRequest]
  }
}

