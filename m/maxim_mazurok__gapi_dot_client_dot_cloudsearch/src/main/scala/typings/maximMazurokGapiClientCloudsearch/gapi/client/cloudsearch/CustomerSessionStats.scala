package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerSessionStats extends StObject {
  
  /** The date for which session stats were calculated. Stats are calculated on the following day, close to midnight PST, and then returned. */
  var date: js.UndefOr[Date] = js.undefined
  
  /** The count of search sessions on the day */
  var searchSessionsCount: js.UndefOr[String] = js.undefined
}
object CustomerSessionStats {
  
  inline def apply(): CustomerSessionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerSessionStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerSessionStats] (val x: Self) extends AnyVal {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setSearchSessionsCount(value: String): Self = StObject.set(x, "searchSessionsCount", value.asInstanceOf[js.Any])
    
    inline def setSearchSessionsCountUndefined: Self = StObject.set(x, "searchSessionsCount", js.undefined)
  }
}
