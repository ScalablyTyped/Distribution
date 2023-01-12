package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceIndexStats extends StObject {
  
  /**
    * The date for which index stats were calculated. If the date of request is not the current date then stats calculated on the next day are returned. Stats are calculated close to mid
    * night in this case. If date of request is current date, then real time stats are returned.
    */
  var date: js.UndefOr[Date] = js.undefined
  
  /** Number of items aggregrated by status code. */
  var itemCountByStatus: js.UndefOr[js.Array[ItemCountByStatus]] = js.undefined
}
object DataSourceIndexStats {
  
  inline def apply(): DataSourceIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceIndexStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceIndexStats] (val x: Self) extends AnyVal {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setItemCountByStatus(value: js.Array[ItemCountByStatus]): Self = StObject.set(x, "itemCountByStatus", value.asInstanceOf[js.Any])
    
    inline def setItemCountByStatusUndefined: Self = StObject.set(x, "itemCountByStatus", js.undefined)
    
    inline def setItemCountByStatusVarargs(value: ItemCountByStatus*): Self = StObject.set(x, "itemCountByStatus", js.Array(value*))
  }
}
