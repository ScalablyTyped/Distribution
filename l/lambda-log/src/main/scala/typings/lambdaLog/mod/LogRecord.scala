package typings.lambdaLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogRecord extends js.Object {
  var _logLevel: String = js.native
  var _tags: js.Array[String] = js.native
  var meta: js.Any = js.native
  var msg: String = js.native
}

object LogRecord {
  @scala.inline
  def apply(_logLevel: String, _tags: js.Array[String], meta: js.Any, msg: String): LogRecord = {
    val __obj = js.Dynamic.literal(_logLevel = _logLevel.asInstanceOf[js.Any], _tags = _tags.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogRecord]
  }
  @scala.inline
  implicit class LogRecordOps[Self <: LogRecord] (val x: Self) extends AnyVal {
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
    def set_logLevel(value: String): Self = this.set("_logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def set_tagsVarargs(value: String*): Self = this.set("_tags", js.Array(value :_*))
    @scala.inline
    def set_tags(value: js.Array[String]): Self = this.set("_tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
  }
  
}

