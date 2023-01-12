package typings.materialUiSystem

import typings.materialUiSystem.materialUiSystemStrings.theme
import typings.materialUiSystem.mod.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Css[Props] extends StObject {
    
    var css: js.UndefOr[Omit[Props, theme]] = js.undefined
    
    var sx: js.UndefOr[Omit[Props, theme]] = js.undefined
  }
  object Css {
    
    inline def apply[Props](): Css[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Css[Props]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Css[?], Props] (val x: Self & Css[Props]) extends AnyVal {
      
      inline def setCss(value: Omit[Props, theme]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setSx(value: Omit[Props, theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    }
  }
  
  trait Sx[Props] extends StObject {
    
    var css: js.UndefOr[Omit[Props, theme]] = js.undefined
    
    var sx: js.UndefOr[Omit[Props, theme]] = js.undefined
  }
  object Sx {
    
    inline def apply[Props](): Sx[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sx[Props]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sx[?], Props] (val x: Self & Sx[Props]) extends AnyVal {
      
      inline def setCss(value: Omit[Props, theme]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setSx(value: Omit[Props, theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    }
  }
  
  trait ThemeTheme[Theme /* <: js.Object */] extends StObject {
    
    var theme: Theme
  }
  object ThemeTheme {
    
    inline def apply[Theme /* <: js.Object */](theme: Theme): ThemeTheme[Theme] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeTheme[Theme]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeTheme[?], Theme /* <: js.Object */] (val x: Self & ThemeTheme[Theme]) extends AnyVal {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
