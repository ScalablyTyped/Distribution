package typings.materialUiCore

import typings.materialUiCore.anon.Classes
import typings.materialUiCore.createThemeMod.Theme
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.materialUiStyles.withStylesWithStylesMod.Styles
import typings.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typings.materialUiTypes.mod.PropInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withStylesMod {
  
  @JSImport("@material-ui/core/styles/withStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[Theme] */, Props /* <: js.Object */](style: Styles[Theme, Props, ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ]]
  inline def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[Theme] */, Props /* <: js.Object */](style: Styles[Theme, Props, ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ]]
  
  type StyleRules[ClassKey /* <: String */, Props /* <: js.Object */] = typings.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]
  
  type WithStyles[StylesOrClassKey /* <: String | (Styles[Any, Any, Any]) */, IncludeTheme /* <: js.UndefOr[Boolean] */] = (js.Object | typings.materialUiCore.anon.Theme) & Classes[StylesOrClassKey]
}
