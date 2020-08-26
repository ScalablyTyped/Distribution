package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetOrdersResponse extends js.Object {
  /**
    * The list of matching proposals.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.native
}

object SchemaGetOrdersResponse {
  @scala.inline
  def apply(): SchemaGetOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOrdersResponse]
  }
  @scala.inline
  implicit class SchemaGetOrdersResponseOps[Self <: SchemaGetOrdersResponse] (val x: Self) extends AnyVal {
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
    def setProposalsVarargs(value: SchemaProposal*): Self = this.set("proposals", js.Array(value :_*))
    @scala.inline
    def setProposals(value: js.Array[SchemaProposal]): Self = this.set("proposals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProposals: Self = this.set("proposals", js.undefined)
  }
  
}

