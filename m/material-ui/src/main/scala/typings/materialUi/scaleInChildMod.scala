package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleInChildMod {
  
  @JSImport("material-ui/internal/ScaleInChild", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ScaleInChildProps, js.Object, Any]
  
  type ScaleInChild = Component[ScaleInChildProps, js.Object, Any]
  
  trait ScaleInChildProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var maxScale: js.UndefOr[Double] = js.undefined
    
    var minScale: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[ScaleInChild]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ScaleInChildProps {
    
    inline def apply(): ScaleInChildProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleInChildProps]
    }
    
    extension [Self <: ScaleInChildProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
      
      inline def setRef(value: LegacyRef[ScaleInChild]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ScaleInChild | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
