package typings.materialUiStyles

import typings.materialUiStyles.defaultThemeMod.DefaultTheme
import typings.materialUiStyles.materialUiStylesStrings.innerRef
import typings.materialUiStyles.materialUiStylesStrings.theme
import typings.materialUiTypes.mod.ConsistentWith
import typings.materialUiTypes.mod.Omit
import typings.materialUiTypes.mod.PropInjector
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.Ref
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withThemeWithThemeMod {
  
  @JSImport("@material-ui/styles/withTheme/withTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme](
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
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
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
  inline def default[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[js.Any], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ]]
  
  inline def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeCreator")().asInstanceOf[PropInjector[WithTheme[Theme], ThemedComponentProps]]
  inline def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeCreator")(option.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithTheme[Theme], ThemedComponentProps]]
  
  /* Inlined parent std.Partial<@material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<@material-ui/styles.@material-ui/styles/defaultTheme.DefaultTheme>> */
  trait ThemedComponentProps extends StObject {
    
    var innerRef: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var ref: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var theme: js.UndefOr[DefaultTheme] = js.undefined
  }
  object ThemedComponentProps {
    
    inline def apply(): ThemedComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemedComponentProps]
    }
    
    extension [Self <: ThemedComponentProps](x: Self) {
      
      inline def setInnerRef(value: Ref[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setRef(value: Ref[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setTheme(value: DefaultTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait WithTheme[Theme] extends StObject {
    
    /**
      * Deprecated. Will be removed in v5. Refs are now automatically forwarded to
      * the inner component.
      * @deprecated since version 4.0
      */
    var innerRef: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var theme: Theme
  }
  object WithTheme {
    
    inline def apply[Theme](theme: Theme): WithTheme[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithTheme[Theme]]
    }
    
    extension [Self <: WithTheme[?], Theme](x: Self & WithTheme[Theme]) {
      
      inline def setInnerRef(value: Ref[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithThemeCreatorOption[Theme] extends StObject {
    
    var defaultTheme: js.UndefOr[Theme] = js.undefined
  }
  object WithThemeCreatorOption {
    
    inline def apply[Theme](): WithThemeCreatorOption[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithThemeCreatorOption[Theme]]
    }
    
    extension [Self <: WithThemeCreatorOption[?], Theme](x: Self & WithThemeCreatorOption[Theme]) {
      
      inline def setDefaultTheme(value: Theme): Self = StObject.set(x, "defaultTheme", value.asInstanceOf[js.Any])
      
      inline def setDefaultThemeUndefined: Self = StObject.set(x, "defaultTheme", js.undefined)
    }
  }
}
