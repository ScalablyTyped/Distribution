package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBidMetricsResponse extends StObject {
  
  /**
    * List of rows, each containing a set of bid metrics.
    */
  var bidMetricsRows: js.UndefOr[js.Array[SchemaBidMetricsRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListBidMetricsRequest.pageToken field in the subsequent call to the bidMetrics.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBidMetricsResponse {
  
  inline def apply(): SchemaListBidMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBidMetricsResponse]
  }
  
  extension [Self <: SchemaListBidMetricsResponse](x: Self) {
    
    inline def setBidMetricsRows(value: js.Array[SchemaBidMetricsRow]): Self = StObject.set(x, "bidMetricsRows", value.asInstanceOf[js.Any])
    
    inline def setBidMetricsRowsUndefined: Self = StObject.set(x, "bidMetricsRows", js.undefined)
    
    inline def setBidMetricsRowsVarargs(value: SchemaBidMetricsRow*): Self = StObject.set(x, "bidMetricsRows", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
