package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchRippleMod {
  
  @JSImport("material-ui/internal/TouchRipple", JSImport.Default)
  @js.native
  class default ()
    extends Component[TouchRippleProps, js.Object, js.Any]
  
  @js.native
  trait TouchRipple
    extends Component[TouchRippleProps, js.Object, js.Any]
  
  trait TouchRippleProps
    extends StObject
       with Props[TouchRipple] {
    
    var abortOnScroll: js.UndefOr[Boolean] = js.undefined
    
    var centerRipple: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TouchRippleProps {
    
    inline def apply(): TouchRippleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TouchRippleProps]
    }
    
    extension [Self <: TouchRippleProps](x: Self) {
      
      inline def setAbortOnScroll(value: Boolean): Self = StObject.set(x, "abortOnScroll", value.asInstanceOf[js.Any])
      
      inline def setAbortOnScrollUndefined: Self = StObject.set(x, "abortOnScroll", js.undefined)
      
      inline def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
      
      inline def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
