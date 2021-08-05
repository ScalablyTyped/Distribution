package typings.materialUiCore

import typings.materialUiCore.createGenerateClassNameMod.GenerateClassNameOptions
import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.createMuiThemeMod.ThemeOptions
import typings.materialUiCore.mod.PropInjector
import typings.materialUiCore.muiThemeProviderMod.MuiThemeProviderProps
import typings.materialUiCore.withStylesMod.StyleRules
import typings.materialUiCore.withStylesMod.StyleRulesCallback
import typings.materialUiCore.withStylesMod.StyledComponentProps
import typings.materialUiCore.withStylesMod.WithStyles
import typings.materialUiCore.withStylesMod.WithStylesOptions
import typings.materialUiCore.withThemeMod.ThemedComponentProps
import typings.materialUiCore.withThemeMod.WithTheme
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("@material-ui/core/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@material-ui/core/styles", "MuiThemeProvider")
  @js.native
  val MuiThemeProvider: ComponentType[MuiThemeProviderProps] = js.native
  
  inline def createGenerateClassName(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")().asInstanceOf[js.Any]
  inline def createGenerateClassName(options: GenerateClassNameOptions): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def createMuiTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")().asInstanceOf[Theme]
  inline def createMuiTheme(options: ThemeOptions): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(options.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  inline def createStyles[C /* <: String */](styles: StyleRules[C]): StyleRules[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleRules[C]]
  
  inline def jssPreset(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jssPreset")().asInstanceOf[js.Any]
  
  inline def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ]]
  inline def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ]]
  inline def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ]]
  inline def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ]]
  
  inline def withTheme(): PropInjector[WithTheme, ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")().asInstanceOf[PropInjector[WithTheme, ThemedComponentProps]]
}
