package typings.jexcel.anon

import typings.jexcel.mod.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: CellValue
  var name: CellValue
}

object Id {
  @scala.inline
  def apply(id: CellValue, name: CellValue): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

