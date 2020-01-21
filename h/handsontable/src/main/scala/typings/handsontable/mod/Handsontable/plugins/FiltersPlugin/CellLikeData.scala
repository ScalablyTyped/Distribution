package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.AnonCol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellLikeData extends js.Object {
  var meta: AnonCol
  var value: String
}

object CellLikeData {
  @scala.inline
  def apply(meta: AnonCol, value: String): CellLikeData = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellLikeData]
  }
}

