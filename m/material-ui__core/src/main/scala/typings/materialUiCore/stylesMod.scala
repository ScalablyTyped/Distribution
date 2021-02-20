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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("@material-ui/core/styles", "MuiThemeProvider")
  @js.native
  val MuiThemeProvider: ComponentType[MuiThemeProviderProps] = js.native
  
  @JSImport("@material-ui/core/styles", "createGenerateClassName")
  @js.native
  def createGenerateClassName(): js.Any = js.native
  @JSImport("@material-ui/core/styles", "createGenerateClassName")
  @js.native
  def createGenerateClassName(options: GenerateClassNameOptions): js.Any = js.native
  
  @JSImport("@material-ui/core/styles", "createMuiTheme")
  @js.native
  def createMuiTheme(): Theme = js.native
  @JSImport("@material-ui/core/styles", "createMuiTheme")
  @js.native
  def createMuiTheme(options: ThemeOptions): Theme = js.native
  
  @JSImport("@material-ui/core/styles", "createStyles")
  @js.native
  def createStyles[C /* <: String */](styles: StyleRules[C]): StyleRules[C] = js.native
  
  @JSImport("@material-ui/core/styles", "jssPreset")
  @js.native
  def jssPreset(): js.Any = js.native
  
  @JSImport("@material-ui/core/styles", "withStyles")
  @js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  @JSImport("@material-ui/core/styles", "withStyles")
  @js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  @JSImport("@material-ui/core/styles", "withStyles")
  @js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  @JSImport("@material-ui/core/styles", "withStyles")
  @js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  
  @JSImport("@material-ui/core/styles", "withTheme")
  @js.native
  def withTheme(): PropInjector[WithTheme, ThemedComponentProps] = js.native
}
