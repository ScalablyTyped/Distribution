package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSourceIndexStatsResponse extends StObject {
  
  /** Summary of indexed item counts, one for each day in the requested range. */
  var stats: js.UndefOr[js.Array[DataSourceIndexStats]] = js.undefined
}
object GetDataSourceIndexStatsResponse {
  
  @scala.inline
  def apply(): GetDataSourceIndexStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataSourceIndexStatsResponse]
  }
  
  @scala.inline
  implicit class GetDataSourceIndexStatsResponseMutableBuilder[Self <: GetDataSourceIndexStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStats(value: js.Array[DataSourceIndexStats]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setStatsVarargs(value: DataSourceIndexStats*): Self = StObject.set(x, "stats", js.Array(value :_*))
  }
}
