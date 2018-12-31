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

