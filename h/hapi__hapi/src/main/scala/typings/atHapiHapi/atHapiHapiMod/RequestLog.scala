package typings.atHapiHapi.atHapiHapiMod

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
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestLog]
  }
}

