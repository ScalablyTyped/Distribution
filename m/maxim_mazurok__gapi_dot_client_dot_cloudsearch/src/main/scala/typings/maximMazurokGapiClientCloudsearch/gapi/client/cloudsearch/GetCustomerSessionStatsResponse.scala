package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerSessionStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[CustomerSessionStats]] = js.undefined
}
object GetCustomerSessionStatsResponse {
  
  @scala.inline
  def apply(): GetCustomerSessionStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerSessionStatsResponse]
  }
  
  @scala.inline
  implicit class GetCustomerSessionStatsResponseMutableBuilder[Self <: GetCustomerSessionStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: js.Array[CustomerSessionStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: CustomerSessionStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
