package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventsResponse extends StObject {
  
  /** The error events which match the given request. */
  var errorEvents: js.UndefOr[js.Array[ErrorEvent]] = js.undefined
  
  /** If non-empty, more results are available. Pass this token, along with the same query parameters as the first request, to view the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The timestamp specifies the start time to which the request was restricted. */
  var timeRangeBegin: js.UndefOr[String] = js.undefined
}
object ListEventsResponse {
  
  @scala.inline
  def apply(): ListEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventsResponse]
  }
  
  @scala.inline
  implicit class ListEventsResponseMutableBuilder[Self <: ListEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorEvents(value: js.Array[ErrorEvent]): Self = StObject.set(x, "errorEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorEventsUndefined: Self = StObject.set(x, "errorEvents", js.undefined)
    
    @scala.inline
    def setErrorEventsVarargs(value: ErrorEvent*): Self = StObject.set(x, "errorEvents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTimeRangeBegin(value: String): Self = StObject.set(x, "timeRangeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRangeBeginUndefined: Self = StObject.set(x, "timeRangeBegin", js.undefined)
  }
}
