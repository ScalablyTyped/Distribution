package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing the metrics that are measured in number of
  * bids.
  */
@js.native
trait SchemaListBidMetricsResponse extends StObject {
  
  /**
    * List of rows, each containing a set of bid metrics.
    */
  var bidMetricsRows: js.UndefOr[js.Array[SchemaBidMetricsRow]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListBidMetricsRequest.pageToken field in the subsequent call to the
    * bidMetrics.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListBidMetricsResponse {
  
  @scala.inline
  def apply(): SchemaListBidMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBidMetricsResponse]
  }
  
  @scala.inline
  implicit class SchemaListBidMetricsResponseMutableBuilder[Self <: SchemaListBidMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidMetricsRows(value: js.Array[SchemaBidMetricsRow]): Self = StObject.set(x, "bidMetricsRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidMetricsRowsUndefined: Self = StObject.set(x, "bidMetricsRows", js.undefined)
    
    @scala.inline
    def setBidMetricsRowsVarargs(value: SchemaBidMetricsRow*): Self = StObject.set(x, "bidMetricsRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
