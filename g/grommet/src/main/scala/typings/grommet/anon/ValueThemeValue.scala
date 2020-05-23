package typings.grommet.anon

import typings.grommet.themeContextMod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueThemeValue extends js.Object {
  var value: ThemeValue
}

object ValueThemeValue {
  @scala.inline
  def apply(value: ThemeValue): ValueThemeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueThemeValue]
  }
}

