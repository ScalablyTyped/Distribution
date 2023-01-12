package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.stylesCreateThemeMod.Theme
import typings.materialUiTypes.mod.PropInjector
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesWithThemeMod extends Shortcut {
  
  @JSImport("@material-ui/core/styles/withTheme", JSImport.Default)
  @js.native
  val default: PropInjector[WithTheme, ThemedComponentProps] = js.native
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/withTheme.WithTheme> */
  trait ThemedComponentProps extends StObject {
    
    /**
      * Deprecated. Will be removed in v5. Refs are now automatically forwarded to
      * the inner component.
      * @deprecated since version 4.0
      */
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object ThemedComponentProps {
    
    inline def apply(): ThemedComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemedComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemedComponentProps] (val x: Self) extends AnyVal {
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithTheme] (val x: Self) extends AnyVal {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = PropInjector[WithTheme, ThemedComponentProps]
  
  /* This means you don't have to write `default`, but can instead just say `stylesWithThemeMod.foo` */
  override def _to: PropInjector[WithTheme, ThemedComponentProps] = default
}
