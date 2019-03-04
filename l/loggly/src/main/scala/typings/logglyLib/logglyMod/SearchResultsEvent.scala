package typings
package logglyLib.logglyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultsEvent extends js.Object {
  var event: js.Any
  var id: java.lang.String
  var logmsg: java.lang.String
  var logtypes: js.Array[java.lang.String]
  var raw: java.lang.String
  var tags: js.Array[java.lang.String]
  var timestamp: scala.Double
}

object SearchResultsEvent {
  @scala.inline
  def apply(
    event: js.Any,
    id: java.lang.String,
    logmsg: java.lang.String,
    logtypes: js.Array[java.lang.String],
    raw: java.lang.String,
    tags: js.Array[java.lang.String],
    timestamp: scala.Double
  ): SearchResultsEvent = {
    val __obj = js.Dynamic.literal(event = event, id = id, logmsg = logmsg, logtypes = logtypes, raw = raw, tags = tags, timestamp = timestamp)
  
    __obj.asInstanceOf[SearchResultsEvent]
  }
}

