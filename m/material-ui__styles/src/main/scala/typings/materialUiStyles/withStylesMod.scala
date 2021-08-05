package typings.materialUiStyles

import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.PropsOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.materialUiStyles.withStylesWithStylesMod.Styles
import typings.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.WithStyles
import typings.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typings.materialUiTypes.mod.PropInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withStylesMod {
  
  @JSImport("@material-ui/styles/withStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[StylesType /* <: Styles[js.Any, js.Any, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ]]
  inline def default[StylesType /* <: Styles[js.Any, js.Any, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ]]
}
