package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalScaleInMod {
  
  @JSImport("material-ui/internal/ScaleIn", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ScaleInProps, js.Object, Any]
  
  type ScaleIn = Component[ScaleInProps, js.Object, Any]
  
  trait ScaleInProps extends StObject {
    
    var childStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var maxScale: js.UndefOr[Double] = js.undefined
    
    var minScale: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[ScaleIn]] = js.undefined
  }
  object ScaleInProps {
    
    inline def apply(): ScaleInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleInProps]
    }
    
    extension [Self <: ScaleInProps](x: Self) {
      
      inline def setChildStyle(value: CSSProperties): Self = StObject.set(x, "childStyle", value.asInstanceOf[js.Any])
      
      inline def setChildStyleUndefined: Self = StObject.set(x, "childStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
      
      inline def setRef(value: LegacyRef[ScaleIn]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ScaleIn | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
