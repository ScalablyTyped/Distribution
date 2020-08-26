package typings.marked.mod.Tokens

import typings.marked.markedStrings.center
import typings.marked.markedStrings.left
import typings.marked.markedStrings.right
import typings.marked.markedStrings.table
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends Token {
  var align: js.Array[center | left | right | Null] = js.native
  var cells: js.Array[js.Array[String]] = js.native
  var header: js.Array[String] = js.native
  var raw: String = js.native
  var `type`: table = js.native
}

object Table {
  @scala.inline
  def apply(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    raw: String,
    `type`: table
  ): Table = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
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
    def setAlignVarargs(value: (center | left | right | Null)*): Self = this.set("align", js.Array(value :_*))
    @scala.inline
    def setAlign(value: js.Array[center | left | right | Null]): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellsVarargs(value: js.Array[String]*): Self = this.set("cells", js.Array(value :_*))
    @scala.inline
    def setCells(value: js.Array[js.Array[String]]): Self = this.set("cells", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderVarargs(value: String*): Self = this.set("header", js.Array(value :_*))
    @scala.inline
    def setHeader(value: js.Array[String]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: table): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

