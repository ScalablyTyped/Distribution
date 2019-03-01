package typings
package atMaterialDashUiCoreLib.stylesWithThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTheme extends js.Object {
  var theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme
}

object WithTheme {
  @scala.inline
  def apply(theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme): WithTheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[WithTheme]
  }
}

