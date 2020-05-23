package typings.materialUiStyles.anon

import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable
import typings.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme[StylesType /* <: ClassKeyInferable[_, _] */] extends js.Object {
  var theme: ThemeOfStyles[StylesType]
}

object Theme {
  @scala.inline
  def apply[StylesType](theme: ThemeOfStyles[StylesType]): Theme[StylesType] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme[StylesType]]
  }
}

