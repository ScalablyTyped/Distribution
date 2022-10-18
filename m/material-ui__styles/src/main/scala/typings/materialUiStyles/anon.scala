package typings.materialUiStyles

import typings.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyInferable
import typings.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typings.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName[Theme] extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object ClassName {
    
    inline def apply[Theme](): ClassName[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName[Theme]]
    }
    
    extension [Self <: ClassName[?], Theme](x: Self & ClassName[Theme]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Classes[StylesType /* <: ClassKeyInferable[Any, Any] */] extends StObject {
    
    var classes: ClassNameMap[ClassKeyOfStyles[StylesType]]
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
  }
  object Classes {
    
    inline def apply[StylesType /* <: ClassKeyInferable[Any, Any] */](classes: ClassNameMap[ClassKeyOfStyles[StylesType]]): Classes[StylesType] = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes[StylesType]]
    }
    
    extension [Self <: Classes[?], StylesType /* <: ClassKeyInferable[Any, Any] */](x: Self & Classes[StylesType]) {
      
      inline def setClasses(value: ClassNameMap[ClassKeyOfStyles[StylesType]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
  
  trait NameProps[Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[Any] */] extends StObject {
    
    var name: Name
    
    var props: Props
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object NameProps {
    
    inline def apply[Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[Any] */](name: Name, props: Props): NameProps[Props, Name, Theme] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameProps[Props, Name, Theme]]
    }
    
    extension [Self <: NameProps[?, ?, ?], Props, Name /* <: /* keyof any */ String */, Theme /* <: ThemeWithProps[Any] */](x: Self & (NameProps[Props, Name, Theme])) {
      
      inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ThemeTheme[Theme] extends StObject {
    
    var theme: Theme
  }
  object ThemeTheme {
    
    inline def apply[Theme](theme: Theme): ThemeTheme[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeTheme[Theme]]
    }
    
    extension [Self <: ThemeTheme[?], Theme](x: Self & ThemeTheme[Theme]) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
