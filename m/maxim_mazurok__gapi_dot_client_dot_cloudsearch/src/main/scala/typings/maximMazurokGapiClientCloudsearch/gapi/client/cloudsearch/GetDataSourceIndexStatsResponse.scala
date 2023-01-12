package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSourceIndexStatsResponse extends StObject {
  
  /** Average item count for the given date range for which billing is done. */
  var averageIndexedItemCount: js.UndefOr[String] = js.undefined
  
  /** Summary of indexed item counts, one for each day in the requested range. */
  var stats: js.UndefOr[js.Array[DataSourceIndexStats]] = js.undefined
}
object GetDataSourceIndexStatsResponse {
  
  inline def apply(): GetDataSourceIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataSourceIndexStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataSourceIndexStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setAverageIndexedItemCount(value: String): Self = StObject.set(x, "averageIndexedItemCount", value.asInstanceOf[js.Any])
    
    inline def setAverageIndexedItemCountUndefined: Self = StObject.set(x, "averageIndexedItemCount", js.undefined)
    
    inline def setStats(value: js.Array[DataSourceIndexStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setStatsVarargs(value: DataSourceIndexStats*): Self = StObject.set(x, "stats", js.Array(value*))
  }
}
