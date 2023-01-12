package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerQueryStats extends StObject {
  
  /** The date for which query stats were calculated. Stats calculated on the next day close to midnight are returned. */
  var date: js.UndefOr[Date] = js.undefined
  
  var queryCountByStatus: js.UndefOr[js.Array[QueryCountByStatus]] = js.undefined
}
object CustomerQueryStats {
  
  inline def apply(): CustomerQueryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerQueryStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerQueryStats] (val x: Self) extends AnyVal {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setQueryCountByStatus(value: js.Array[QueryCountByStatus]): Self = StObject.set(x, "queryCountByStatus", value.asInstanceOf[js.Any])
    
    inline def setQueryCountByStatusUndefined: Self = StObject.set(x, "queryCountByStatus", js.undefined)
    
    inline def setQueryCountByStatusVarargs(value: QueryCountByStatus*): Self = StObject.set(x, "queryCountByStatus", js.Array(value*))
  }
}
