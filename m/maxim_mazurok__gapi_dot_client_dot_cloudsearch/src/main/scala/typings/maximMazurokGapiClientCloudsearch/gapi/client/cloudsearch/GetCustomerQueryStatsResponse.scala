package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerQueryStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[CustomerQueryStats]] = js.undefined
}
object GetCustomerQueryStatsResponse {
  
  inline def apply(): GetCustomerQueryStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerQueryStatsResponse]
  }
  
  extension [Self <: GetCustomerQueryStatsResponse](x: Self) {
    
    inline def setStats(value: js.Array[CustomerQueryStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: CustomerQueryStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
