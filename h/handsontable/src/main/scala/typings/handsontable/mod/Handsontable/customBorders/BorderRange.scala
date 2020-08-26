package typings.handsontable.mod.Handsontable.customBorders

import typings.handsontable.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderRange extends js.Object {
  var range: From = js.native
}

object BorderRange {
  @scala.inline
  def apply(range: From): BorderRange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRange]
  }
  @scala.inline
  implicit class BorderRangeOps[Self <: BorderRange] (val x: Self) extends AnyVal {
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
    def setRange(value: From): Self = this.set("range", value.asInstanceOf[js.Any])
  }
  
}

