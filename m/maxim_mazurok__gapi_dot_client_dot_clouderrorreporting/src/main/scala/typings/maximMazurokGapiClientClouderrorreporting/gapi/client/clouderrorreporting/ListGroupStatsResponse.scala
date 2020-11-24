package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroupStatsResponse extends js.Object {
  
  /** The error group stats which match the given request. */
  var errorGroupStats: js.UndefOr[js.Array[ErrorGroupStats]] = js.native
  
  /** If non-empty, more results are available. Pass this token, along with the same query parameters as the first request, to view the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The timestamp specifies the start time to which the request was restricted. The start time is set based on the requested time range. It may be adjusted to a later time if a project
    * has exceeded the storage quota and older data has been deleted.
    */
  var timeRangeBegin: js.UndefOr[String] = js.native
}
object ListGroupStatsResponse {
  
  @scala.inline
  def apply(): ListGroupStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupStatsResponse]
  }
  
  @scala.inline
  implicit class ListGroupStatsResponseOps[Self <: ListGroupStatsResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorGroupStatsVarargs(value: ErrorGroupStats*): Self = this.set("errorGroupStats", js.Array(value :_*))
    
    @scala.inline
    def setErrorGroupStats(value: js.Array[ErrorGroupStats]): Self = this.set("errorGroupStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorGroupStats: Self = this.set("errorGroupStats", js.undefined)
    
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
