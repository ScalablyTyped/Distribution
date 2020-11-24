package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing proposals.
  */
@js.native
trait SchemaListProposalsResponse extends js.Object {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of proposals.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.native
}
object SchemaListProposalsResponse {
  
  @scala.inline
  def apply(): SchemaListProposalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProposalsResponse]
  }
  
  @scala.inline
  implicit class SchemaListProposalsResponseOps[Self <: SchemaListProposalsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setProposalsVarargs(value: SchemaProposal*): Self = this.set("proposals", js.Array(value :_*))
    
    @scala.inline
    def setProposals(value: js.Array[SchemaProposal]): Self = this.set("proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposals: Self = this.set("proposals", js.undefined)
  }
}
