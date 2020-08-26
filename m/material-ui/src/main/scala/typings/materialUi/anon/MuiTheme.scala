package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiTheme extends js.Object {
  var muiTheme: js.UndefOr[typings.materialUi.MaterialUI.Styles.MuiTheme] = js.native
}

object MuiTheme {
  @scala.inline
  def apply(): MuiTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuiTheme]
  }
  @scala.inline
  implicit class MuiThemeOps[Self <: MuiTheme] (val x: Self) extends AnyVal {
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
    def setMuiTheme(value: typings.materialUi.MaterialUI.Styles.MuiTheme): Self = this.set("muiTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuiTheme: Self = this.set("muiTheme", js.undefined)
  }
  
}

