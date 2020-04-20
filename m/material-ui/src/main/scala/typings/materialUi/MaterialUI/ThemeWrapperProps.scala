package typings.materialUi.MaterialUI

import typings.materialUi.MaterialUI.Styles.MuiTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeWrapperProps extends js.Object {
  var theme: MuiTheme
}

object ThemeWrapperProps {
  @scala.inline
  def apply(theme: MuiTheme): ThemeWrapperProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeWrapperProps]
  }
}

