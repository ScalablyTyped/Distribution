package typings.materialDashUi

import typings.materialDashUi.underscoreUnderscoreMaterialUINs.StylesNs.MuiTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MuiTheme extends js.Object {
  var muiTheme: js.UndefOr[MuiTheme] = js.undefined
}

object Anon_MuiTheme {
  @scala.inline
  def apply(muiTheme: MuiTheme = null): Anon_MuiTheme = {
    val __obj = js.Dynamic.literal()
    if (muiTheme != null) __obj.updateDynamic("muiTheme")(muiTheme)
    __obj.asInstanceOf[Anon_MuiTheme]
  }
}

