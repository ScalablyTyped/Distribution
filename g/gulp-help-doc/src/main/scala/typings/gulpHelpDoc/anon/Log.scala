package typings.gulpHelpDoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  var log: js.Function = js.native
}

object Log {
  @scala.inline
  def apply(log: js.Function): Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  @scala.inline
  implicit class LogOps[Self <: Log] (val x: Self) extends AnyVal {
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
    def setLog(value: js.Function): Self = this.set("log", value.asInstanceOf[js.Any])
  }
  
}

