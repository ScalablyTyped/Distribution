package typings.materialUiStyles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeTheme[Theme] extends js.Object {
  var theme: Theme
}

object ThemeTheme {
  @scala.inline
  def apply[Theme](theme: Theme): ThemeTheme[Theme] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeTheme[Theme]]
  }
}

