package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalOverlayMod {
  
  @JSImport("material-ui/internal/Overlay", JSImport.Default)
  @js.native
  open class default ()
    extends Component[OverlayProps, js.Object, Any]
  
  type Overlay = Component[OverlayProps, js.Object, Any]
  
  trait OverlayProps extends StObject {
    
    var autoLockScrolling: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Overlay]] = js.undefined
    
    var show: Boolean
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object OverlayProps {
    
    inline def apply(show: Boolean): OverlayProps = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      inline def setAutoLockScrolling(value: Boolean): Self = StObject.set(x, "autoLockScrolling", value.asInstanceOf[js.Any])
      
      inline def setAutoLockScrollingUndefined: Self = StObject.set(x, "autoLockScrolling", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRef(value: LegacyRef[Overlay]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Overlay | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionEnabled(value: Boolean): Self = StObject.set(x, "transitionEnabled", value.asInstanceOf[js.Any])
      
      inline def setTransitionEnabledUndefined: Self = StObject.set(x, "transitionEnabled", js.undefined)
    }
  }
}
