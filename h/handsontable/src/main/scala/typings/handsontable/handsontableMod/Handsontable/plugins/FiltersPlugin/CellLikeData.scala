package typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.Anon_Col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellLikeData extends js.Object {
  var meta: Anon_Col
  var value: String
}

object CellLikeData {
  @scala.inline
  def apply(meta: Anon_Col, value: String): CellLikeData = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellLikeData]
  }
}

