package typings.loggly.logglyMod

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
    val __obj = js.Dynamic.literal(events = events, page = page, total_events = total_events)
  
    __obj.asInstanceOf[SearchResults]
  }
}

