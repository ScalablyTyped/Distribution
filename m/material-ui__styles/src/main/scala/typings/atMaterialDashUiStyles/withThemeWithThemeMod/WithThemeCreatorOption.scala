package typings.atMaterialDashUiStyles.withThemeWithThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithThemeCreatorOption[Theme] extends js.Object {
  var defaultTheme: js.UndefOr[Theme] = js.undefined
}

object WithThemeCreatorOption {
  @scala.inline
  def apply[Theme](defaultTheme: Theme = null): WithThemeCreatorOption[Theme] = {
    val __obj = js.Dynamic.literal()
    if (defaultTheme != null) __obj.updateDynamic("defaultTheme")(defaultTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithThemeCreatorOption[Theme]]
  }
}

