package typings.hapi.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLog extends js.Object {
  var channel: String
  var data: String | js.Object
  var request: String
  var tags: js.Array[String]
  var timestamp: Double
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
    val __obj = js.Dynamic.literal(channel = channel, data = data.asInstanceOf[js.Any], request = request, tags = tags, timestamp = timestamp)
  
    __obj.asInstanceOf[RequestLog]
  }
}

