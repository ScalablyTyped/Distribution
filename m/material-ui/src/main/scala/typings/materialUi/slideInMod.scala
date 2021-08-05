package typings.materialUi

import typings.materialUi.MaterialUI.propTypes.direction
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideInMod {
  
  @JSImport("material-ui/internal/SlideIn", JSImport.Default)
  @js.native
  class default ()
    extends Component[SlideInProps, js.Object, js.Any]
  
  @js.native
  trait SlideIn
    extends Component[SlideInProps, js.Object, js.Any]
  
  trait SlideInProps
    extends StObject
       with Props[SlideIn] {
    
    var childStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var direction: js.UndefOr[typings.materialUi.MaterialUI.propTypes.direction] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SlideInProps {
    
    inline def apply(): SlideInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideInProps]
    }
    
    extension [Self <: SlideInProps](x: Self) {
      
      inline def setChildStyle(value: CSSProperties): Self = StObject.set(x, "childStyle", value.asInstanceOf[js.Any])
      
      inline def setChildStyleUndefined: Self = StObject.set(x, "childStyle", js.undefined)
      
      inline def setDirection(value: direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
