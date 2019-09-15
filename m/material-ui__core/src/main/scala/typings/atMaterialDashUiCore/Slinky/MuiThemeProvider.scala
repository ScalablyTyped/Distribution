package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typings.atMaterialDashUiCore.stylesMuiThemeProviderMod.MuiThemeProviderProps
import typings.atMaterialDashUiCore.stylesMuiThemeProviderMod.SheetManagerTheme
import typings.atMaterialDashUiCore.stylesMuiThemeProviderMod.default
import typings.atMaterialDashUiCore.stylesWithStylesMod.StylesCreator
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MuiThemeProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.stylesMuiThemeProviderMod.default].asInstanceOf[String | js.Object]
  def apply(
    theme: Theme | (js.Function1[/* outer */ Theme | Null, Theme]),
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    sheetsManager: Map[StylesCreator, Map[Theme, SheetManagerTheme]] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration)
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MuiThemeProviderProps
}

