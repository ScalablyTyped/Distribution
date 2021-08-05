package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerUserStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[CustomerUserStats]] = js.undefined
}
object GetCustomerUserStatsResponse {
  
  inline def apply(): GetCustomerUserStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerUserStatsResponse]
  }
  
  extension [Self <: GetCustomerUserStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[CustomerUserStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: CustomerUserStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
