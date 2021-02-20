package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFilteredBidsResponse extends StObject {
  
  /** List of rows, with counts of filtered bids aggregated by filtering reason (i.e. creative status). */
  var creativeStatusRows: js.UndefOr[js.Array[CreativeStatusRow]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListFilteredBidsRequest.pageToken field in the subsequent call to the filteredBids.list method to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListFilteredBidsResponse {
  
  @scala.inline
  def apply(): ListFilteredBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFilteredBidsResponse]
  }
  
  @scala.inline
  implicit class ListFilteredBidsResponseMutableBuilder[Self <: ListFilteredBidsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeStatusRows(value: js.Array[CreativeStatusRow]): Self = StObject.set(x, "creativeStatusRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeStatusRowsUndefined: Self = StObject.set(x, "creativeStatusRows", js.undefined)
    
    @scala.inline
    def setCreativeStatusRowsVarargs(value: CreativeStatusRow*): Self = StObject.set(x, "creativeStatusRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
