package typings.kendoUi.kendo.spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ SheetChangeEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
}

object SheetOptions {
  @scala.inline
  def apply(): SheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetOptions]
  }
  @scala.inline
  implicit class SheetOptionsOps[Self <: SheetOptions] (val x: Self) extends AnyVal {
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
    def setChange(value: /* e */ SheetChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

