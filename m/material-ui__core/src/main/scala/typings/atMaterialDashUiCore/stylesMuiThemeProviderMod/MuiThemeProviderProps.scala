package typings.atMaterialDashUiCore.stylesMuiThemeProviderMod

import typings.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typings.atMaterialDashUiCore.stylesWithStylesMod.StylesCreator
import typings.react.reactMod.ReactNode
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiThemeProviderProps extends js.Object {
  var children: ReactNode
  var disableStylesGeneration: js.UndefOr[Boolean] = js.undefined
  var sheetsManager: js.UndefOr[Map[StylesCreator, Map[Theme, SheetManagerTheme]]] = js.undefined
  var theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme])
}

object MuiThemeProviderProps {
  @scala.inline
  def apply(
    theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme]),
    children: ReactNode = null,
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    sheetsManager: Map[StylesCreator, Map[Theme, SheetManagerTheme]] = null
  ): MuiThemeProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration)
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager)
    __obj.asInstanceOf[MuiThemeProviderProps]
  }
}

