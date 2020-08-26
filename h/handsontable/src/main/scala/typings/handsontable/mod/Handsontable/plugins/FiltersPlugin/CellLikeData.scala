package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.anon.Col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellLikeData extends js.Object {
  var meta: Col = js.native
  var value: String = js.native
}

object CellLikeData {
  @scala.inline
  def apply(meta: Col, value: String): CellLikeData = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellLikeData]
  }
  @scala.inline
  implicit class CellLikeDataOps[Self <: CellLikeData] (val x: Self) extends AnyVal {
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
    def setMeta(value: Col): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

