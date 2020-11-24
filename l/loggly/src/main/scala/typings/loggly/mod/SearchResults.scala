package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResults extends js.Object {
  
  var events: js.Array[SearchResultsEvent] = js.native
  
  var page: Double = js.native
  
  var total_events: Double = js.native
}
object SearchResults {
  
  @scala.inline
  def apply(events: js.Array[SearchResultsEvent], page: Double, total_events: Double): SearchResults = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], total_events = total_events.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResults]
  }
  
  @scala.inline
  implicit class SearchResultsOps[Self <: SearchResults] (val x: Self) extends AnyVal {
    
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
    def setEventsVarargs(value: SearchResultsEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[SearchResultsEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_events(value: Double): Self = this.set("total_events", value.asInstanceOf[js.Any])
  }
}
