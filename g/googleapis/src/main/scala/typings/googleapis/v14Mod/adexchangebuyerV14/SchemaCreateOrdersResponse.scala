package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCreateOrdersResponse extends js.Object {
  
  /**
    * The list of proposals successfully created.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.native
}
object SchemaCreateOrdersResponse {
  
  @scala.inline
  def apply(): SchemaCreateOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateOrdersResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateOrdersResponseOps[Self <: SchemaCreateOrdersResponse] (val x: Self) extends AnyVal {
    
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
