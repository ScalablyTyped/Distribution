package typings.materialUi

import typings.materialUi.MaterialUI.propTypes.direction
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideInMod {
  
  @JSImport("material-ui/internal/SlideIn", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SlideInProps, js.Object, Any]
  
  type SlideIn = Component[SlideInProps, js.Object, Any]
  
  trait SlideInProps extends StObject {
    
    var childStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var direction: js.UndefOr[typings.materialUi.MaterialUI.propTypes.direction] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[SlideIn]] = js.undefined
    
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
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDirection(value: direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setRef(value: LegacyRef[SlideIn]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ SlideIn | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
