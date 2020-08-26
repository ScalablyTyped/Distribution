package typings.lambdaLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogRecordOptions extends js.Object {
  var level: String = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var msg: String = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object LogRecordOptions {
  @scala.inline
  def apply(level: String, msg: String): LogRecordOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogRecordOptions]
  }
  @scala.inline
  implicit class LogRecordOptionsOps[Self <: LogRecordOptions] (val x: Self) extends AnyVal {
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
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsg(value: String): Self = this.set("msg", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

