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
  open class ServerStyleSheets () extends default {
    def this(options: js.Object) = this()
  }
  
  @JSImport("@material-ui/styles", "StylesContext")
  @js.native
  val StylesContext: Context[StylesOptions] = js.native
  
  @JSImport("@material-ui/styles", "StylesProvider")
  @js.native
  val StylesProvider: ComponentType[StylesProviderProps] = js.native
  
  inline def ThemeProvider[T](props: ThemeProviderProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def createGenerateClassName(): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")().asInstanceOf[GenerateId]
  inline def createGenerateClassName(options: GenerateClassNameOptions): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")(options.asInstanceOf[js.Any]).asInstanceOf[GenerateId]
  
  inline def createStyles[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleRules[Props, ClassKey]]
  
  inline def getThemeProps[Theme /* <: ThemeWithProps[Any] */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name, Theme]): Props & (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeProps")(params.asInstanceOf[js.Any]).asInstanceOf[Props & (ThemedProps[Theme, Name])]
  
  inline def jssPreset(): JssOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("jssPreset")().asInstanceOf[JssOptions]
  
  inline def makeStyles[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): js.Function1[js.UndefOr[Any | (/* props */ Props)], ClassNameMap[ClassKey]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[js.UndefOr[Any | (/* props */ Props)], ClassNameMap[ClassKey]]]
  
  inline def makeStyles_withTheme[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[js.UndefOr[Any | (/* props */ Props)], ClassNameMap[ClassKey]] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[js.UndefOr[Any | (/* props */ Props)], ClassNameMap[ClassKey]]]
  
  inline def mergeClasses(): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClasses")().asInstanceOf[Classes]
  inline def mergeClasses(options: MergeClassesOption): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClasses")(options.asInstanceOf[js.Any]).asInstanceOf[Classes]
  
  inline def styled[Component /* <: ElementType[Any] */](Component: Component): ComponentCreator[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentCreator[Component]]
  
  inline def useTheme[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[T]
  
  inline def withStyles[StylesType /* <: Styles[Any, Any, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
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
  inline def withStyles[StylesType /* <: Styles[Any, Any, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
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
  
  inline def withTheme[Theme](component: ComponentClass[ConsistentWith[ComponentProps[Any], WithTheme[Theme]], ComponentState]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClass[ConsistentWith[ComponentProps[Any], WithTheme[Theme]], ComponentState], 
        ComponentProps[
          ComponentClass[ConsistentWith[ComponentProps[Any], WithTheme[Theme]], ComponentState]
        ]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClass[ConsistentWith[ComponentProps[Any], WithTheme[Theme]], ComponentState], 
        ComponentProps[
          ComponentClass[ConsistentWith[ComponentProps[Any], WithTheme[Theme]], ComponentState]
        ]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ]]
  inline def withTheme[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ]]
  
  inline def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeCreator")().asInstanceOf[PropInjector[WithTheme[Theme], ThemedComponentProps]]
  inline def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeCreator")(option.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithTheme[Theme], ThemedComponentProps]]
}
