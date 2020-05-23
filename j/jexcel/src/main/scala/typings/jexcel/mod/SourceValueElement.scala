package typings.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceValueElement[T /* <: CellValue */] extends js.Object {
  var id: T
  var name: CellValue
}

object SourceValueElement {
  @scala.inline
  def apply[T](id: T, name: CellValue): SourceValueElement[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceValueElement[T]]
  }
}

