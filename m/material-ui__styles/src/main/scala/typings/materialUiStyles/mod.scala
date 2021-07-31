package typings.materialUiStyles

import typings.jss.mod.GenerateId
import typings.jss.mod.JssOptions
import typings.materialUiStyles.anon.NameProps
import typings.materialUiStyles.createGenerateClassNameCreateGenerateClassNameMod.GenerateClassNameOptions
import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemedProps
import typings.materialUiStyles.materialUiStylesStrings.innerRef
import typings.materialUiStyles.materialUiStylesStrings.theme
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
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material-ui/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@material-ui/styles", "ServerStyleSheets")
  @js.native
  class ServerStyleSheets () extends default {
    def this(options: js.Object) = this()
  }
  
  @JSImport("@material-ui/styles", "StylesContext")
  @js.native
  val StylesContext: Context[StylesOptions] = js.native
  
  @JSImport("@material-ui/styles", "StylesProvider")
  @js.native
  val StylesProvider: ComponentType[StylesProviderProps] = js.native
  
  @scala.inline
  def ThemeProvider[T](props: ThemeProviderProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @scala.inline
  def createGenerateClassName(): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")().asInstanceOf[GenerateId]
  @scala.inline
  def createGenerateClassName(options: GenerateClassNameOptions): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")(options.asInstanceOf[js.Any]).asInstanceOf[GenerateId]
  
  @scala.inline
  def createStyles[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleRules[Props, ClassKey]]
  
  @scala.inline
  def getThemeProps[Theme /* <: ThemeWithProps[js.Any] */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name, Theme]): Props & (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeProps")(params.asInstanceOf[js.Any]).asInstanceOf[Props & (ThemedProps[Theme, Name])]
  
  @scala.inline
  def jssPreset(): JssOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("jssPreset")().asInstanceOf[JssOptions]
  
  @scala.inline
  def makeStyles[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(style.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]]]
  
  @scala.inline
  def makeStyles_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ Props, ClassNameMap[ClassKey]]]
  
  @scala.inline
  def makeStyles_withTheme[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]]]
  
  @scala.inline
  def makeStyles_withTheme_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Props, ClassNameMap[ClassKey]]]
  
  @scala.inline
  def mergeClasses(): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClasses")().asInstanceOf[Classes]
  @scala.inline
  def mergeClasses(options: MergeClassesOption): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClasses")(options.asInstanceOf[js.Any]).asInstanceOf[Classes]
  
  @scala.inline
  def styled[Component /* <: ElementType[js.Any] */](Component: Component): ComponentCreator[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentCreator[Component]]
  
  @scala.inline
  def useTheme[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[T]
  
  @scala.inline
  def withStyles[StylesType /* <: Styles[js.Any, js.Any, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ]]
  @scala.inline
  def withStyles[StylesType /* <: Styles[js.Any, js.Any, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ]]
  
  @scala.inline
  def withTheme[Theme](
    component: ComponentClass[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]], ComponentState]
  ): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClass[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]], ComponentState], 
        ComponentProps[
          ComponentClass[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]], ComponentState]
        ]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClass[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]], ComponentState], 
        ComponentProps[
          ComponentClass[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]], ComponentState]
        ]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ]]
  @scala.inline
  def withTheme[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ]]
  
  @scala.inline
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeCreator")().asInstanceOf[PropInjector[WithTheme[Theme], ThemedComponentProps]]
  @scala.inline
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeCreator")(option.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithTheme[Theme], ThemedComponentProps]]
}
