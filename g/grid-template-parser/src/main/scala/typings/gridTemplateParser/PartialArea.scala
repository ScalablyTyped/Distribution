package typings.gridTemplateParser

import typings.gridTemplateParser.mod.Track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<grid-template-parser.grid-template-parser.Area> */
trait PartialArea extends js.Object {
  var column: js.UndefOr[Track] = js.undefined
  var row: js.UndefOr[Track] = js.undefined
}

object PartialArea {
  @scala.inline
  def apply(column: Track = null, row: Track = null): PartialArea = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialArea]
  }
}

