package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalExpandTransitionMod {
  
  @JSImport("material-ui/internal/ExpandTransition", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ExpandTransitionProps, js.Object, Any]
  
  type ExpandTransition = Component[ExpandTransitionProps, js.Object, Any]
  
  trait ExpandTransitionProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[ExpandTransition]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionDelay: js.UndefOr[Double] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object ExpandTransitionProps {
    
    inline def apply(): ExpandTransitionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpandTransitionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpandTransitionProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setRef(value: LegacyRef[ExpandTransition]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ExpandTransition | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionDelay(value: Double): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      inline def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
}
