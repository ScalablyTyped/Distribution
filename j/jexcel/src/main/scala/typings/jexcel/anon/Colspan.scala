package typings.jexcel.anon

import typings.jexcel.mod.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colspan extends js.Object {
  var colspan: js.UndefOr[Double] = js.native
  var title: js.UndefOr[CellValue] = js.native
}

object Colspan {
  @scala.inline
  def apply(): Colspan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colspan]
  }
  @scala.inline
  implicit class ColspanOps[Self <: Colspan] (val x: Self) extends AnyVal {
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
    def setColspan(value: Double): Self = this.set("colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColspan: Self = this.set("colspan", js.undefined)
    @scala.inline
    def setTitle(value: CellValue): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

