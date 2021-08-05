package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.transitionMod.TransitionProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomZoomMod extends Shortcut {
  
  @JSImport("@material-ui/core/Zoom/Zoom", JSImport.Default)
  @js.native
  val default: ComponentType[ZoomProps] = js.native
  
  trait ZoomProps
    extends StObject
       with TransitionProps {
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object ZoomProps {
    
    inline def apply(): ZoomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomProps]
    }
    
    extension [Self <: ZoomProps](x: Self) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = ComponentType[ZoomProps]
  
  /* This means you don't have to write `default`, but can instead just say `zoomZoomMod.foo` */
  override def _to: ComponentType[ZoomProps] = default
}
