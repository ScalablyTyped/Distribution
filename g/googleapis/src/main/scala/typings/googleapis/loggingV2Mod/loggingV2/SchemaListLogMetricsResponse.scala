package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListLogMetricsResponse extends StObject {
  
  /**
    * A list of logs-based metrics.
    */
  var metrics: js.UndefOr[js.Array[SchemaLogMetric]] = js.undefined
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call this method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListLogMetricsResponse {
  
  inline def apply(): SchemaListLogMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLogMetricsResponse]
  }
  
  extension [Self <: SchemaListLogMetricsResponse](x: Self) {
    
    inline def setMetrics(value: js.Array[SchemaLogMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaLogMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
