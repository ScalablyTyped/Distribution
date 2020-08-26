package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResultsEvent extends js.Object {
  var event: js.Any = js.native
  var id: String = js.native
  var logmsg: String = js.native
  var logtypes: js.Array[String] = js.native
  var raw: String = js.native
  var tags: js.Array[String] = js.native
  var timestamp: Double = js.native
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
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logmsg = logmsg.asInstanceOf[js.Any], logtypes = logtypes.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultsEvent]
  }
  @scala.inline
  implicit class SearchResultsEventOps[Self <: SearchResultsEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogmsg(value: String): Self = this.set("logmsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogtypesVarargs(value: String*): Self = this.set("logtypes", js.Array(value :_*))
    @scala.inline
    def setLogtypes(value: js.Array[String]): Self = this.set("logtypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

