package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCreateOrdersRequest extends js.Object {
  
  /**
    * The list of proposals to create.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.native
  
  /**
    * Web property id of the seller creating these orders
    */
  var webPropertyCode: js.UndefOr[String] = js.native
}
object SchemaCreateOrdersRequest {
  
  @scala.inline
  def apply(): SchemaCreateOrdersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateOrdersRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateOrdersRequestOps[Self <: SchemaCreateOrdersRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setWebPropertyCode(value: String): Self = this.set("webPropertyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyCode: Self = this.set("webPropertyCode", js.undefined)
  }
}
