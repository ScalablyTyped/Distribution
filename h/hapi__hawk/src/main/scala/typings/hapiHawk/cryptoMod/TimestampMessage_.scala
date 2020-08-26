package typings.hapiHawk.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampMessage_ extends js.Object {
  var ts: Double = js.native
  var tsm: String = js.native
}

object TimestampMessage_ {
  @scala.inline
  def apply(ts: Double, tsm: String): TimestampMessage_ = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any], tsm = tsm.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampMessage_]
  }
  @scala.inline
  implicit class TimestampMessage_Ops[Self <: TimestampMessage_] (val x: Self) extends AnyVal {
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
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTsm(value: String): Self = this.set("tsm", value.asInstanceOf[js.Any])
  }
  
}

