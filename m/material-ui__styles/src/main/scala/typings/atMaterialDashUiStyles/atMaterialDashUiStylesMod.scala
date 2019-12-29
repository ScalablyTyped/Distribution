package typings.atMaterialDashUiStyles

import org.scalablytyped.runtime.TopLevel
import typings.atMaterialDashUiStyles.createGenerateClassNameCreateGenerateClassNameMod.GenerateClassNameOptions
import typings.atMaterialDashUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typings.atMaterialDashUiStyles.getThemePropsGetThemePropsMod.ThemedProps
import typings.atMaterialDashUiStyles.makeStylesMakeStylesMod.StylesHook
import typings.atMaterialDashUiStyles.mergeClassesMergeClassesMod.Classes
import typings.atMaterialDashUiStyles.mergeClassesMergeClassesMod.MergeClassesOption
import typings.atMaterialDashUiStyles.serverStyleSheetsMod.default
import typings.atMaterialDashUiStyles.styledStyledMod.ComponentCreator
import typings.atMaterialDashUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typings.atMaterialDashUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typings.atMaterialDashUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.StyleRules
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.Styles
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.WithStyles
import typings.atMaterialDashUiStyles.withStylesWithStylesMod.WithStylesOptions
import typings.atMaterialDashUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typings.atMaterialDashUiStyles.withThemeWithThemeMod.WithTheme
import typings.atMaterialDashUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typings.atMaterialDashUiTypes.atMaterialDashUiTypesMod.PropInjector
import typings.jss.jssMod.GenerateId
import typings.jss.jssMod.JssOptions
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.ElementType
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles", JSImport.Namespace)
@js.native
object atMaterialDashUiStylesMod extends js.Object {
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
  def getThemeProps[Theme /* <: ThemeWithProps[_] */, Props, Name /* <: String */](params: Anon_Name[Props, Name, Theme]): Props with (ThemedProps[Theme, Name]) = js.native
  def jssPreset(): JssOptions = js.native
  def makeStyles[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): StylesHook[Styles[Theme, Props, ClassKey]] = js.native
  def makeStyles[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: OmitWithStylesOptionsThemewithTheme[Theme]): StylesHook[Styles[Theme, Props, ClassKey]] = js.native
  def mergeClasses(): Classes = js.native
  def mergeClasses(options: MergeClassesOption): Classes = js.native
  def styled[Component /* <: ElementType[_] */](Component: Component): ComponentCreator[Component] = js.native
  def useTheme[T](): T = js.native
  def withStyles[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentPropsClassKeyOfStylesStylesTypeProp[StylesType]
  ] = js.native
  def withStyles[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentPropsClassKeyOfStylesStylesTypeProp[StylesType]
  ] = js.native
  def withTheme[Theme](component: ComponentClass[js.Object, ComponentState]): ComponentType[OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme]] = js.native
  def withTheme[Theme](component: FunctionComponent[js.Object]): ComponentType[OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme]] = js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  @js.native
  object StylesProvider extends TopLevel[ComponentType[StylesProviderProps]]
  
}

