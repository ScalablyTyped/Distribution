package typings.hapiHawk.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampMessage_ extends js.Object {
  var ts: Double
  var tsm: String
}

object TimestampMessage_ {
  @scala.inline
  def apply(ts: Double, tsm: String): TimestampMessage_ = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], tsm = tsm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimestampMessage_]
  }
}

