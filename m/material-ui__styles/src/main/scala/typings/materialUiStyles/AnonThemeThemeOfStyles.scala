package typings.materialUiStyles

import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable
import typings.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeThemeOfStyles[StylesType /* <: ClassKeyInferable[_, _] */] extends js.Object {
  var theme: ThemeOfStyles[StylesType]
}

object AnonThemeThemeOfStyles {
  @scala.inline
  def apply[StylesType /* <: ClassKeyInferable[_, _] */](theme: ThemeOfStyles[StylesType]): AnonThemeThemeOfStyles[StylesType] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonThemeThemeOfStyles[StylesType]]
  }
}

