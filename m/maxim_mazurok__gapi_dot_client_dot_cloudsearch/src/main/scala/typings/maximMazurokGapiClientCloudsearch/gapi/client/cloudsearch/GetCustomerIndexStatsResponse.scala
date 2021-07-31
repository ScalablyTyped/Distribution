package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerIndexStatsResponse extends StObject {
  
  /** Summary of indexed item counts, one for each day in the requested range. */
  var stats: js.UndefOr[js.Array[CustomerIndexStats]] = js.undefined
}
object GetCustomerIndexStatsResponse {
  
  @scala.inline
  def apply(): GetCustomerIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerIndexStatsResponse]
  }
  
  @scala.inline
  implicit class GetCustomerIndexStatsResponseMutableBuilder[Self <: GetCustomerIndexStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: js.Array[CustomerIndexStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: CustomerIndexStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
