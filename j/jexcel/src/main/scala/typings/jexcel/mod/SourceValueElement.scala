package typings.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceValueElement[T /* <: CellValue */] extends js.Object {
  var id: T = js.native
  var name: CellValue = js.native
}

object SourceValueElement {
  @scala.inline
  def apply[/* <: typings.jexcel.mod.CellValue */ T](id: T, name: CellValue): SourceValueElement[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceValueElement[T]]
  }
  @scala.inline
  implicit class SourceValueElementOps[Self <: SourceValueElement[_], /* <: typings.jexcel.mod.CellValue */ T] (val x: Self with SourceValueElement[T]) extends AnyVal {
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
    def setId(value: T): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: CellValue): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

