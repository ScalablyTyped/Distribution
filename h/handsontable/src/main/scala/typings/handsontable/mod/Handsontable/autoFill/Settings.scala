package typings.handsontable.mod.Handsontable.autoFill

import typings.handsontable.handsontableStrings.horizontal
import typings.handsontable.handsontableStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var autoInsertRow: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[vertical | horizontal] = js.native
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
    def setAutoInsertRow(value: Boolean): Self = this.set("autoInsertRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoInsertRow: Self = this.set("autoInsertRow", js.undefined)
    @scala.inline
    def setDirection(value: vertical | horizontal): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
  
}

