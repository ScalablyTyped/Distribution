package typings.materialUiCore

import typings.jss.mod.GenerateId
import typings.jss.mod.JssOptions
import typings.materialUiCore.stylesColorManipulatorMod.ColorObject
import typings.materialUiCore.stylesCreateThemeMod.Theme
import typings.materialUiCore.stylesCreateThemeMod.ThemeOptions
import typings.materialUiCore.stylesResponsiveFontSizesMod.ResponsiveFontSizesOptions
import typings.materialUiCore.stylesStyledMod.ComponentCreator
import typings.materialUiCore.stylesTransitionsMod.Duration_
import typings.materialUiCore.stylesTransitionsMod.Easing_
import typings.materialUiCore.stylesWithStylesMod.WithStyles
import typings.materialUiCore.stylesWithThemeMod.ThemedComponentProps
import typings.materialUiCore.stylesWithThemeMod.WithTheme
import typings.materialUiStyles.createGenerateClassNameCreateGenerateClassNameMod.GenerateClassNameOptions
import typings.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typings.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typings.materialUiStyles.withStylesWithStylesMod.StyleRules
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.materialUiStyles.withStylesWithStylesMod.Styles
import typings.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typings.materialUiTypes.mod.Omit
import typings.materialUiTypes.mod.PropInjector
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("@material-ui/core/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MuiThemeProvider[T](props: ThemeProviderProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MuiThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@material-ui/core/styles", "ServerStyleSheets")
  @js.native
  open class ServerStyleSheets ()
    extends typings.materialUiStyles.mod.ServerStyleSheets {
    def this(options: js.Object) = this()
  }
  
  @JSImport("@material-ui/core/styles", "StylesProvider")
  @js.native
  val StylesProvider: ComponentType[StylesProviderProps] = js.native
  
  inline def ThemeProvider[T](props: ThemeProviderProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def alpha(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("alpha")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createGenerateClassName(): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")().asInstanceOf[GenerateId]
  inline def createGenerateClassName(options: GenerateClassNameOptions): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")(options.asInstanceOf[js.Any]).asInstanceOf[GenerateId]
  
  inline def createMuiTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  inline def createMuiTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  
  inline def createStyles[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleRules[Props, ClassKey]]
  
  inline def createTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  inline def createTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  
  inline def darken(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decomposeColor(color: String): ColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[ColorObject]
  
  @JSImport("@material-ui/core/styles", "duration")
  @js.native
  val duration: Duration_ = js.native
  
  @JSImport("@material-ui/core/styles", "easing")
  @js.native
  val easing: Easing_ = js.native
  
  inline def emphasize(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def emphasize(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fade(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fade")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMs(milliseconds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMs")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getContrastRatio(foreground: String, background: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLuminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexToRgb(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hslToRgb(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def jssPreset(): JssOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("jssPreset")().asInstanceOf[JssOptions]
  
  inline def lighten(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def makeStyles[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): /* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any]
  
  inline def makeStyles_withTheme[Theme, Props /* <: js.Object */, ClassKey /* <: String */](
    styles: Styles[Theme, Props, ClassKey],
    options: Omit[WithStylesOptions[Theme], typings.materialUiCore.materialUiCoreStrings.withTheme]
  ): /* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any]
  
  inline def recomposeColor(color: ColorObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def responsiveFontSizes(theme: Theme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSizes")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def responsiveFontSizes(theme: Theme, options: ResponsiveFontSizesOptions): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSizes")(theme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  inline def rgbToHex(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def styled[Component /* <: ElementType[Any] */](Component: Component): ComponentCreator[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentCreator[Component]]
  
  inline def unstableCreateMuiStrictModeTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createMuiStrictModeTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  inline def unstableCreateMuiStrictModeTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createMuiStrictModeTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  
  inline def useTheme[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[T]
  
  inline def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[Theme] */, Props /* <: js.Object */](style: Styles[Theme, Props, ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ]]
  inline def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[Theme] */, Props /* <: js.Object */](style: Styles[Theme, Props, ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ]]
  
  @JSImport("@material-ui/core/styles", "withTheme")
  @js.native
  val withTheme: PropInjector[WithTheme, ThemedComponentProps] = js.native
}
