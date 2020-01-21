package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to accept a proposal.
  */
@js.native
trait SchemaAcceptProposalRequest extends js.Object {
  /**
    * The last known client revision number of the proposal.
    */
  var proposalRevision: js.UndefOr[String] = js.native
}

object SchemaAcceptProposalRequest {
  @scala.inline
  def apply(proposalRevision: String = null): SchemaAcceptProposalRequest = {
    val __obj = js.Dynamic.literal()
    if (proposalRevision != null) __obj.updateDynamic("proposalRevision")(proposalRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAcceptProposalRequest]
  }
}

