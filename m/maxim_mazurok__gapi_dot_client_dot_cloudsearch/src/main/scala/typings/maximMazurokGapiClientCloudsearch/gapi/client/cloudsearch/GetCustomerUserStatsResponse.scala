package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerUserStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[CustomerUserStats]] = js.undefined
}
object GetCustomerUserStatsResponse {
  
  @scala.inline
  def apply(): GetCustomerUserStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerUserStatsResponse]
  }
  
  @scala.inline
  implicit class GetCustomerUserStatsResponseMutableBuilder[Self <: GetCustomerUserStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: js.Array[CustomerUserStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: CustomerUserStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
