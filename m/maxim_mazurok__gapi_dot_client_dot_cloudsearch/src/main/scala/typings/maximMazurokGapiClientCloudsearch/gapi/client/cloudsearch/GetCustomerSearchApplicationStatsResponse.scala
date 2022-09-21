package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerSearchApplicationStatsResponse extends StObject {
  
  /** Average search application count for the given date range. */
  var averageSearchApplicationCount: js.UndefOr[String] = js.undefined
  
  /** Search application stats by date. */
  var stats: js.UndefOr[js.Array[CustomerSearchApplicationStats]] = js.undefined
}
object GetCustomerSearchApplicationStatsResponse {
  
  inline def apply(): GetCustomerSearchApplicationStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerSearchApplicationStatsResponse]
  }
  
  extension [Self <: GetCustomerSearchApplicationStatsResponse](x: Self) {
    
    inline def setAverageSearchApplicationCount(value: String): Self = StObject.set(x, "averageSearchApplicationCount", value.asInstanceOf[js.Any])
    
    inline def setAverageSearchApplicationCountUndefined: Self = StObject.set(x, "averageSearchApplicationCount", js.undefined)
    
    inline def setStats(value: js.Array[CustomerSearchApplicationStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: CustomerSearchApplicationStats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
