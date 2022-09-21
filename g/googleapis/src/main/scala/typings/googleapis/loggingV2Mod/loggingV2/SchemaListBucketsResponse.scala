package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBucketsResponse extends StObject {
  
  /**
    * A list of buckets.
    */
  var buckets: js.UndefOr[js.Array[SchemaLogBucket]] = js.undefined
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call the same method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBucketsResponse {
  
  inline def apply(): SchemaListBucketsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBucketsResponse]
  }
  
  extension [Self <: SchemaListBucketsResponse](x: Self) {
    
    inline def setBuckets(value: js.Array[SchemaLogBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: SchemaLogBucket*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
