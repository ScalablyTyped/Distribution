package typings.materialUiStyles.withStylesWithStylesMod

import typings.materialUiTypes.mod.PropInjector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/withStyles/withStyles", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
  def apply[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
}

