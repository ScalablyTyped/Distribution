package typings.gridTemplateParser.anon

import typings.gridTemplateParser.mod.Track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<grid-template-parser.grid-template-parser.Area> */
@js.native
trait PartialArea extends js.Object {
  var column: js.UndefOr[Track] = js.native
  var row: js.UndefOr[Track] = js.native
}

object PartialArea {
  @scala.inline
  def apply(): PartialArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArea]
  }
  @scala.inline
  implicit class PartialAreaOps[Self <: PartialArea] (val x: Self) extends AnyVal {
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
    def setColumn(value: Track): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setRow(value: Track): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
  }
  
}

