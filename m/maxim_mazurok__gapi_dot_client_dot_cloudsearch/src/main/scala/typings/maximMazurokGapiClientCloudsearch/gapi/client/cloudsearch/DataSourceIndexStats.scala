package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceIndexStats extends StObject {
  
  /**
    * Date for which index stats were calculated. If the date of request is not the current date then stats calculated on the next day are returned. Stats are calculated close to mid
    * night in this case. If date of request is current date, then real time stats are returned.
    */
  var date: js.UndefOr[Date] = js.undefined
  
  /** Number of items aggregrated by status code. */
  var itemCountByStatus: js.UndefOr[js.Array[ItemCountByStatus]] = js.undefined
}
object DataSourceIndexStats {
  
  @scala.inline
  def apply(): DataSourceIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceIndexStats]
  }
  
  @scala.inline
  implicit class DataSourceIndexStatsMutableBuilder[Self <: DataSourceIndexStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setItemCountByStatus(value: js.Array[ItemCountByStatus]): Self = StObject.set(x, "itemCountByStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountByStatusUndefined: Self = StObject.set(x, "itemCountByStatus", js.undefined)
    
    @scala.inline
    def setItemCountByStatusVarargs(value: ItemCountByStatus*): Self = StObject.set(x, "itemCountByStatus", js.Array(value :_*))
  }
}
