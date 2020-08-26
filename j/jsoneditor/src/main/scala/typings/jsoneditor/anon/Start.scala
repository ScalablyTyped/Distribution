package typings.jsoneditor.anon

import typings.jsoneditor.mod.SelectionPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Start extends js.Object {
  var end: SelectionPosition = js.native
  var start: SelectionPosition = js.native
  var text: String = js.native
}

object Start {
  @scala.inline
  def apply(end: SelectionPosition, start: SelectionPosition, text: String): Start = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  @scala.inline
  implicit class StartOps[Self <: Start] (val x: Self) extends AnyVal {
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
    def setEnd(value: SelectionPosition): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: SelectionPosition): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

