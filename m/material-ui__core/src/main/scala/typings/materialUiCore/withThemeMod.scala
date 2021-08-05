package typings.materialUiCore

import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.mod.PropInjector
import typings.react.mod.Ref
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withThemeMod {
  
  @JSImport("@material-ui/core/styles/withTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): PropInjector[WithTheme, ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropInjector[WithTheme, ThemedComponentProps]]
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/withTheme.WithTheme> */
  trait ThemedComponentProps extends StObject {
    
    var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object ThemedComponentProps {
    
    inline def apply(): ThemedComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemedComponentProps]
    }
    
    extension [Self <: ThemedComponentProps](x: Self) {
      
      inline def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait WithTheme extends StObject {
    
    var theme: Theme
  }
  object WithTheme {
    
    inline def apply(theme: Theme): WithTheme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithTheme]
    }
    
    extension [Self <: WithTheme](x: Self) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
