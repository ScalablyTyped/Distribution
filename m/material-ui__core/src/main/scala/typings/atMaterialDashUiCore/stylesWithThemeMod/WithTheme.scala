package typings.atMaterialDashUiCore.stylesWithThemeMod

import typings.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTheme extends js.Object {
  var theme: Theme
}

object WithTheme {
  @scala.inline
  def apply(theme: Theme): WithTheme = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithTheme]
  }
}

