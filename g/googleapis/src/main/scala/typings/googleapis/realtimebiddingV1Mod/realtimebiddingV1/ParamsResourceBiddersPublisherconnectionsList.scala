package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersPublisherconnectionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Query string to filter publisher connections. Connections can be filtered by `displayName`, `publisherPlatform`, and `biddingState`. If no filter is specified, all publisher connections will be returned. Example: 'displayName="Great Publisher*" AND publisherPlatform=ADMOB AND biddingState != PENDING' See https://google.aip.dev/160 for more information about filtering syntax.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Order specification by which results should be sorted. If no sort order is specified, the results will be returned in an arbitrary order. Currently results can be sorted by `createTime`. Example: 'createTime DESC'.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. The server may return fewer results than requested (due to timeout constraint) even if more are available via another call. If unspecified, the server will pick an appropriate default. Acceptable values are 1 to 5000, inclusive.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return. Typically, this is the value of ListPublisherConnectionsResponse.nextPageToken returned from the previous call to the 'ListPublisherConnections' method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of the bidder for which publishers have initiated connections. The pattern for this resource is `bidders/{bidder\}` where `{bidder\}` represents the account ID of the bidder.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersPublisherconnectionsList {
  
  inline def apply(): ParamsResourceBiddersPublisherconnectionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersPublisherconnectionsList]
  }
  
  extension [Self <: ParamsResourceBiddersPublisherconnectionsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
