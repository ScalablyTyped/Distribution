package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message to pause serving for an already-finalized proposal.
  */
@js.native
trait SchemaPauseProposalRequest extends js.Object {
  /**
    * The reason why the proposal is being paused. This human readable message
    * will be displayed in the seller&#39;s UI. (Max length: 1000 unicode code
    * units.)
    */
  var reason: js.UndefOr[String] = js.native
}

object SchemaPauseProposalRequest {
  @scala.inline
  def apply(): SchemaPauseProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPauseProposalRequest]
  }
  @scala.inline
  implicit class SchemaPauseProposalRequestOps[Self <: SchemaPauseProposalRequest] (val x: Self) extends AnyVal {
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

