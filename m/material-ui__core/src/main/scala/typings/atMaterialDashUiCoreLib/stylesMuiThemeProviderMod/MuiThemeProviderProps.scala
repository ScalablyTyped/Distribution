package typings
package atMaterialDashUiCoreLib.stylesMuiThemeProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiThemeProviderProps extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var disableStylesGeneration: js.UndefOr[scala.Boolean] = js.undefined
  var sheetsManager: js.UndefOr[
    stdLib.Map[
      atMaterialDashUiCoreLib.stylesWithStylesMod.StylesCreator, 
      stdLib.Map[atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme, SheetManagerTheme]
    ]
  ] = js.undefined
  var theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme | (js.Function1[
    /* outer */ atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme | scala.Null, 
    atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme
  ])
}

object MuiThemeProviderProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme | (js.Function1[
      /* outer */ atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme | scala.Null, 
      atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme
    ]),
    disableStylesGeneration: js.UndefOr[scala.Boolean] = js.undefined,
    sheetsManager: stdLib.Map[
      atMaterialDashUiCoreLib.stylesWithStylesMod.StylesCreator, 
      stdLib.Map[atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme, SheetManagerTheme]
    ] = null
  ): MuiThemeProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration)
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager)
    __obj.asInstanceOf[MuiThemeProviderProps]
  }
}

