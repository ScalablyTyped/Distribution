package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupAssetsResponse extends StObject {
  
  /**
    * Group results. There exists an element for each existing unique combination of property/values. The element contains a count for the number of times those specific property/values appear.
    */
  var groupByResults: js.UndefOr[js.Array[SchemaGroupResult]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time used for executing the groupBy request.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of results matching the query.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGroupAssetsResponse {
  
  inline def apply(): SchemaGroupAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupAssetsResponse]
  }
  
  extension [Self <: SchemaGroupAssetsResponse](x: Self) {
    
    inline def setGroupByResults(value: js.Array[SchemaGroupResult]): Self = StObject.set(x, "groupByResults", value.asInstanceOf[js.Any])
    
    inline def setGroupByResultsUndefined: Self = StObject.set(x, "groupByResults", js.undefined)
    
    inline def setGroupByResultsVarargs(value: SchemaGroupResult*): Self = StObject.set(x, "groupByResults", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
