package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBidMetricsResponse extends StObject {
  
  /** List of rows, each containing a set of bid metrics. */
  var bidMetricsRows: js.UndefOr[js.Array[BidMetricsRow]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListBidMetricsRequest.pageToken field in the subsequent call to the bidMetrics.list method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListBidMetricsResponse {
  
  @scala.inline
  def apply(): ListBidMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBidMetricsResponse]
  }
  
  @scala.inline
  implicit class ListBidMetricsResponseMutableBuilder[Self <: ListBidMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidMetricsRows(value: js.Array[BidMetricsRow]): Self = StObject.set(x, "bidMetricsRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidMetricsRowsUndefined: Self = StObject.set(x, "bidMetricsRows", js.undefined)
    
    @scala.inline
    def setBidMetricsRowsVarargs(value: BidMetricsRow*): Self = StObject.set(x, "bidMetricsRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
