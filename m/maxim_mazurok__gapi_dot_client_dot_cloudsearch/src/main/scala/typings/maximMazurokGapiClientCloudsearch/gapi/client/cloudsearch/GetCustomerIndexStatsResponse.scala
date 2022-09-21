package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerIndexStatsResponse extends StObject {
  
  /** Average item count for the given date range for which billing is done. */
  var averageIndexedItemCount: js.UndefOr[String] = js.undefined
  
  /** Summary of indexed item counts, one for each day in the requested range. */
  var stats: js.UndefOr[js.Array[CustomerIndexStats]] = js.undefined
}
object GetCustomerIndexStatsResponse {
  
  inline def apply(): GetCustomerIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerIndexStatsResponse]
  }
  
  extension [Self <: GetCustomerIndexStatsResponse](x: Self) {
    
    inline def setAverageIndexedItemCount(value: String): Self = StObject.set(x, "averageIndexedItemCount", value.asInstanceOf[js.Any])
    
    inline def setAverageIndexedItemCountUndefined: Self = StObject.set(x, "averageIndexedItemCount", js.undefined)
    
    inline def setStats(value: js.Array[CustomerIndexStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: CustomerIndexStats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
