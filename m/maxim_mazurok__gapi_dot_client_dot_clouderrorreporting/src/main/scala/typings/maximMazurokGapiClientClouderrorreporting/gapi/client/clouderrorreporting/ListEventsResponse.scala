package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventsResponse extends js.Object {
  
  /** The error events which match the given request. */
  var errorEvents: js.UndefOr[js.Array[ErrorEvent]] = js.native
  
  /** If non-empty, more results are available. Pass this token, along with the same query parameters as the first request, to view the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The timestamp specifies the start time to which the request was restricted. */
  var timeRangeBegin: js.UndefOr[String] = js.native
}
object ListEventsResponse {
  
  @scala.inline
  def apply(): ListEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventsResponse]
  }
  
  @scala.inline
  implicit class ListEventsResponseOps[Self <: ListEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorEventsVarargs(value: ErrorEvent*): Self = this.set("errorEvents", js.Array(value :_*))
    
    @scala.inline
    def setErrorEvents(value: js.Array[ErrorEvent]): Self = this.set("errorEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorEvents: Self = this.set("errorEvents", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTimeRangeBegin(value: String): Self = this.set("timeRangeBegin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeRangeBegin: Self = this.set("timeRangeBegin", js.undefined)
  }
}
