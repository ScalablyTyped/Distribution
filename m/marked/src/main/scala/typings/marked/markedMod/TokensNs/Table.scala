package typings.marked.markedMod.TokensNs

import typings.marked.markedMod.Token
import typings.marked.markedStrings.center
import typings.marked.markedStrings.left
import typings.marked.markedStrings.right
import typings.marked.markedStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends Token {
  var align: js.Array[center | left | right | Null]
  var cells: js.Array[js.Array[String]]
  var header: js.Array[String]
  var `type`: table
}

object Table {
  @scala.inline
  def apply(
    align: js.Array[center | left | right | Null],
    cells: js.Array[js.Array[String]],
    header: js.Array[String],
    `type`: table
  ): Table = {
    val __obj = js.Dynamic.literal(align = align, cells = cells, header = header)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Table]
  }
}

