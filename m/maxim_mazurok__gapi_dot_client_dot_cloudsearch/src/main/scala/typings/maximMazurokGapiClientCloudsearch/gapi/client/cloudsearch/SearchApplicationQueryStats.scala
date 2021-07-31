package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchApplicationQueryStats extends StObject {
  
  /** Date for which query stats were calculated. Stats calculated on the next day close to midnight are returned. */
  var date: js.UndefOr[Date] = js.undefined
  
  var queryCountByStatus: js.UndefOr[js.Array[QueryCountByStatus]] = js.undefined
}
object SearchApplicationQueryStats {
  
  @scala.inline
  def apply(): SearchApplicationQueryStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchApplicationQueryStats]
  }
  
  @scala.inline
  implicit class SearchApplicationQueryStatsMutableBuilder[Self <: SearchApplicationQueryStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setQueryCountByStatus(value: js.Array[QueryCountByStatus]): Self = StObject.set(x, "queryCountByStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryCountByStatusUndefined: Self = StObject.set(x, "queryCountByStatus", js.undefined)
    
    @scala.inline
    def setQueryCountByStatusVarargs(value: QueryCountByStatus*): Self = StObject.set(x, "queryCountByStatus", js.Array(value :_*))
  }
}
