package typings
package logglyLib.logglyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults extends js.Object {
  var events: js.Array[SearchResultsEvent]
  var page: scala.Double
  var total_events: scala.Double
}

object SearchResults {
  @scala.inline
  def apply(events: js.Array[SearchResultsEvent], page: scala.Double, total_events: scala.Double): SearchResults = {
    val __obj = js.Dynamic.literal(events = events, page = page, total_events = total_events)
  
    __obj.asInstanceOf[SearchResults]
  }
}

