package typings.handsontable.mod.Handsontable.copyPaste

import typings.handsontable.mod.Handsontable.plugins.PasteModeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var columnsLimit: js.UndefOr[Double] = js.native
  var pasteMode: js.UndefOr[PasteModeType] = js.native
  var rowsLimit: js.UndefOr[Double] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setColumnsLimit(value: Double): Self = this.set("columnsLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnsLimit: Self = this.set("columnsLimit", js.undefined)
    @scala.inline
    def setPasteMode(value: PasteModeType): Self = this.set("pasteMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasteMode: Self = this.set("pasteMode", js.undefined)
    @scala.inline
    def setRowsLimit(value: Double): Self = this.set("rowsLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowsLimit: Self = this.set("rowsLimit", js.undefined)
  }
  
}

