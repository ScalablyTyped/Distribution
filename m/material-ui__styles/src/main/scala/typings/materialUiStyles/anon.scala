package typings.materialUiStyles

import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable
import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typings.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typings.react.mod.Ref
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName[Theme] extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object ClassName {
    
    @scala.inline
    def apply[Theme](): ClassName[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName[Theme]]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName[?], Theme] (val x: Self & ClassName[Theme]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Classes[StylesType /* <: ClassKeyInferable[js.Any, js.Any] */] extends StObject {
    
    var classes: ClassNameMap[ClassKeyOfStyles[StylesType]]
    
    var innerRef: js.UndefOr[Ref[js.Any]] = js.undefined
  }
  object Classes {
    
    @scala.inline
    def apply[StylesType /* <: ClassKeyInferable[js.Any, js.Any] */](classes: ClassNameMap[ClassKeyOfStyles[StylesType]]): Classes[StylesType] = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes[StylesType]]
    }
    
    @scala.inline
    implicit class ClassesMutableBuilder[Self <: Classes[?], StylesType /* <: ClassKeyInferable[js.Any, js.Any] */] (val x: Self & Classes[StylesType]) extends AnyVal {
      
      @scala.inline
      def setClasses(value: ClassNameMap[ClassKeyOfStyles[StylesType]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRef(value: Ref[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
  
  trait NameProps[Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[js.Any] */] extends StObject {
    
    var name: Name
    
    var props: Props
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object NameProps {
    
    @scala.inline
    def apply[Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[js.Any] */](name: Name, props: Props): NameProps[Props, Name, Theme] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameProps[Props, Name, Theme]]
    }
    
    @scala.inline
    implicit class NamePropsMutableBuilder[Self <: NameProps[?, ?, ?], Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[js.Any] */] (val x: Self & (NameProps[Props, Name, Theme])) extends AnyVal {
      
      @scala.inline
      def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Props[Name /* <: /* keyof any */ String */] extends StObject {
    
    var props: Record[
        Name, 
        /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
      ]
  }
  object Props {
    
    @scala.inline
    def apply[Name /* <: /* keyof any */ String */](
      props: Record[
          Name, 
          /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
        ]
    ): Props[Name] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[Name]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[?], Name /* <: /* keyof any */ String */] (val x: Self & Props[Name]) extends AnyVal {
      
      @scala.inline
      def setProps(
        value: Record[
              Name, 
              /* import warning: importer.ImportType#apply Failed type conversion: infer Props */ js.Any
            ]
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Theme[StylesType /* <: ClassKeyInferable[js.Any, js.Any] */] extends StObject {
    
    var theme: ThemeOfStyles[StylesType]
  }
  object Theme {
    
    @scala.inline
    def apply[StylesType /* <: ClassKeyInferable[js.Any, js.Any] */](theme: ThemeOfStyles[StylesType]): Theme[StylesType] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme[StylesType]]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme[?], StylesType /* <: ClassKeyInferable[js.Any, js.Any] */] (val x: Self & Theme[StylesType]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: ThemeOfStyles[StylesType]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeTheme[Theme] extends StObject {
    
    var theme: Theme
  }
  object ThemeTheme {
    
    @scala.inline
    def apply[Theme](theme: Theme): ThemeTheme[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeTheme[Theme]]
    }
    
    @scala.inline
    implicit class ThemeThemeMutableBuilder[Self <: ThemeTheme[?], Theme] (val x: Self & ThemeTheme[Theme]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
