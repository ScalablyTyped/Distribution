package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropInjector
import typings.atMaterialDashUiCore.stylesCreateGenerateClassNameMod.GenerateClassNameOptions
import typings.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typings.atMaterialDashUiCore.stylesCreateMuiThemeMod.ThemeOptions
import typings.atMaterialDashUiCore.stylesMuiThemeProviderMod.MuiThemeProviderProps
import typings.atMaterialDashUiCore.stylesWithStylesMod.StyleRules
import typings.atMaterialDashUiCore.stylesWithStylesMod.StyleRulesCallback
import typings.atMaterialDashUiCore.stylesWithStylesMod.StyledComponentProps
import typings.atMaterialDashUiCore.stylesWithStylesMod.WithStyles
import typings.atMaterialDashUiCore.stylesWithStylesMod.WithStylesOptions
import typings.atMaterialDashUiCore.stylesWithThemeMod.ThemedComponentProps
import typings.atMaterialDashUiCore.stylesWithThemeMod.WithTheme
import typings.jss.jssMod.GenerateClassName
import typings.jss.jssMod.JSSOptions
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  @js.native
  class MuiThemeProvider protected ()
    extends Component[MuiThemeProviderProps, ComponentState, js.Any] {
    def this(props: MuiThemeProviderProps) = this()
    def this(props: MuiThemeProviderProps, context: js.Any) = this()
  }
  
  val MuiThemeProvider: ComponentType[MuiThemeProviderProps] = js.native
  def createGenerateClassName(): GenerateClassName[_] = js.native
  def createGenerateClassName(options: GenerateClassNameOptions): GenerateClassName[_] = js.native
  def createMuiTheme(): Theme = js.native
  def createMuiTheme(options: ThemeOptions): Theme = js.native
  def createStyles[C /* <: String */](styles: StyleRules[C]): StyleRules[C] = js.native
  def jssPreset(): JSSOptions = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: ImportType.apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: ImportType.apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: ImportType.apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: ImportType.apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withTheme(): PropInjector[WithTheme, ThemedComponentProps] = js.native
}

