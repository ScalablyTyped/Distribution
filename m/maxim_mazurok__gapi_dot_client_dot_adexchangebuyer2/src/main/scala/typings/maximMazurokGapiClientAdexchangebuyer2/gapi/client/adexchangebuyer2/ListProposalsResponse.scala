package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProposalsResponse extends js.Object {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of proposals. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.native
}
object ListProposalsResponse {
  
  @scala.inline
  def apply(): ListProposalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProposalsResponse]
  }
  
  @scala.inline
  implicit class ListProposalsResponseOps[Self <: ListProposalsResponse] (val x: Self) extends AnyVal {
    
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
    def setProposalsVarargs(value: Proposal*): Self = this.set("proposals", js.Array(value :_*))
    
    @scala.inline
    def setProposals(value: js.Array[Proposal]): Self = this.set("proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposals: Self = this.set("proposals", js.undefined)
  }
}
