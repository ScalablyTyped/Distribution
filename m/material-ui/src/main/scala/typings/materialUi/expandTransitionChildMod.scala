package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandTransitionChildMod {
  
  @JSImport("material-ui/internal/ExpandTransitionChild", JSImport.Default)
  @js.native
  class default ()
    extends Component[ExpandTransitionChildProps, js.Object, js.Any]
  
  @js.native
  trait ExpandTransitionChild
    extends Component[ExpandTransitionChildProps, js.Object, js.Any]
  
  trait ExpandTransitionChildProps
    extends StObject
       with Props[ExpandTransitionChild] {
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionDelay: js.UndefOr[Double] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object ExpandTransitionChildProps {
    
    inline def apply(): ExpandTransitionChildProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandTransitionChildProps]
    }
    
    extension [Self <: ExpandTransitionChildProps](x: Self) {
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionDelay(value: Double): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      inline def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
}
