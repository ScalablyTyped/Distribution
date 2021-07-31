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
  
  @scala.inline
  def default(): PropInjector[WithTheme, ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropInjector[WithTheme, ThemedComponentProps]]
  
  /* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/withTheme.WithTheme> */
  trait ThemedComponentProps extends StObject {
    
    var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object ThemedComponentProps {
    
    @scala.inline
    def apply(): ThemedComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemedComponentProps]
    }
    
    @scala.inline
    implicit class ThemedComponentPropsMutableBuilder[Self <: ThemedComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait WithTheme extends StObject {
    
    var theme: Theme
  }
  object WithTheme {
    
    @scala.inline
    def apply(theme: Theme): WithTheme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithTheme]
    }
    
    @scala.inline
    implicit class WithThemeMutableBuilder[Self <: WithTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
