package typings.grommet.themeContextMod

import typings.grommet.anon.ValueThemeValue
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeContextI extends Context[ThemeValue] {
  var Extend: FC[ValueThemeValue]
}

object ThemeContextI {
  @scala.inline
  def apply(
    Consumer: Consumer[ThemeValue],
    Extend: FC[ValueThemeValue],
    Provider: Provider[ThemeValue],
    displayName: String = null
  ): ThemeContextI = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeContextI]
  }
}

