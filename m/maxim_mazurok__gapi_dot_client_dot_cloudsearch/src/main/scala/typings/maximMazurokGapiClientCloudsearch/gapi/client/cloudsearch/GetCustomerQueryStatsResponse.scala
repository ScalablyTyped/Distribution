package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCustomerQueryStatsResponse extends StObject {
  
  var stats: js.UndefOr[js.Array[CustomerQueryStats]] = js.native
}
object GetCustomerQueryStatsResponse {
  
  @scala.inline
  def apply(): GetCustomerQueryStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerQueryStatsResponse]
  }
  
  @scala.inline
  implicit class GetCustomerQueryStatsResponseMutableBuilder[Self <: GetCustomerQueryStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: js.Array[CustomerQueryStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: CustomerQueryStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
