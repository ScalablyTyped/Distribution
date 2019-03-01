package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MuiTheme extends js.Object {
  var muiTheme: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.StylesNs.MuiTheme] = js.undefined
}

object Anon_MuiTheme {
  @scala.inline
  def apply(muiTheme: materialDashUiLib.underscoreUnderscoreMaterialUINs.StylesNs.MuiTheme = null): Anon_MuiTheme = {
    val __obj = js.Dynamic.literal()
    if (muiTheme != null) __obj.updateDynamic("muiTheme")(muiTheme)
    __obj.asInstanceOf[Anon_MuiTheme]
  }
}

