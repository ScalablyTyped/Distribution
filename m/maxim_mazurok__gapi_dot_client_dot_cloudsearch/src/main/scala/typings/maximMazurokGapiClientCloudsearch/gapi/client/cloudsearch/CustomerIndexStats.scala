package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerIndexStats extends StObject {
  
  /** The date for which statistics were calculated. */
  var date: js.UndefOr[Date] = js.undefined
  
  /** Number of items aggregrated by status code. */
  var itemCountByStatus: js.UndefOr[js.Array[ItemCountByStatus]] = js.undefined
}
object CustomerIndexStats {
  
  inline def apply(): CustomerIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerIndexStats]
  }
  
  extension [Self <: CustomerIndexStats](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setItemCountByStatus(value: js.Array[ItemCountByStatus]): Self = StObject.set(x, "itemCountByStatus", value.asInstanceOf[js.Any])
    
    inline def setItemCountByStatusUndefined: Self = StObject.set(x, "itemCountByStatus", js.undefined)
    
    inline def setItemCountByStatusVarargs(value: ItemCountByStatus*): Self = StObject.set(x, "itemCountByStatus", js.Array(value*))
  }
}
