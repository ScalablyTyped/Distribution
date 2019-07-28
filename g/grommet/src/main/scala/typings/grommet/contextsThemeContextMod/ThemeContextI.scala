package typings.grommet.contextsThemeContextMod

import typings.grommet.Anon_Value
import typings.react.reactMod.Consumer
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import typings.react.reactMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeContextI extends Context[ThemeValue] {
  var Extend: FC[Anon_Value]
}

object ThemeContextI {
  @scala.inline
  def apply(
    Consumer: Consumer[ThemeValue],
    Extend: FC[Anon_Value],
    Provider: Provider[ThemeValue],
    displayName: String = null
  ): ThemeContextI = {
    val __obj = js.Dynamic.literal(Consumer = Consumer, Extend = Extend, Provider = Provider)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[ThemeContextI]
  }
}

