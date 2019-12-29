package typings.atMaterialDashUiStyles

import typings.atMaterialDashUiStyles.withStylesWithStylesMod.Styles
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.WithStyles
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.WithStylesOptions
import typings.atMaterialDashUiTypes.atMaterialDashUiTypesMod.PropInjector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/withStyles", JSImport.Namespace)
@js.native
object withStylesMod extends js.Object {
  def default[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentPropsClassKeyOfStylesStylesTypeProp[StylesType]
  ] = js.native
  def default[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentPropsClassKeyOfStylesStylesTypeProp[StylesType]
  ] = js.native
}

