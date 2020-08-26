package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLog extends js.Object {
  var channel: String = js.native
  var data: String | js.Object = js.native
  var request: String = js.native
  var tags: js.Array[String] = js.native
  var timestamp: Double = js.native
}

object RequestLog {
  @scala.inline
  def apply(
    channel: String,
    data: String | js.Object,
    request: String,
    tags: js.Array[String],
    timestamp: Double
  ): RequestLog = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLog]
  }
  @scala.inline
  implicit class RequestLogOps[Self <: RequestLog] (val x: Self) extends AnyVal {
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String | js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

