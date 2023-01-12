package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupStatsResponse extends StObject {
  
  /** The error group stats which match the given request. */
  var errorGroupStats: js.UndefOr[js.Array[ErrorGroupStats]] = js.undefined
  
  /** If non-empty, more results are available. Pass this token, along with the same query parameters as the first request, to view the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp specifies the start time to which the request was restricted. The start time is set based on the requested time range. It may be adjusted to a later time if a project
    * has exceeded the storage quota and older data has been deleted.
    */
  var timeRangeBegin: js.UndefOr[String] = js.undefined
}
object ListGroupStatsResponse {
  
  inline def apply(): ListGroupStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupStatsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGroupStatsResponse] (val x: Self) extends AnyVal {
    
    inline def setErrorGroupStats(value: js.Array[ErrorGroupStats]): Self = StObject.set(x, "errorGroupStats", value.asInstanceOf[js.Any])
    
    inline def setErrorGroupStatsUndefined: Self = StObject.set(x, "errorGroupStats", js.undefined)
    
    inline def setErrorGroupStatsVarargs(value: ErrorGroupStats*): Self = StObject.set(x, "errorGroupStats", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTimeRangeBegin(value: String): Self = StObject.set(x, "timeRangeBegin", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeBeginUndefined: Self = StObject.set(x, "timeRangeBegin", js.undefined)
  }
}
