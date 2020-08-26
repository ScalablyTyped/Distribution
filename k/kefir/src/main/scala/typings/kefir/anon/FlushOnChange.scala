package typings.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlushOnChange extends js.Object {
  var flushOnChange: js.UndefOr[Boolean] = js.native
  var flushOnEnd: js.UndefOr[Boolean] = js.native
}

object FlushOnChange {
  @scala.inline
  def apply(): FlushOnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlushOnChange]
  }
  @scala.inline
  implicit class FlushOnChangeOps[Self <: FlushOnChange] (val x: Self) extends AnyVal {
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
    def setFlushOnChange(value: Boolean): Self = this.set("flushOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlushOnChange: Self = this.set("flushOnChange", js.undefined)
    @scala.inline
    def setFlushOnEnd(value: Boolean): Self = this.set("flushOnEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlushOnEnd: Self = this.set("flushOnEnd", js.undefined)
  }
  
}

