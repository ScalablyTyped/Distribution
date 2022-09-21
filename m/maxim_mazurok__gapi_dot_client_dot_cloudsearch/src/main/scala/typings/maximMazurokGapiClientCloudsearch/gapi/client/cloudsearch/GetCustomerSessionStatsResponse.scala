package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerSessionStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[CustomerSessionStats]] = js.undefined
}
object GetCustomerSessionStatsResponse {
  
  inline def apply(): GetCustomerSessionStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerSessionStatsResponse]
  }
  
  extension [Self <: GetCustomerSessionStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[CustomerSessionStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: CustomerSessionStats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
