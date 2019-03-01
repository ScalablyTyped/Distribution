package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLog extends js.Object {
  var channel: java.lang.String
  var data: java.lang.String | js.Object
  var request: java.lang.String
  var tags: js.Array[java.lang.String]
  var timestamp: scala.Double
}

object RequestLog {
  @scala.inline
  def apply(
    channel: java.lang.String,
    data: java.lang.String | js.Object,
    request: java.lang.String,
    tags: js.Array[java.lang.String],
    timestamp: scala.Double
  ): RequestLog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[RequestLog]
  }
}

