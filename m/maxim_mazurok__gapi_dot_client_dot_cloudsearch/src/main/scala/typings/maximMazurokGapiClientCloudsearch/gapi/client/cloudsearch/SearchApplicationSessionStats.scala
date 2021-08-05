package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchApplicationSessionStats extends StObject {
  
  /** Date for which session stats were calculated. Stats calculated on the next day close to midnight are returned. */
  var date: js.UndefOr[Date] = js.undefined
  
  /** The count of search sessions on the day */
  var searchSessionsCount: js.UndefOr[String] = js.undefined
}
object SearchApplicationSessionStats {
  
  inline def apply(): SearchApplicationSessionStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchApplicationSessionStats]
  }
  
  extension [Self <: SearchApplicationSessionStats](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setSearchSessionsCount(value: String): Self = StObject.set(x, "searchSessionsCount", value.asInstanceOf[js.Any])
    
    inline def setSearchSessionsCountUndefined: Self = StObject.set(x, "searchSessionsCount", js.undefined)
  }
}
