package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideInChildMod {
  
  @JSImport("material-ui/internal/SlideInChild", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SlideInChildProps, js.Object, Any]
  
  type SlideInChild = Component[SlideInChildProps, js.Object, Any]
  
  trait SlideInChildProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var getLeaveDirection: js.Function
    
    var ref: js.UndefOr[LegacyRef[SlideInChild]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SlideInChildProps {
    
    inline def apply(getLeaveDirection: js.Function): SlideInChildProps = {
      val __obj = js.Dynamic.literal(getLeaveDirection = getLeaveDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideInChildProps]
    }
    
    extension [Self <: SlideInChildProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setGetLeaveDirection(value: js.Function): Self = StObject.set(x, "getLeaveDirection", value.asInstanceOf[js.Any])
      
      inline def setRef(value: LegacyRef[SlideInChild]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ SlideInChild | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
