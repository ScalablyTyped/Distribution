package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDeleteOrderDealsRequest extends js.Object {
  
  /**
    * List of deals to delete for a given proposal
    */
  var dealIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The last known proposal revision number.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  
  /**
    * Indicates an optional action to take on the proposal
    */
  var updateAction: js.UndefOr[String] = js.native
}
object SchemaDeleteOrderDealsRequest {
  
  @scala.inline
  def apply(): SchemaDeleteOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteOrderDealsRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteOrderDealsRequestOps[Self <: SchemaDeleteOrderDealsRequest] (val x: Self) extends AnyVal {
    
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
    def setDealIdsVarargs(value: String*): Self = this.set("dealIds", js.Array(value :_*))
    
    @scala.inline
    def setDealIds(value: js.Array[String]): Self = this.set("dealIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealIds: Self = this.set("dealIds", js.undefined)
    
    @scala.inline
    def setProposalRevisionNumber(value: String): Self = this.set("proposalRevisionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalRevisionNumber: Self = this.set("proposalRevisionNumber", js.undefined)
    
    @scala.inline
    def setUpdateAction(value: String): Self = this.set("updateAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateAction: Self = this.set("updateAction", js.undefined)
  }
}
