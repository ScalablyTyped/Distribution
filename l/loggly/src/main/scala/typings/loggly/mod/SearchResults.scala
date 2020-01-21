package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults extends js.Object {
  var events: js.Array[SearchResultsEvent]
  var page: Double
  var total_events: Double
}

object SearchResults {
  @scala.inline
  def apply(events: js.Array[SearchResultsEvent], page: Double, total_events: Double): SearchResults = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], total_events = total_events.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResults]
  }
}

