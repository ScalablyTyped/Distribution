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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("logmsg")(logmsg)
    __obj.updateDynamic("logtypes")(logtypes)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[SearchResultsEvent]
  }
}

