package typings.loggly.logglyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultsEvent extends js.Object {
  var event: js.Any
  var id: String
  var logmsg: String
  var logtypes: js.Array[String]
  var raw: String
  var tags: js.Array[String]
  var timestamp: Double
}

object SearchResultsEvent {
  @scala.inline
  def apply(
    event: js.Any,
    id: String,
    logmsg: String,
    logtypes: js.Array[String],
    raw: String,
    tags: js.Array[String],
    timestamp: Double
  ): SearchResultsEvent = {
    val __obj = js.Dynamic.literal(event = event, id = id, logmsg = logmsg, logtypes = logtypes, raw = raw, tags = tags, timestamp = timestamp)
  
    __obj.asInstanceOf[SearchResultsEvent]
  }
}

