package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.transitionMod.TransitionProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fadeFadeMod extends Shortcut {
  
  @JSImport("@material-ui/core/Fade/Fade", JSImport.Default)
  @js.native
  val default: ComponentType[FadeProps] = js.native
  
  trait FadeProps
    extends StObject
       with TransitionProps {
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object FadeProps {
    
    @scala.inline
    def apply(): FadeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FadeProps]
    }
    
    @scala.inline
    implicit class FadePropsMutableBuilder[Self <: FadeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = ComponentType[FadeProps]
  
  /* This means you don't have to write `default`, but can instead just say `fadeFadeMod.foo` */
  override def _to: ComponentType[FadeProps] = default
}
