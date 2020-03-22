package typings.materialUiStyles

import org.scalablytyped.runtime.TopLevel
import typings.jss.mod.GenerateId
import typings.jss.mod.JssOptions
import typings.materialUiStyles.createGenerateClassNameCreateGenerateClassNameMod.GenerateClassNameOptions
import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemedProps
import typings.materialUiStyles.materialUiStylesStrings.withTheme
import typings.materialUiStyles.mergeClassesMergeClassesMod.Classes
import typings.materialUiStyles.mergeClassesMergeClassesMod.MergeClassesOption
import typings.materialUiStyles.serverStyleSheetsMod.default
import typings.materialUiStyles.styledStyledMod.ComponentCreator
import typings.materialUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typings.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typings.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typings.materialUiStyles.withStylesWithStylesMod.PropsOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.StyleRules
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.materialUiStyles.withStylesWithStylesMod.Styles
import typings.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.WithStyles
import typings.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typings.materialUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typings.materialUiStyles.withThemeWithThemeMod.WithTheme
import typings.materialUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typings.materialUiTypes.mod.ConsistentWith
import typings.materialUiTypes.mod.Omit
import typings.materialUiTypes.mod.PropInjector
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod._Global_.JSX.LibraryManagedAttributes
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ServerStyleSheets () extends default {
    def this(options: js.Object) = this()
  }
  
  @js.native
  class StylesProvider protected ()
    extends Component[StylesProviderProps, ComponentState, js.Any] {
    def this(props: StylesProviderProps) = this()
    def this(props: StylesProviderProps, context: js.Any) = this()
  }
  
  val StylesContext: Context[StylesOptions] = js.native
  def ThemeProvider[T](props: ThemeProviderProps[T]): ReactElement = js.native
  def createGenerateClassName(): GenerateId = js.native
  def createGenerateClassName(options: GenerateClassNameOptions): GenerateId = js.native
  def createStyles[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = js.native
  def getThemeProps[Theme /* <: ThemeWithProps[_] */, Props, Name /* <: String */](params: AnonName[Props, Name, Theme]): Props with (ThemedProps[Theme, Name]) = js.native
  def jssPreset(): JssOptions = js.native
  def makeStyles[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = js.native
  @JSName("makeStyles")
  def makeStyles_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = js.native
  @JSName("makeStyles")
  def makeStyles_withTheme[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = js.native
  @JSName("makeStyles")
  def makeStyles_withTheme_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = js.native
  def mergeClasses(): Classes = js.native
  def mergeClasses(options: MergeClassesOption): Classes = js.native
  def styled[Component /* <: ElementType[_] */](Component: Component): ComponentCreator[Component] = js.native
  def useTheme[T](): T = js.native
  def withStyles[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
  def withStyles[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
  def withTheme[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState], 
        ComponentProps[
          ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]
        ]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def withTheme[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  @js.native
  object StylesProvider extends TopLevel[ComponentType[StylesProviderProps]]
  
}

