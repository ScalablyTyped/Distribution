package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImpressionMetricsResponse extends StObject {
  
  /** List of rows, each containing a set of impression metrics. */
  var impressionMetricsRows: js.UndefOr[js.Array[ImpressionMetricsRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListImpressionMetricsRequest.pageToken field in the subsequent call to the impressionMetrics.list method to
    * retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListImpressionMetricsResponse {
  
  @scala.inline
  def apply(): ListImpressionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImpressionMetricsResponse]
  }
  
  @scala.inline
  implicit class ListImpressionMetricsResponseMutableBuilder[Self <: ListImpressionMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImpressionMetricsRows(value: js.Array[ImpressionMetricsRow]): Self = StObject.set(x, "impressionMetricsRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionMetricsRowsUndefined: Self = StObject.set(x, "impressionMetricsRows", js.undefined)
    
    @scala.inline
    def setImpressionMetricsRowsVarargs(value: ImpressionMetricsRow*): Self = StObject.set(x, "impressionMetricsRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
