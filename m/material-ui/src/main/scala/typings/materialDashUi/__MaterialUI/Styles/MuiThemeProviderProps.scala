package typings.materialDashUi.__MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiThemeProviderProps extends js.Object {
  var muiTheme: js.UndefOr[MuiTheme] = js.undefined
}

object MuiThemeProviderProps {
  @scala.inline
  def apply(muiTheme: MuiTheme = null): MuiThemeProviderProps = {
    val __obj = js.Dynamic.literal()
    if (muiTheme != null) __obj.updateDynamic("muiTheme")(muiTheme)
    __obj.asInstanceOf[MuiThemeProviderProps]
  }
}

