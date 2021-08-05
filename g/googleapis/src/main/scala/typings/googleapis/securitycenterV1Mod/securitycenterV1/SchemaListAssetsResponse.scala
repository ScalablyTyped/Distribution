package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing assets.
  */
trait SchemaListAssetsResponse extends StObject {
  
  /**
    * Assets matching the list request.
    */
  var listAssetsResults: js.UndefOr[js.Array[SchemaListAssetsResult]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Time used for executing the list request.
    */
  var readTime: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of assets matching the query.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object SchemaListAssetsResponse {
  
  inline def apply(): SchemaListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAssetsResponse]
  }
  
  extension [Self <: SchemaListAssetsResponse](x: Self) {
    
    inline def setListAssetsResults(value: js.Array[SchemaListAssetsResult]): Self = StObject.set(x, "listAssetsResults", value.asInstanceOf[js.Any])
    
    inline def setListAssetsResultsUndefined: Self = StObject.set(x, "listAssetsResults", js.undefined)
    
    inline def setListAssetsResultsVarargs(value: SchemaListAssetsResult*): Self = StObject.set(x, "listAssetsResults", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
