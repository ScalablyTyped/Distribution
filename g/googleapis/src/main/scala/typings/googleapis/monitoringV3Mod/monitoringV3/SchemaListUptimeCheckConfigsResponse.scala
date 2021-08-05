package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The protocol for the ListUptimeCheckConfigs response.
  */
trait SchemaListUptimeCheckConfigsResponse extends StObject {
  
  /**
    * This field represents the pagination token to retrieve the next page of
    * results. If the value is empty, it means no further results for the
    * request. To retrieve the next page of results, the value of the
    * next_page_token is passed to the subsequent List method call (in the
    * request message&#39;s page_token field).
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of uptime check configurations for the project,
    * irrespective of any pagination.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The returned uptime check configurations.
    */
  var uptimeCheckConfigs: js.UndefOr[js.Array[SchemaUptimeCheckConfig]] = js.undefined
}
object SchemaListUptimeCheckConfigsResponse {
  
  inline def apply(): SchemaListUptimeCheckConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUptimeCheckConfigsResponse]
  }
  
  extension [Self <: SchemaListUptimeCheckConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
    
    inline def setUptimeCheckConfigs(value: js.Array[SchemaUptimeCheckConfig]): Self = StObject.set(x, "uptimeCheckConfigs", value.asInstanceOf[js.Any])
    
    inline def setUptimeCheckConfigsUndefined: Self = StObject.set(x, "uptimeCheckConfigs", js.undefined)
    
    inline def setUptimeCheckConfigsVarargs(value: SchemaUptimeCheckConfig*): Self = StObject.set(x, "uptimeCheckConfigs", js.Array(value :_*))
  }
}
