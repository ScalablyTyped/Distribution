package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProposalsResponse extends StObject {
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of proposals. */
  var proposals: js.UndefOr[js.Array[Proposal]] = js.undefined
}
object ListProposalsResponse {
  
  @scala.inline
  def apply(): ListProposalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProposalsResponse]
  }
  
  @scala.inline
  implicit class ListProposalsResponseMutableBuilder[Self <: ListProposalsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProposals(value: js.Array[Proposal]): Self = StObject.set(x, "proposals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposalsUndefined: Self = StObject.set(x, "proposals", js.undefined)
    
    @scala.inline
    def setProposalsVarargs(value: Proposal*): Self = StObject.set(x, "proposals", js.Array(value :_*))
  }
}
